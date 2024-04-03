package geek.wys.kafkaproducer.service;

import geek.wys.kafkaproducer.models.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shem.mwangi
 * @since 03/04/2024
 **/
@Slf4j
@Service
public class KafkaEmployeeService {

    private static final String KAFKA_TOPIC = "geekwys-employees";
    private final KafkaTemplate<String, Employee> kafkaTemplate;

    public KafkaEmployeeService(KafkaTemplate<String, Employee> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(Employee employee) {
        log.info("Sending Employee Json Serializer : {}", employee);
        kafkaTemplate.send(KAFKA_TOPIC, employee);
    }

    public void sendList(List<Employee> employeeList) {
        log.info("Sending Employees List Json Serializer : {}", employeeList);
        for (Employee employee : employeeList) {
            kafkaTemplate.send(KAFKA_TOPIC, employee);
        }
    }
}
