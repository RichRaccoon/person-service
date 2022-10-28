package liga.medical.personservice.core.mapping;

import liga.medical.personservice.dto.Contact;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Insert;

import java.util.List;

@Mapper
public interface ContactMapper {
    @Results(id = "contact", value = {
            @Result(property = "phoneNumber", column = "phone_number"),
            @Result(property = "profileLink", column = "profile_link")
    })

    @Select("SELECT * FROM contact;")
    List<Contact> listContacts();

    @Select("SELECT * FROM contact WHERE id = #{id};")
    @ResultMap("contact")
    Contact getContactById(@Param("id") long id);

    @Insert("INSERT INTO contact (id, phone_number, email, profile_link) " +
            "VALUES (#{id}, #{phoneNumber}, #{email}, #{profileLink});")
    void insertContact(Contact contact);
}
