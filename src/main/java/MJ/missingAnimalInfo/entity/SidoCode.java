package MJ.missingAnimalInfo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class SidoCode {
    @Id
    String code;

    String sidoName;
}
