package com.finder.xml;

import lombok.Data;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Item {
    // 기관명
    @XmlElement(name = "dutyName")
    private String dutyName;

    // 병상수
    @XmlElement(name = "hvec")
    private Long hvec;

    // 주소
    @XmlElement(name = "dutyAddr")
    private String dutyAddr;

    // 약도
    @XmlElement(name = "dutyMapimg")
    private String dutyMapimg;

    // 대표 연락처
    @XmlElement(name = "dutyTel1")
    private String dutyTel1;

    // 응급실 연락처
    @XmlElement(name = "dutyTel3")
    private String dutyTel3;

    // 구급차 가용 여부
    @XmlElement(name = "hvamyn")
    private String hvamyn;

    // CT 가용 여부
    @XmlElement(name = "hvctayn")
    private String hvctayn;

    // MRI 가용 여부
    @XmlElement(name = "hvmriayn")
    private String hvmriayn;

    // 위도
    @XmlElement(name = "wgs84Lat")
    private Double wgs84Lat;

    // 경도
    @XmlElement(name = "wgs84Lon")
    private Double wgs84Lon;

    public void update(String dutyAddr, String dutyMapimg, String dutyTel1, Double wgs84Lat, Double wgs84Lon) {
        this.dutyAddr = dutyAddr;
        this.dutyMapimg = dutyMapimg;
        this.dutyTel1 = dutyTel1;
        this.wgs84Lat = wgs84Lat;
        this.wgs84Lon = wgs84Lon;
    }
}