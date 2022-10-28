package liga.medical.personservice.core.service;

import liga.medical.personservice.core.mapping.AddressMapper;
import liga.medical.personservice.dto.Address;
import liga.medical.personservice.dto.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    private final AddressMapper addressMapper;

    @Autowired
    public AddressService(AddressMapper addressMapper) {
        this.addressMapper = addressMapper;
    }

    public List<Address> listAddresses() {
        return addressMapper.listAddresses();
    }

    public Address getAddressById(long id) {
        return addressMapper.getAddressById(id);
    }

    public int insertAddress(Address address) {
        if (addressMapper.getAddressById(address.getId()) != null) return 1;
        else {
            addressMapper.insertAddress(address);
            return 0;
        }
    }
}
