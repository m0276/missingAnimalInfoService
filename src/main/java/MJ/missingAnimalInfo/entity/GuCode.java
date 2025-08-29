package MJ.missingAnimalInfo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class GuCode {
    String orgdownNm; //시군구명
    String uprCd; //시군구상위코드(시 코드)

    @Id
    String orgCd; //시군구코드

}
