package MJ.missingAnimalInfo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class SiCode {
    @Id
    String orgCd;

    String orgdownNm;
}
