package liga.medical.personservice.dto;

import lombok.*;
import org.springframework.data.annotation.Id;
// import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("contact")
public class Contact {

    @Id
    @NonNull
    private long id;

    @NonNull
    private String phoneNumber;

    private String email;

    private String profileLink;

//  @MappedCollection(idColumn = "contact_id")
//  private Address address;

//  @MappedCollection(idColumn = "contact_id")
//  private PersonData personData;

}
