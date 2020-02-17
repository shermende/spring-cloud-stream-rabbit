package dev.shermende.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SinkListener {

    @StreamListener(Sink.INPUT)
    public void input(Message<?> message) {
        log.info("{}", message);
    }

}
