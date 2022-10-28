package liga.medical.personservice.core.service;

import liga.medical.personservice.core.mapping.PersonDataMapper;
import liga.medical.personservice.dto.PersonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonDataService {
    private final PersonDataMapper personDataMapper;

    @Autowired
    public PersonDataService(PersonDataMapper personDataMapper) {
        this.personDataMapper = personDataMapper;
    }

    public List<PersonData> listPersonData() {
        return personDataMapper.listPersonData();
    }

    public PersonData getPersonDataById(long id) {
        return personDataMapper.getPersonDataById(id);
    }

    public int insertPersonData(PersonData personData) {
        if (personDataMapper.getPersonDataById(personData.getId()) != null) return 1;
        else {
            personDataMapper.insertPersonData(personData);
            return 0;
        }
    }
}
