package vip.fencai.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
@FeignClient("fencaibc-feign-client")
public interface OrderFeignClient {

    @PostMapping(value = "/order")
    Map<String,Object> order();
}
