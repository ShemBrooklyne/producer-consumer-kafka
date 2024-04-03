package geek.wys.kafkaproducer.models;

/**
 * @author shem.mwangi
 * @since 03/04/2024
 **/
public record Employee(
        Long id,
        String firstName,
        String lastName,
        String identificationNumber,
        Department department
) {
}
