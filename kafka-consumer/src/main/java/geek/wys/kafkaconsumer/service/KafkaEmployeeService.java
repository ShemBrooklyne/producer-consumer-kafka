package geek.wys.kafkaconsumer.service;

import geek.wys.kafkaconsumer.models.Employee;
import geek.wys.kafkaconsumer.repository.KafkaEmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author shem.mwangi
 * @since 03/04/2024
 **/
@Slf4j
@Service
public class KafkaEmployeeService {

    private final KafkaEmployeeRepository kafkaEmployeeRepository;

    public KafkaEmployeeService(KafkaEmployeeRepository kafkaEmployeeRepository) {
        this.kafkaEmployeeRepository = kafkaEmployeeRepository;
    }


    public void saveEmployee(Employee employee) {
        log.info("Save kafka consumer message to elastic-search: {}", employee);
        kafkaEmployeeRepository.save(employee);
    }

    public Iterable<Employee> findAllEmployees() {
        return kafkaEmployeeRepository.findAll();
    }
}
