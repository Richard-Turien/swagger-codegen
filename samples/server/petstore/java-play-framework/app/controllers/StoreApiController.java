package controllers;

import java.util.Map;
import apimodels.Order;

import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.IOException;
import swagger.SwaggerUtils;
import javafx.util.Pair;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;


public class StoreApiController extends Controller {

    private StoreApiControllerImp imp;
    private ObjectMapper mapper;

    @Inject
    private StoreApiController(StoreApiControllerImp imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
    }


    public Result deleteOrder(String orderId)  {
        imp.deleteOrder(orderId);
        
        return ok();
    }

    public Result getInventory()  {
        Map<String, Integer> obj = imp.getInventory();
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
        
    }

    public Result getOrderById(String orderId)  {
        Order obj = imp.getOrderById(orderId);
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
        
    }

    public Result placeOrder() throws IOException {
        JsonNode nodebody = request().body().asJson();
        Order body;
        if (nodebody != null) {
            body = mapper.readValue(nodebody.toString(), Order.class);
        
        } else {
            body = null;
        }
        Order obj = imp.placeOrder(body);
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
        
    }
}
