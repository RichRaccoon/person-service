package liga.medical.personservice.core.mapping;

import liga.medical.personservice.core.entity.Role;
import liga.medical.personservice.core.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Set;

@Mapper
public interface UsersMapper {
    @Select("SELECT * FROM users;")
    List<User> listUsers();

    @Select("SELECT * FROM users WHERE username = #{username};")
    User getUserByUsername(@Param("username") String username);

    @Insert("INSERT INTO users (username, password) VALUES (#{username}, #{password});")
    void insertUser(User user);

    @Select("SELECT * FROM roles WHERE id IN (SELECT role_id FROM users_roles WHERE user_id = #{userId});")
    Set<Role> getRoles(@Param("userId") Long userId);

    @Insert("INSERT INTO users_roles (user_id, role_id) VALUES (#{userId}, #{roleId});")
    void assignUserRole(@Param("userId") Long userId, @Param("roleId") Long roleId);
}
