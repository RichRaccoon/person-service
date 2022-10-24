package liga.medical.personservice.core.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("address")
public class Address {

  @Id
  private long id;

//  private long contactId;

  private long countryId;

  private String city;

  private long index;

  private String street;

  private String building;

  private String flat;

  @MappedCollection(idColumn = "id")
  private Contact contact;

}
