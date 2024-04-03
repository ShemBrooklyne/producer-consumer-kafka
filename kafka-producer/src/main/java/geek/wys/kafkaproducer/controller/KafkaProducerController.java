package geek.wys.kafkaproducer.controller;

import geek.wys.kafkaproducer.models.Employee;
import geek.wys.kafkaproducer.service.KafkaEmployeeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author shem.mwangi
 * @since 03/04/2024
 **/
@RestController
public class KafkaProducerController {

    final KafkaEmployeeService kafkaEmployeeService;

    public KafkaProducerController(KafkaEmployeeService kafkaEmployeeService) {
        this.kafkaEmployeeService = kafkaEmployeeService;
    }

    @PostMapping("/producer")
    public String sendMessage(@RequestBody Employee employee) {
        kafkaEmployeeService.send(employee);
        return "Message sent successfully to Kafka topic.";
    }

    @PostMapping("/producerList")
    public String sendMessageAsList(@RequestBody List<Employee> employeeList) {
        kafkaEmployeeService.sendList(employeeList);
        return "Message sent successfully as list to Kafka topic.";
    }
}
