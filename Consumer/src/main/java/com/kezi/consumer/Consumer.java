package com.kezi.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

/**
 * @Author: Kezi
 * @Date: 2021/12/18 0:48
 */

@Component
@RocketMQMessageListener(topic = "first-topic",consumerGroup = "my-consumer-group")
@Slf4j
public class Consumer implements RocketMQListener<String> {
    @Override
    public void onMessage(String message) {
        System.out.println("收到消息:"+ message);
    }
}
