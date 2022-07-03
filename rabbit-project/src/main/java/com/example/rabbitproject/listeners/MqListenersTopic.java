package com.example.rabbitproject.listeners;

import com.example.rabbitproject.Dto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MqListenersTopic {

    @RabbitListener(containerFactory = "rabbitListenerContainerFactory",
            bindings = @QueueBinding(value = @Queue(name = "topic1"),
                    key = "notification.service.status.rshb.*",
                    exchange = @Exchange(value = "topicExt1", type = ExchangeTypes.TOPIC)
            ))
    public void processQueue1(Dto dto) {
        System.out.println("1 " + dto);
    }

    @RabbitListener(containerFactory = "rabbitListenerContainerFactory",
            bindings = @QueueBinding(value = @Queue(name = "topic2"),
                    key = "notification.service.status.rshb.app",
                    exchange = @Exchange(value = "topicExt1", type = ExchangeTypes.TOPIC)
            ))
    public void processQueue2(Dto dto) {
        System.out.println("2" + dto);
    }

    @RabbitListener(containerFactory = "rabbitListenerContainerFactory",
            bindings = @QueueBinding(value = @Queue(name = "topic3"),
                    key = "notification.service.status.*.app",
                    exchange = @Exchange(value = "topicExt1", type = ExchangeTypes.TOPIC)
            ))
    public void processQueue3(Dto dto) {
        System.out.println("3" + dto);
    }




}
