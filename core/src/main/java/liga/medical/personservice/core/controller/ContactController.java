package liga.medical.personservice.core.controller;

import liga.medical.personservice.core.service.ContactService;
import liga.medical.personservice.dto.Contact;
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
@RequestMapping("/contacts")
public class ContactController {
    private final ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping
    public List<Contact> listContacts() {
        return contactService.listContacts();
    }

    @GetMapping("/{id}")
    public Contact getContactById(@PathVariable long id) {
        return contactService.getContactById(id);
    }

    @PostMapping("/add")
    public ResponseEntity<String> insertContact(@RequestBody Contact contact) {
        int resultCode = contactService.insertContact(contact);

        if (resultCode == 1)
            return new ResponseEntity<>("Contact id is exists.", HttpStatus.BAD_REQUEST);
        else {
            return new ResponseEntity<>("Contact added successfully.", HttpStatus.OK);
        }
    }
}
