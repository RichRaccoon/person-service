package liga.medical.personservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import java.sql.Timestamp;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("illness")
public class Illness {

    @Id
    @NonNull
    private long id;

    @NonNull
    private long medicalCardId;

    private long typeId;

    private String heaviness;

    @NonNull
    private Timestamp appearanceDttm;

    private Date recoveryDt;

}
