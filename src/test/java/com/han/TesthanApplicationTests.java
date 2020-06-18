package com.han;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@MapperScan(basePackages = "com.han")
class TesthanApplicationTests {

    @Test
    void contextLoads() {
    }

}
