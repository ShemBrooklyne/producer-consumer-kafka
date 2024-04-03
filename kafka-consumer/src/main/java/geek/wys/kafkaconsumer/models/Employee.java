package geek.wys.kafkaconsumer.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * @author shem.mwangi
 * @since 03/04/2024
 **/
@Document(indexName = "kafka-employee")
public record Employee(
        @Id
        Long id,
        @Field(type = FieldType.Text, name = "firstName")
        String firstName,
        @Field(type = FieldType.Text, name = "lastName")
        String lastName,
        @Field(type = FieldType.Text, name = "identificationNumber")

        String identificationNumber,
        @Field(type = FieldType.Nested, name = "department")

        Department department
) {
}
