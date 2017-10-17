package com.app.aqoong.smsreport.data;

/**
 * Created by aqoong on 2017. 9. 22..
 */

public class InputData {
    private String carNumber;               //차량정보
    private String location;                //신고위치
    private String content;                 //신고내용

    private String reporterName;            //신고자 이름
    private String reporterPhone;           //신고자 번호
    private String reporterAddress;         //신고자 주소            //선택
    private String reporterEmail;           //신고자 이메일           //선택

    /**
     *  Getter / Setter
     * @return
     */
    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getReporterName() {
        return reporterName;
    }

    public void setReporterName(String reporterName) {
        this.reporterName = reporterName;
    }

    public String getReporterPhone() {
        return reporterPhone;
    }

    public void setReporterPhone(String reporterPhone) {
        this.reporterPhone = reporterPhone;
    }

    public String getReporterAddress() {
        return reporterAddress;
    }

    public void setReporterAddress(String reporterAddress) {
        this.reporterAddress = reporterAddress;
    }

    public String getReporterEmail() {
        return reporterEmail;
    }

    public void setReporterEmail(String reporterEmail) {
        this.reporterEmail = reporterEmail;
    }
}
