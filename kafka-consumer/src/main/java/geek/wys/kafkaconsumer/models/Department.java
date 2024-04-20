package geek.wys.kafkaconsumer.models;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.List;

/**
 * @author shem.mwangi
 * @since 03/04/2024
 **/
public record Department(
        @Field(type = FieldType.Text, name = "departmentName")
        String departmentName,
        @Field(type = FieldType.Auto, name = "products")
        List<String> products
) {
}
