package liga.medical.personservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
// import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("person_data")
public class PersonData {

    @Id
    @NonNull
    private long id;

    @NonNull
    private String lastName;

    @NonNull
    private String firstName;

    @NonNull
    private Date birthDt;

    private long age;

    @NonNull
    private String sex;

    @NonNull
    private long contactId;

    @NonNull
    private long medicalCardId;

//  @MappedCollection(idColumn = "id")
//  private Contact contact;
//
//  @MappedCollection(idColumn = "id")
//  private MedicalCard medicalCard;

    private long parentId;

}
