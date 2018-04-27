package io.swagger.server.infrastructure

import io.ktor.application.*
import io.ktor.auth.*
import io.ktor.request.*
import io.ktor.response.*

enum class ApiKeyLocation(val location: String) {
    QUERY("query"),
    HEADER("header")
}

data class ApiKey(val value: String) : Credential
data class ApiPrincipal(val apiKey: ApiKey?) : Principal

fun ApplicationCall.apiKey(key: String, keyLocation: ApiKeyLocation = ApiKeyLocation.valueOf("header")): ApiKey? =
    request.apiKey(key, keyLocation)

fun ApplicationRequest.apiKey(key: String, keyLocation: ApiKeyLocation = ApiKeyLocation.valueOf("header")): ApiKey? {
    val value: String? = when (keyLocation) {
        ApiKeyLocation.QUERY -> this.queryParameters[key]
        ApiKeyLocation.HEADER -> this.headers[key]
    }
    when (value) {
        null -> return null
        else -> return ApiKey(value)
    }
}

class ApiKeyAuthenticationProvider(name: String?) : AuthenticationProvider(name) {
    lateinit var apiKeyName: String
    lateinit var authLocation: String
    internal lateinit var validateBody: suspend (ApiKey) -> ApiPrincipal?

    fun validate(body: suspend (ApiKey) -> ApiPrincipal?) {
        validateBody = body
    }
}

fun Authentication.Configuration.apiKey(name: String? = null, configure: ApiKeyAuthenticationProvider.() -> Unit) {
    val provider = ApiKeyAuthenticationProvider(name).apply(configure)
    provider.pipeline.intercept(AuthenticationPipeline.RequestAuthentication) { context ->

        val credentials = call.request.apiKey(
            provider.apiKeyName,
            ApiKeyLocation.values().first { it.location == provider.authLocation })
        val principal = credentials?.let { provider.validateBody(it) }

        val cause = when {
            credentials == null -> AuthenticationFailedCause.NoCredentials
            principal == null -> AuthenticationFailedCause.InvalidCredentials
            else -> null
        }

        if (cause != null) {
            context.challenge(provider.apiKeyName, cause) {
                // TODO: Verify correct response structure here.
                call.respond(
                    UnauthorizedResponse(
                        HttpAuthHeader.Parameterized(
                            "API_KEY",
                            mapOf("key" to provider.apiKeyName),
                            HeaderValueEncoding.QUOTED_ALWAYS
                        )
                    )
                )
                it.complete()
            }
        }
        if (principal != null) {
            context.principal(principal)
        }
    }
    register(provider)
}
