package dev.shermende.listener;

import dev.shermende.binding.PayloadFlow;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PayloadListener {

    @StreamListener(PayloadFlow.INPUT)
    public void input(Message<?> message) {
        log.info("{}", message);
    }

}
