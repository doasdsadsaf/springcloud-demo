package vip.fencai.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vip.fencai.feign.OrderFeignClient;

import java.util.Map;

@RestController
public class MerchantController {

    @Autowired
    private OrderFeignClient orderFeignClient;

    @RequestMapping("/merchant/order")
    public Map<String,Object> order(){
        Map<String, Object> order = orderFeignClient.order();
        order.put("note2","我来自东北");
        return order;
    }
}
