package wqyangmanor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import wqyangmanor.pojo.User;

/**
 * @author wqyang
 * @version 1.0
 * @date 2021/1/17 20:08
 */
@RestController
public class MovieController {

  @Autowired
  private RestTemplate restTemplate;

  @GetMapping("/user/{id}")
  public User findById(@PathVariable Long id){
    return this.restTemplate.getForObject("http://127.0.0.1:8010/" + id,User.class);
  }
}
