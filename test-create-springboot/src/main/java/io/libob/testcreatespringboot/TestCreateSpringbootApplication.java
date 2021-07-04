package io.libob.testcreatespringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@SpringBootApplication
public class TestCreateSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestCreateSpringbootApplication.class, args);
    }


    @GetMapping("/hello")
    public String hello(@RequestParam Integer id) {

        return id.toString();
    }

}
