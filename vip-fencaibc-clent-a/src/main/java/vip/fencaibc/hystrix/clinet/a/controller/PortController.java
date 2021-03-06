package vip.fencaibc.hystrix.clinet.a.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
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

    @GetMapping("/aa")
    public Map<String,Object> aa(){
        Map<String,Object> result = new HashMap<>();
        result.put("aa","aa");
        return result;
    }

}
