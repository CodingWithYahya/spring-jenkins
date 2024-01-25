package com.yahyatechie.jenkins.api;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SpringJenkinsApplicationTest {

    public static final Logger logger = LoggerFactory.getLogger(SpringJenkinsApplicationTest.class);

    @Test
    void contextLoads() {
        logger.info("it's a test class logger");
        assertEquals(true, true );
    }
}