package wqyangmanor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author wqyang
 * @version 1.0
 * @date 2021/1/17 20:10
 */
@SpringBootApplication
public class ConsumerMovieApplication {
  @Bean
  //RestTemplate是Spring提供的用于访问Rest服务的客户端，RestTemplate提供了多种便捷访问远程Http服务的方法,能够大大提高客户端的编写效率。
  public RestTemplate restTemplate(){
    return new RestTemplate();
  }

  public static void main(String[] args){
    SpringApplication.run(ConsumerMovieApplication.class,args);
  }
}
