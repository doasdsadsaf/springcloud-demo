package vip.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 注册eureka客户端
 */
@SpringBootApplication
public class EurekaClientApp {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApp.class);
        System.out.println("=====client启动成功===========");
    }
}
