package com.example.redis.entity;

import java.io.Serializable;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@Data
@RedisHash("product")
public class Product implements Serializable {

  @Id
  private Long id;

  private String username;

  private String firstName;

  private String lastName;

}
