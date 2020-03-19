package vip.fencaibc.hystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCollapser;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Future;

@Service
public class CollapserService {

    @HystrixCollapser(batchMethod = "getStoreList",
    collapserProperties = {
            // 配置合并时间
            @HystrixProperty(name = "timerDelayInMilliseconds",
            value = "1000")
    })

    public Future<Integer> getStore(Integer id){
        return null;
    }

    @HystrixCommand
    public List<Integer> getStoreList(List<Integer> id) {
        System.out.println("合并请求调用 入参集合数量"+id.size());
        List<Integer> result = new ArrayList<>();
        for(Integer i :id){
            Integer rand = new Random().nextInt();
            System.out.println("合并请求调用 输出"+rand);
            result.add(rand);
        }
        return result;
    }
}
