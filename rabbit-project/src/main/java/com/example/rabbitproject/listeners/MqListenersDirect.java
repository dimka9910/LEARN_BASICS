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
public class MqListenersDirect {


    @RabbitListener(containerFactory = "rabbitListenerContainerFactory",
            bindings = @QueueBinding(value = @Queue(name = "direct1"),
                    key = "key1",
                    exchange = @Exchange(value = "directExt1", type = ExchangeTypes.DIRECT)
            ))
    public void processQueue11(Dto dto) {
        System.out.println("direct1 key1 directExt1 " + dto);
    }

    @RabbitListener(containerFactory = "rabbitListenerContainerFactory",
            bindings = @QueueBinding(value = @Queue(name = "direct1"),
                    key = "key1",
                    exchange = @Exchange(value = "directExt2", type = ExchangeTypes.DIRECT)
            ))
    public void processQueue(Dto dto) {
        System.out.println("direct1 key1 directExt2 " + dto);
    }


}
