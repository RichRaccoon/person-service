package liga.medical.personservice.core.controller;

import liga.medical.personservice.core.service.IllnessService;
import liga.medical.personservice.dto.Illness;
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
@RequestMapping("/illnesses")
public class IllnessController {
    private final IllnessService illnessService;

    @Autowired
    public IllnessController(IllnessService illnessService) {
        this.illnessService = illnessService;
    }

    @GetMapping
    public List<Illness> listIllnesses() {
        return illnessService.listIllnesses();
    }

    @GetMapping("/{id}")
    public Illness getIllnessById(@PathVariable long id) {
        return illnessService.getIllnessById(id);
    }

    @PostMapping("/add")
    public ResponseEntity<String> insertIllness(@RequestBody Illness illness) {
        int resultCode = illnessService.insertIllness(illness);

        if (resultCode == 1)
            return new ResponseEntity<>("Illness id is exists.", HttpStatus.BAD_REQUEST);
        else {
            return new ResponseEntity<>("Illness added successfully.", HttpStatus.OK);
        }
    }
}
