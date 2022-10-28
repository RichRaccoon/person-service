package liga.medical.personservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
// import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("address")
public class Address {

    @Id
    @NonNull
    private long id;

    @NonNull
    private long contactId;

    @NonNull
    private long countryId;

    @NonNull
    private String city;

    private long index;

    @NonNull
    private String street;

    @NonNull
    private String building;

    private String flat;

//  @MappedCollection(idColumn = "id")
//  private Contact contact;

}
