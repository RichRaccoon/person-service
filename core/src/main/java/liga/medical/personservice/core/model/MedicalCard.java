package liga.medical.personservice.core.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Set;

@Data
@Table("medical_card")
public class MedicalCard {

  @Id
  private long id;

  private String clientStatus;

  private String medStatus;

  private java.sql.Date registryDt;

  private String comment;

//  @MappedCollection(idColumn = "medical_card_id")
//  private PersonData personData;

  @MappedCollection(idColumn = "medical_card_id")
  private Set<Illness> illnesses;

}
