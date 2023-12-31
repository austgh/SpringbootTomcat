package com.example.springboottomcat;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author think
 * @date 2023年09月13日 17:23
 */
@Slf4j
@RestController
public class TestController {

    @GetMapping("/getTest")
    public void getTest(int num) throws Exception {

        log.info("{} 接受到请求:num={}", Thread.currentThread().getName(), num);
        TimeUnit.HOURS.sleep(1);
    }
}

