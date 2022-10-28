package liga.medical.personservice.dto;

import lombok.Data;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
// import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;
import java.sql.Date;
// import java.util.Set;

@Data
@Table("medical_card")
public class MedicalCard {

    @Id
    @NonNull
    private long id;

    private String clientStatus;

    private String medStatus;

    private Date registryDt;

    private String comment;

//  @MappedCollection(idColumn = "medical_card_id")
//  private PersonData personData;

//  @MappedCollection(idColumn = "medical_card_id")
//  private Set<Illness> illnesses;

}
