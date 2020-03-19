package vip.fencaibc.hystrix.controller;

import com.netflix.hystrix.strategy.concurrency.HystrixRequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import vip.fencaibc.hystrix.service.CollapserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@RestController
public class CollapserController {
    @Autowired
    private CollapserService collapserService;

    @GetMapping("/list")
    public List<Integer> getstore1ist() throws ExecutionException, InterruptedException {
        // 开启上下文 很重要
        HystrixRequestContext context = HystrixRequestContext.initializeContext();
        //future很重要
        Future<Integer> store1 =
                collapserService.getStore(new Random().nextInt());
        // 停留两秒
    //    Thread.sleep(2000);
        Future<Integer> store2 =
                collapserService.getStore(new Random().nextInt());

        List<Integer> result = new ArrayList<>();
        result.add(store1.get());
        System.out.println("store1=" + result.get(0));
        result.add(store2.get());
        System.out.println("store2=" + result.get(0));
        return result;

    }
}
