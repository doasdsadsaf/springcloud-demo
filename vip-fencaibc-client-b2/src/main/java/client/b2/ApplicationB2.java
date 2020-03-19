package client.b2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationB2 {

/*    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }*/

    public static void main(String[] args) {
        SpringApplication.run(ApplicationB2.class);
        System.out.println("======ApplicationB2启动成功==========");
    }
}
