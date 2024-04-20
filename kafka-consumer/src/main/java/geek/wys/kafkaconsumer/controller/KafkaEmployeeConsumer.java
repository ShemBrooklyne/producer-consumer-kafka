package geek.wys.kafkaconsumer.controller;

import geek.wys.kafkaconsumer.models.Employee;
import geek.wys.kafkaconsumer.service.KafkaEmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shem.mwangi
 * @since 03/04/2024
 **/
@Slf4j
@RestController
public class KafkaEmployeeConsumer {

    private final KafkaEmployeeService kafkaEmployeeService;

    public KafkaEmployeeConsumer(KafkaEmployeeService kafkaEmployeeService) {
        this.kafkaEmployeeService = kafkaEmployeeService;
    }


    @GetMapping("/getElasticEmployeeFromKafka")
    public Iterable<Employee> finaAllEmployees() {
        Iterable<Employee> allEmployees = kafkaEmployeeService.findAllEmployees();
        log.info("Employees iterated by elastic search: {}", allEmployees);
        return allEmployees;
    }

}
