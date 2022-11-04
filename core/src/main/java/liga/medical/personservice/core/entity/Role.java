package liga.medical.personservice.core.entity;

import lombok.Data;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.security.core.GrantedAuthority;

@Data
public class Role implements GrantedAuthority {
    @Id
    @NonNull
    private Long id;

    @NonNull
    private String name;

    @Override
    public String getAuthority() {
        return getName();
    }
}
