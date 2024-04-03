package geek.wys.kafkaconsumer.repository;

import geek.wys.kafkaconsumer.models.Employee;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @author shem.mwangi
 * @since 03/04/2024
 **/
@Repository
public interface KafkaEmployeeRepository extends ElasticsearchRepository<Employee, String> {
}
