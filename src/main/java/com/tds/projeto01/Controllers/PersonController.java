package com.tds.projeto01.Controllers;
import com.tds.projeto01.Models.PersonModel;
import com.tds.projeto01.Services.PersonService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    PersonService personService = new PersonService();

    @GetMapping("/list")
    List <PersonModel> getAll() {
        return personService.getPeople();
    }

    @PostMapping("/newPerson")
    PersonModel newPeople(@RequestBody PersonModel person) {
        return personService.addPerson(person);
    }

    @PatchMapping("/updatePerson")
    PersonModel updatePerson(@RequestBody PersonModel person, @RequestParam int id) {
        return personService.updatePerson(person, id);
    }
}
