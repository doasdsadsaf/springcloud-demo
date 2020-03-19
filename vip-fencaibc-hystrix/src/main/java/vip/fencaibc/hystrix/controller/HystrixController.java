package vip.fencaibc.hystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixController {

    @GetMapping(value = "/hello")
    @HystrixCommand(fallbackMethod = "hystrixHello")
    public String hello(){
        /**
         * 如果把异常不注释掉 会执行下面的hystrixHello方法
         */
        // throw new RuntimeException("xxx");

        return "没有问题";

    }
    public String hystrixHello(){
        return "hystrixHelloWord";
    }
}
