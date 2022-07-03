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
public class TestRabbitMqDirect {


    //https://www.youtube.com/watch?v=deG25y_r6OY
    // AMQP STANDARDIZES messsaging Producesrs, Broker Consumers



    @Autowired
    private RabbitTemplate rabbitTemplate;

    //IF THIS EXCHANGE DOESN'T EXIST (none tried to listen in)  - (reply-code=404, reply-text=NOT_FOUND - no exchange 'unexcitingExchange' in vhost '/', class-id=60, method-id=40)
    @Test
    void unexcitingExchange() {
        rabbitTemplate.convertAndSend("unexcitingExchange", "r1", new Dto("string"));
    }


    @Test
    void testExchanges() throws InterruptedException {


        //direct1 key1 directExt1 Dto(field=string)
        //direct2 key2 directExt1 Dto(field=string)
        rabbitTemplate.convertAndSend("directExt1", "key1", new Dto("string"));
        rabbitTemplate.convertAndSend("directExt1", "key1", new Dto("string"));
        rabbitTemplate.convertAndSend("directExt1", "key1", new Dto("string"));
        rabbitTemplate.convertAndSend("directExt1", "key1", new Dto("string"));

        //direct2 key1 directExt1 Dto(field=string2)
        //direct1 key2 directExt1 Dto(field=string2)
        rabbitTemplate.convertAndSend("directExt1", "key2", new Dto("string2"));

        //direct1 key2 directExt2 Dto(field=string3)
        //direct2 key2 directExt2 Dto(field=string3)
        rabbitTemplate.convertAndSend("directExt1", "key2", new Dto("string3"));

        //direct1 key1 directExt2 Dto(field=string4)
        //direct2 key1 directExt2 Dto(field=string4)
        rabbitTemplate.convertAndSend("directExt1", "key1", new Dto("string4"));

        //direct2 key2 directExt1 Dto(field=string5)
        //direct2 key1 directExt1 Dto(field=string6)
        rabbitTemplate.convertAndSend("directExt1", "key2", new Dto("string5"));

        //direct1 key1 directExt1 Dto(field=string5)
        //direct1 key2 directExt1 Dto(field=string6)
        rabbitTemplate.convertAndSend("directExt1", "key2", new Dto("string6"));

    }
}
