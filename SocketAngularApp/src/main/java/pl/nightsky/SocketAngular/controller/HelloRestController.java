package pl.nightsky.SocketAngular.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
public class HelloRestController {

    @RequestMapping("/api/resource")
    public Map<String,Object> home() {
        Map<String,Object> model = new HashMap<String,Object>();
        model.put("id", UUID.randomUUID().toString());
        model.put("content", "Get some UUID: ");
        return model;
    }

    @RequestMapping("/api/greeting")
    public Map<String,Object> greeting() {
        Map<String,Object> model = new HashMap<String,Object>();
        model.put("content", "No elo!");
        return model;
    }

    @RequestMapping("/api/test")
    public String test() {
        return "TEST";
    }

}