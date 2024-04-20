package geek.wys.kafkaconsumer;

import geek.wys.kafkaconsumer.models.Employee;
import geek.wys.kafkaconsumer.service.KafkaEmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.kafka.annotation.KafkaListener;

/**
 * @author shem.mwangi
 * @since 03/04/2024
 **/
@Slf4j
@SpringBootApplication
public class KafkaConsumerApplication {

    private final KafkaEmployeeService kafkaEmployeeService;

    public KafkaConsumerApplication(KafkaEmployeeService kafkaEmployeeService) {
        this.kafkaEmployeeService = kafkaEmployeeService;
    }


    public static void main(String[] args) {
        SpringApplication.run(KafkaConsumerApplication.class, args);
    }

    @KafkaListener(topics = "geekwys-employees", groupId = "geekwys")
    public void listen(Employee employee) {
        log.info("Received Employee information: {}", employee);
        kafkaEmployeeService.saveEmployee(employee);
    }

}
