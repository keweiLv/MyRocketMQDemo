package com.kezi.producer;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Kezi
 * @Date: 2021/12/18 0:33
 */

@RestController
public class Producer {
    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    @GetMapping("/send")
    public void send(){
        rocketMQTemplate.convertAndSend("first-topic","Hello,消息队列！");
    }
}
