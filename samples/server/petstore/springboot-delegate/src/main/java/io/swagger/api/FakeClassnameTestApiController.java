package io.swagger.api;

import io.swagger.model.Client;

import io.swagger.annotations.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Controller
public class FakeClassnameTestApiController implements FakeClassnameTestApi {

    private final Logger log = LoggerFactory.getLogger(AnotherFakeApiController.class);

    private final ObjectMapper objectMapper;

    public FakeClassnameTestApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    private final FakeClassnameTestApiDelegate delegate;

    @org.springframework.beans.factory.annotation.Autowired
    public FakeClassnameTestApiController(FakeClassnameTestApiDelegate delegate) {
        this.delegate = delegate;
    }

    public ResponseEntity<Client> testClassname(@ApiParam(value = "client model" ,required=true )  @Valid @RequestBody Client body) {
        // do some magic!
        return delegate.testClassname(body);
    }

}
