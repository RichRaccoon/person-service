package liga.medical.personservice.core.mapping;

import liga.medical.personservice.dto.MedicalCard;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Insert;

import java.util.List;

@Mapper
public interface MedicalCardMapper {
    @Results(id = "medicalCard", value = {
            @Result(property = "clientStatus", column = "client_status"),
            @Result(property = "medStatus", column = "med_status"),
            @Result(property = "registryDt", column = "registry_dt")
    })

    @Select("SELECT * FROM medical_card;")
    List<MedicalCard> listMedicalCards();

    @ResultMap("medicalCard")
    @Select("SELECT * FROM medical_card WHERE id = #{id};")
    MedicalCard getMedicalCardById(@Param("id") long id);

    @Insert("INSERT INTO medical_card (id, client_status, med_status, registry_dt, comment) " +
            "VALUES (#{id}, #{clientStatus}, #{medStatus}, #{registryDt}, #{comment});")
    void insertMedicalCard(MedicalCard medicalCard);
}
