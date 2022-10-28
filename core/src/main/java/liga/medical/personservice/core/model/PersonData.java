package liga.medical.personservice.core.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("person_data")
public class PersonData {

  @Id
  private long id;

  private String lastName;

  private String firstName;

  private java.sql.Date birthDt;

  private long age;

  private String sex;

//  private long contactId;
//
//  private long medicalCardId;

  @MappedCollection(idColumn = "id")
  private Contact contact;

  @MappedCollection(idColumn = "id")
  private MedicalCard medicalCard;

  private long parentId;

}
