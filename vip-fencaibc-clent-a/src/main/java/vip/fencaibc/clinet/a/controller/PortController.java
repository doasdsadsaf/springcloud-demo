package vip.fencaibc.clinet.a.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
public class PortController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/a")
    public Map<String,Object> a(){
        String url = "http://vip-ribbon-b/b";
        Map<String,Object> result = restTemplate.getForObject(url,Map.class);
        return result;
    }
}
