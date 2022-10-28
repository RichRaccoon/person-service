package liga.medical.personservice.core.mapping;

import liga.medical.personservice.dto.PersonData;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;

import java.util.List;

@Mapper
public interface PersonDataMapper {
    @Results(id = "personData", value = {
            @Result(property = "lastName", column = "last_name"),
            @Result(property = "firstName", column = "first_name"),
            @Result(property = "birthDt", column = "birth_dt"),
            @Result(property = "contactId", column = "contact_id"),
            @Result(property = "medicalCardId", column = "medical_card_id"),
            @Result(property = "parentId", column = "parent_id")
    })

    @Select("SELECT * FROM person_data;")
    List<PersonData> listPersonData();

    @Select("SELECT * FROM person_data WHERE id = #{id};")
    @ResultMap("personData")
    PersonData getPersonDataById(@Param("id") long id);

    @Insert("INSERT INTO person_data " +
            "VALUES (#{id}, #{lastName}, #{firstName}, #{birthDt}, #{age}, #{sex}, #{contactId}, #{medicalCardId}, #{parentId});")
    void insertPersonData(PersonData personData);
}
