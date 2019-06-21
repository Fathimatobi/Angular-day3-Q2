package com.example.demo;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lms4Application implements CommandLineRunner {
 
  @Resource
  StorageService storageService;
 
  public static void main(String[] args) {
    SpringApplication.run(Lms4Application.class, args);
  }
 
  @Override
  public void run(String... arg) throws Exception {
    storageService.deleteAll();
    storageService.init();
  }
}