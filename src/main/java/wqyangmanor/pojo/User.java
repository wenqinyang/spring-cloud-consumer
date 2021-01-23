package wqyangmanor.pojo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author wqyang
 * @version 1.0
 * @date 2021/1/17 20:05
 */
@Data
public class User {

  private Long id;
  private String username;
  private String name;
  private Integer age;
  private BigDecimal balance;
}
