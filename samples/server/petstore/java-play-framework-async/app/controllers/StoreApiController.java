package controllers;

import java.util.Map;
import apimodels.Order;

import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import swagger.SwaggerUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import play.libs.concurrent.HttpExecutionContext;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.CompletableFuture;

import javax.validation.constraints.*;
import play.Configuration;

import swagger.SwaggerUtils.ApiAction;


public class StoreApiController extends Controller {

    private final StoreApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Configuration configuration;
    private HttpExecutionContext executionContext;

    @Inject
    private StoreApiController(Configuration configuration, StoreApiControllerImpInterface imp, HttpExecutionContext executionContext) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
        this.executionContext = executionContext;
    }


    @ApiAction
    public CompletionStage<Result> deleteOrder(String orderId) throws Exception {
        return CompletableFuture.supplyAsync(() -> {
            imp.deleteOrder(orderId);
            return ok();
        }, executionContext.current());
    }

    @ApiAction
    public CompletionStage<Result> getInventory() throws Exception {
        CompletionStage<Map<String, Integer>> stage = imp.getInventory().thenApplyAsync(obj -> { 
            return obj;
        }, executionContext.current());
        stage.thenApplyAsync(obj -> {
            JsonNode result = mapper.valueToTree(obj);
            return ok(result);
        }, executionContext.current());
    }

    @ApiAction
    public CompletionStage<Result> getOrderById( @Min(1) @Max(5)Long orderId) throws Exception {
        CompletionStage<Order> stage = imp.getOrderById(orderId).thenApplyAsync(obj -> { 
            if (configuration.getBoolean("useOutputBeanValidation")) {
                SwaggerUtils.validate(obj);
            }
            return obj;
        }, executionContext.current());
        stage.thenApplyAsync(obj -> {
            JsonNode result = mapper.valueToTree(obj);
            return ok(result);
        }, executionContext.current());
    }

    @ApiAction
    public CompletionStage<Result> placeOrder() throws Exception {
        JsonNode nodebody = request().body().asJson();
        Order body;
        if (nodebody != null) {
            body = mapper.readValue(nodebody.toString(), Order.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                SwaggerUtils.validate(body);
            }
        } else {
            throw new IllegalArgumentException("'body' parameter is required");
        }
        CompletionStage<Order> stage = imp.placeOrder(body).thenApplyAsync(obj -> { 
            if (configuration.getBoolean("useOutputBeanValidation")) {
                SwaggerUtils.validate(obj);
            }
            return obj;
        }, executionContext.current());
        stage.thenApplyAsync(obj -> {
            JsonNode result = mapper.valueToTree(obj);
            return ok(result);
        }, executionContext.current());
    }
}
