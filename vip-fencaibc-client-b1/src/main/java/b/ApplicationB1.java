package b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ApplicationB1 {

/*    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }*/

    public static void main(String[] args) {
        SpringApplication.run(ApplicationB1.class);
        System.out.println("======ApplicationA启动成功==========");
    }
}
