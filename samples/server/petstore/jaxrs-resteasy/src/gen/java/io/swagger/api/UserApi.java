package io.swagger.api;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import io.swagger.api.factories.UserApiServiceFactory;
import io.swagger.model.User;

@Path("/user")


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-04-29T00:20:47.240+08:00")
public class UserApi {
    private final UserApiService delegate = UserApiServiceFactory.getUserApi();

    @POST


    @Produces({"application/xml", "application/json"})
    public Response createUser(User body, @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.createUser(body, securityContext);
    }

    @POST
    @Path("/createWithArray")

    @Produces({"application/xml", "application/json"})
    public Response createUsersWithArrayInput(List<User> body, @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.createUsersWithArrayInput(body, securityContext);
    }

    @POST
    @Path("/createWithList")

    @Produces({"application/xml", "application/json"})
    public Response createUsersWithListInput(List<User> body, @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.createUsersWithListInput(body, securityContext);
    }

    @DELETE
    @Path("/{username}")

    @Produces({"application/xml", "application/json"})
    public Response deleteUser(@PathParam("username") String username, @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.deleteUser(username, securityContext);
    }

    @GET
    @Path("/{username}")

    @Produces({"application/xml", "application/json"})
    public Response getUserByName(@PathParam("username") String username, @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.getUserByName(username, securityContext);
    }

    @GET
    @Path("/login")

    @Produces({"application/xml", "application/json"})
    public Response loginUser(@QueryParam("username") String username, @QueryParam("password") String password, @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.loginUser(username, password, securityContext);
    }

    @GET
    @Path("/logout")

    @Produces({"application/xml", "application/json"})
    public Response logoutUser(@Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.logoutUser(securityContext);
    }

    @PUT
    @Path("/{username}")

    @Produces({"application/xml", "application/json"})
    public Response updateUser(@PathParam("username") String username, User body, @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.updateUser(username, body, securityContext);
    }
}
