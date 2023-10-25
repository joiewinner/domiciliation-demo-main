package bj.dgb.finances.domiciliation.models.agent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Person {

    protected String lastname;
    protected String firstname;
    protected Gender gender;
    protected LocalDate birthdate;
    protected ContactInfo contactInfo;
    protected Address address;
}
