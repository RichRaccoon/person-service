package liga.medical.personservice.core.controller;

import liga.medical.personservice.core.service.MedicalCardService;
import liga.medical.personservice.dto.MedicalCard;
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
@RequestMapping("/ps/medicalCards")
public class MedicalCardController {
    private final MedicalCardService medicalCardService;

    @Autowired
    public MedicalCardController(MedicalCardService medicalCardService) {
        this.medicalCardService = medicalCardService;
    }

    @GetMapping
    public List<MedicalCard> listMedicalCards() {
        return medicalCardService.listMedicalCards();
    }

    @GetMapping("/{id}")
    public MedicalCard getMedicalCardById(@PathVariable long id) {
        return medicalCardService.getMedicalCardById(id);
    }

    @PostMapping("/add")
    public ResponseEntity<String> insertMedicalCard(@RequestBody MedicalCard medicalCard) {
        int resultCode = medicalCardService.insertMedicalCard(medicalCard);

        if (resultCode == 1)
            return new ResponseEntity<>("MedicalCard id is exists.", HttpStatus.BAD_REQUEST);
        else {
            return new ResponseEntity<>("MedicalCard added successfully.", HttpStatus.OK);
        }
    }
}
