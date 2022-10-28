package liga.medical.personservice.core.mapping;

import liga.medical.personservice.dto.Illness;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Insert;

import java.util.List;

@Mapper
public interface IllnessMapper {
    @Results(id = "illness", value = {
            @Result(property = "medicalCardId", column = "medical_card_id"),
            @Result(property = "typeId", column = "type_id"),
            @Result(property = "appearanceDttm", column = "appearance_dttm"),
            @Result(property = "recoveryDt", column = "recovery_dt")
    })

    @Select("SELECT * FROM illness;")
    List<Illness> listIllnesses();

    @Select("SELECT * FROM illness WHERE id = #{id};")
    @ResultMap("illness")
    Illness getIllnessById(@Param("id") long id);

    @Insert("INSERT INTO illness (id, medical_card_id, type_id, heaviness, appearance_dttm, recovery_dt) " +
            "VALUES (#{id}, #{medicalCardId}, #{typeId}, #{heaviness}, #{appearanceDttm}, #{recoveryDt});")
    void insertIllness(Illness illness);
}
