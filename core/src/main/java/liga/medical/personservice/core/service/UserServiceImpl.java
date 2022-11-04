package liga.medical.personservice.core.service;

import liga.medical.personservice.core.entity.User;
import liga.medical.personservice.core.mapping.UsersMapper;
import liga.medical.personservice.core.service.api.UserService;
import liga.medical.personservice.dto.UserDto;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
//    private static Long id = 2L;
    private final UsersMapper usersMapper;
    private final BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(12);

    public UserServiceImpl(UsersMapper usersMapper) {
        this.usersMapper = usersMapper;
    }

    @Override
    public void insertUser(UserDto userDto) {
        User user = new User();
//        user.setId(id++);
        user.setUsername(userDto.getUsername());
        user.setPassword(bCryptPasswordEncoder.encode(userDto.getPassword()));

        usersMapper.insertUser(user);
        usersMapper.assignUserRole(usersMapper.getUserByUsername(userDto.getUsername()).getId(), 2L);
    }

    @Override
    public User getUserByUsername(String username) {
        User user = usersMapper.getUserByUsername(username);
        if (user == null) { return null; }
        user.setRoles(usersMapper.getRoles(user.getId()));
        return user;
    }
}
