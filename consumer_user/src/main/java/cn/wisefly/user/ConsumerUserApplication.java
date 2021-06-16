package cn.wisefly.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@MapperScan("cn.wisefly.user.mapper")
@EnableEurekaClient
public class ConsumerUserApplication {

  public static void main(String[] args) {
    SpringApplication.run(ConsumerUserApplication.class);
  }

  @Bean
  public RestTemplate getRestTemplate() {
    return new RestTemplate();
  }


}
