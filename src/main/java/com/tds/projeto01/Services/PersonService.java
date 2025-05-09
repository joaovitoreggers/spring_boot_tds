package com.tds.projeto01.Services;
import com.tds.projeto01.Models.PersonModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PersonService {

    List<PersonModel> people = new ArrayList<>();

    public PersonModel addPerson(PersonModel person) {
        people.add(person);
        return person;
     }

     public PersonModel updatePerson(PersonModel person, int id) {
        people.set(id, person);
        return person;
     }
}
