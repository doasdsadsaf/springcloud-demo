package vip.fencai.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class FeignClientApp {

    public static void main(String[] args) {
        SpringApplication.run(FeignClientApp.class);
        System.out.println("=====FeignClientApp启动成功===========");
    }
}
