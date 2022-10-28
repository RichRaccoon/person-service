package liga.medical.personservice.core.controller;

import liga.medical.personservice.core.service.PersonDataService;
import liga.medical.personservice.dto.PersonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RestController
@RequestMapping("/personData")
public class PersonDataController {
    private final PersonDataService personDataService;

    @Autowired
    public PersonDataController(PersonDataService personDataService) {
        this.personDataService = personDataService;
    }

    @GetMapping
    public List<PersonData> listPersonData() {
        return personDataService.listPersonData();
    }

    @GetMapping("/{id}")
    public PersonData listPersonDataById(@PathVariable long id) {
        return personDataService.getPersonDataById(id);
    }

    @PostMapping("/add")
    public ResponseEntity<String> insertPersonData(@RequestBody PersonData personData) {
        int resultCode = personDataService.insertPersonData(personData);

        if (resultCode == 1)
            return new ResponseEntity<>("PersonData id is exists.", HttpStatus.BAD_REQUEST);
        else {
            return new ResponseEntity<>("PersonData added successfully.", HttpStatus.OK);
        }
    }
}
