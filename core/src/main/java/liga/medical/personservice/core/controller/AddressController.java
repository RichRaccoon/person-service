package liga.medical.personservice.core.controller;

import liga.medical.personservice.core.service.AddressService;
import liga.medical.personservice.dto.Address;
import liga.medical.personservice.dto.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ps/addresses")
public class AddressController {
    private final AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping(produces = "application/json")
    public List<Address> listAddresses() {
        return addressService.listAddresses();
    }

    @GetMapping("/{id}")
    public Address getAddressById(@PathVariable long id) {
        return addressService.getAddressById(id);
    }

    @PostMapping("/add")
    public ResponseEntity<String> insertAddress(@RequestBody Address address) {
        int resultCode = addressService.insertAddress(address);

        if (resultCode == 1)
            return new ResponseEntity<>("Address id is exists.", HttpStatus.BAD_REQUEST);
        else {
            return new ResponseEntity<>("Address added successfully.", HttpStatus.OK);
        }
    }
}
