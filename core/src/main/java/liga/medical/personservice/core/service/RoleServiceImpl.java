package liga.medical.personservice.core.service;

import liga.medical.personservice.core.entity.Role;
import liga.medical.personservice.core.mapping.RolesMapper;
import liga.medical.personservice.core.service.api.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    private final RolesMapper rolesMapper;

    public RoleServiceImpl(RolesMapper rolesMapper) {
        this.rolesMapper = rolesMapper;
    }

    @Override
    public Role getRoleByName(String name) {
        return rolesMapper.findByName(name);
    }
}
