package liga.medical.personservice.core.mapping;

import liga.medical.personservice.dto.Address;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Insert;

import java.util.List;

@Mapper
public interface AddressMapper {
    @Results(id = "address", value = {
            @Result(property = "contactId", column = "contact_id"),
            @Result(property = "countryId", column = "country_id")
    })

    @Select("SELECT * FROM address;")
    List<Address> listAddresses();

    @Select("SELECT * FROM address WHERE id = #{id};")
    @ResultMap("address")
    Address getAddressById(@Param("id") long id);

    @Insert("INSERT INTO address (id, contact_id, country_id, city, index, street, building, flat) " +
            "VALUES (#{id}, #{contactId}, #{countryId}, #{city}, #{index}, #{street}, #{building}, #{flat});")
    void insertAddress(Address address);
}
