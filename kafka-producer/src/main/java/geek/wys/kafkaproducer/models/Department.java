package geek.wys.kafkaproducer.models;

import java.util.List;

/**
 * @author shem.mwangi
 * @since 03/04/2024
 **/
public record Department(
        String departmentName,
        List<String> products
) {
}
