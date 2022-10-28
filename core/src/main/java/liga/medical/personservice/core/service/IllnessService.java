package liga.medical.personservice.core.service;

import liga.medical.personservice.core.mapping.IllnessMapper;
import liga.medical.personservice.dto.Illness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IllnessService {
    private final IllnessMapper illnessMapper;

    @Autowired
    public IllnessService(IllnessMapper illnessMapper) {
        this.illnessMapper = illnessMapper;
    }

    public List<Illness> listIllnesses() {
        return illnessMapper.listIllnesses();
    }

    public Illness getIllnessById(long id) {
        return illnessMapper.getIllnessById(id);
    }

    public int insertIllness(Illness illness) {
        if (illnessMapper.getIllnessById(illness.getId()) != null) return 1;
        else {
            illnessMapper.insertIllness(illness);
            return 0;
        }
    }
}
