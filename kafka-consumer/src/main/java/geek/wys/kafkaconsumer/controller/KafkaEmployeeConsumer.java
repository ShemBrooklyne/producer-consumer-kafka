package geek.wys.kafkaconsumer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class KafkaEmployeeConsumer {

    @GetMapping("/getElasticEmployeeFromKafka")
    public Iterable<Object> finaAllEmployees() {
        log.info("Employees iterated by elastic search:");
        return null;
    }
}
