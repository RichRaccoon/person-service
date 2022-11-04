package liga.medical.personservice.core.mapping;

import liga.medical.personservice.core.entity.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface RolesMapper {
    @Select(value = "SELECT * FROM roles WHERE name = #{name};")
    Role findByName(@Param("name") String name);
}
