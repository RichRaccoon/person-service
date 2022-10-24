package liga.medical.personservice.core.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("illness")
public class Illness {

  @Id
  private long id;

  private long medicalCardId;

  private long typeId;

  private String heaviness;

  private java.sql.Timestamp appearanceDttm;

  private java.sql.Date recoveryDt;

}
