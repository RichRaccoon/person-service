package liga.medical.personservice.core.service.api;

import liga.medical.personservice.core.entity.User;
import liga.medical.personservice.dto.UserDto;

public interface UserService {
    void insertUser(UserDto userDto);

    User getUserByUsername(String username);
}
