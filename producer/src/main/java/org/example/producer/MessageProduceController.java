package org.example.producer;

import lombok.RequiredArgsConstructor;
import org.example.producer.model.MessageDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/kafka")
public class MessageProduceController {
    private final MessageProduceService messageProduceService;

    /*
    @GetMapping("/send")
    public void send(String topic, String message) {
        messageProduceService.sendMessage(topic, message);
    }
    */

    @GetMapping("/send")
    public void send(@RequestBody MessageDto.Abcd dto) {
        messageProduceService.sendDto("abcd", dto);
    }
}
