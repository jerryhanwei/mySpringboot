package com.han;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest

class TesthanApplicationTests {

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    RedisTemplate redisTemplate;


    @Test
    void contextLoads() {
        stringRedisTemplate.opsForValue().append("hanmsg","hanwei");
    }

}
