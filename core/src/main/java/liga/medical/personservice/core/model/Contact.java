package liga.medical.personservice.core.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("contact")
public class Contact {

  @Id
  private long id;

  private String phoneNumber;

  private String email;

  private String profileLink;

//  @MappedCollection(idColumn = "contact_id")
//  private Address address;

//  @MappedCollection(idColumn = "contact_id")
//  private PersonData personData;

}
