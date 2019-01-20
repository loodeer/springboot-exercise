package com.loodeer.springbootredis;

import com.loodeer.springbootredis.repository.RedisDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootRedisApplicationTests {

    public static Logger logger = LoggerFactory.getLogger(SpringbootRedisApplicationTests.class);

    @Autowired
    RedisDao redisDao;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testRedis() {
        redisDao.setKey("name", "loodeer");
        redisDao.setKey("age", "18");
        logger.info("name is " + redisDao.getValue("name"));
        logger.info("age is " + redisDao.getValue("age"));
    }

}

