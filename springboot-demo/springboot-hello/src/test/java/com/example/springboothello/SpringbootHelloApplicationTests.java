package com.example.springboothello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootHelloApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println("Hello Spring Boot 2.0!");
    }

}
