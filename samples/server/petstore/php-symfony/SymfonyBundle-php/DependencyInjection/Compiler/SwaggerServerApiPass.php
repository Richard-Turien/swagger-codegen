<?php
/**
 * SwaggerServerApiPass
 *
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Server\DependencyInjection\Compiler
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * Swagger Petstore
 *
 * This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 *
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace Swagger\Server\DependencyInjection\Compiler;

use Symfony\Component\DependencyInjection\Compiler\CompilerPassInterface;
use Symfony\Component\DependencyInjection\ContainerBuilder;
use Symfony\Component\DependencyInjection\Reference;

/**
 * SwaggerServerApiPass Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Server\DependencyInjection\Compiler
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class SwaggerServerApiPass implements CompilerPassInterface
{

    /**
     * You can modify the container here before it is dumped to PHP code.
     *
     * @param ContainerBuilder $container
     */
    public function process(ContainerBuilder $container) {
        // always first check if the primary service is defined
        if (!$container->has('swagger_server.api.api_server')) {
            return;
        }

        $definition = $container->findDefinition('swagger_server.api.api_server');

        // find all service IDs with the swagger_server.api tag
        $taggedServices = $container->findTaggedServiceIds('swagger_server.api');

        foreach ($taggedServices as $id => $tags) {
            foreach ($tags as $tag) {
                // add the transport service to the ChainTransport service
                $definition->addMethodCall('addApiHandler', [$tag['api'], new Reference($id)]);
            }
        }
    }
}
