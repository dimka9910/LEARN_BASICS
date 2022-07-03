package com.example.rabbitproject.app.requests;

import com.example.rabbitproject.Dto;
import com.example.rabbitproject.app.TestConfig;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@SpringBootTest
@Import(TestConfig.class)
public class TestRabbitMqTopic {


    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    void unexcitingExchange() {
        rabbitTemplate.convertAndSend("topicExt1", "notification.service.status.rshb.app", new Dto("string1"));
        rabbitTemplate.convertAndSend("topicExt1", "notification.service.status.rshb1.app", new Dto("string2"));
        rabbitTemplate.convertAndSend("topicExt1", "notification.service.status.rshb.app1", new Dto("string3"));

// 1 notification.service.status.rshb.#
// 2 notification.service.status.rshb.app
// 3 notification.service.status.*.app


//        1 Dto(field=string1)
//        2Dto(field=string1)
//        3Dto(field=string1)

//        3Dto(field=string2)

//        1 Dto(field=string3)
    }
}
