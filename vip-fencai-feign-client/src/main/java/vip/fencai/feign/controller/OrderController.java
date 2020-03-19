package vip.fencai.feign.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class OrderController {

    @RequestMapping(value = "/order")
    public Map<String,Object> order(){
        Map<String,Object> order = new HashMap<>();
        order.put("orderId",System.currentTimeMillis());
        order.put("merchantId",System.currentTimeMillis());
        order.put("mote","mote出动");
        order.put("mote2","mote2222出动");
        return order;
    }
}
