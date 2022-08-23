package com.ConnectTest.ConnectTest;

import com.ConnectTest.ConnectTest.data.JsonData;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value = "/", produces = {MediaType.APPLICATION_JSON_VALUE})
public class Controller {

    private final Map<String, String> testContents = new HashMap<>();

    @GetMapping("/")
    public ResponseEntity Test() {
        System.out.println("[응답 테스트]");

        return new ResponseEntity<>(testContents, HttpStatus.OK);
    }

    @PostConstruct
    public void init() {
        JsonData jsonData = new JsonData();
        jsonData.setKey("test");
        jsonData.setValue("success");

        testContents.put(jsonData.getKey(), jsonData.getValue());
    }
}
