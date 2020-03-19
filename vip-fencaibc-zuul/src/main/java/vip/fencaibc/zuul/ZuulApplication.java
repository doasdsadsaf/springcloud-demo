package vip.fencaibc.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication {
    /**
     * zuul 可以通过http://localhost:9003/vip-ribbon-a/aa
     * http://Zuul Ip : Zull port : 微服务id/path
     * 访问到vip.fencaibc.hystrix.clinet.a.controller.PortController.aa的方法
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class);
        System.out.println("===========ZuulApplication启动成功===========");
    }
}
