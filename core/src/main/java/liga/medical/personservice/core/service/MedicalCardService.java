package liga.medical.personservice.core.service;

import liga.medical.personservice.core.mapping.MedicalCardMapper;
import liga.medical.personservice.dto.MedicalCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalCardService {
    private final MedicalCardMapper medicalCardMapper;

    @Autowired
    public MedicalCardService(MedicalCardMapper medicalCardMapper) {
        this.medicalCardMapper = medicalCardMapper;
    }

    public List<MedicalCard> listMedicalCards() {
        return medicalCardMapper.listMedicalCards();
    }

    public MedicalCard getMedicalCardById(long id) {
        return medicalCardMapper.getMedicalCardById(id);
    }

    public int insertMedicalCard(MedicalCard medicalCard) {
        if (medicalCardMapper.getMedicalCardById(medicalCard.getId()) != null) return 1;
        else {
            medicalCardMapper.insertMedicalCard(medicalCard);
            return 0;
        }
    }
}
