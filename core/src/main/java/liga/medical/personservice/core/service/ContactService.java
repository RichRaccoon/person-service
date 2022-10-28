package liga.medical.personservice.core.service;

import liga.medical.personservice.core.mapping.ContactMapper;
import liga.medical.personservice.dto.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {
    private final ContactMapper contactMapper;

    @Autowired
    public ContactService(ContactMapper contactMapper) {
        this.contactMapper = contactMapper;
    }

    public List<Contact> listContacts() {
        return contactMapper.listContacts();
    }

    public Contact getContactById(long id) {
        return contactMapper.getContactById(id);
    }

    public int insertContact(Contact contact) {
        if (contactMapper.getContactById(contact.getId()) != null) return 1;
        else {
            contactMapper.insertContact(contact);
            return 0;
        }
    }
}
