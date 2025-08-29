package MJ.missingAnimalInfo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MissingAnimalInfo {
    String rfidCd; //RFID 번호
    String callName; //신고자 이름
    String callTel; //신고자 연락처
    String happenDt; //접수일(YYYYMMDD)
    String happenAddr; //분실장소
    String happenAddrDtl; //분실장소상세
    String happenPlace; //주위 건물
    String orgNm; //관할지
    String popfile; //Image
    String kindCd; //품종
    String colorCd; //색상
    String sexCd; // M : 수컷F : 암컷
    String age; //나이
    String specialMark; //특징
}
