package client.b2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PortController {
    @Value("${server.port}")
    Integer port;

    @RequestMapping("/b")
    public Map<String,Object> b(){
        Map<String,Object> result = new HashMap<>();
        result.put("date",System.currentTimeMillis());
        result.put("port",port);
        return result;
    }
}
