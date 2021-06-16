package cn.wisefly.park;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class ParkApplication {

  public static void main(String[] args) {
    SpringApplication.run(ParkApplication.class);
  }
}
