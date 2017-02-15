package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by yangkun on 2016/8/30.
 * 根据患者基本信息查询数据的基类
 */
public class RequestBase {
    /**
     * 医院编码
     * */
    @JsonProperty("hospitalCode")
    private String hospitalCode;
    /**
     * 患者患者唯一编码
     * */
    @JsonProperty("patientCode")
    private String patientCode;
    /**
     * 患者姓名
     * */
    @JsonProperty("patientName")
    private String patientName;
    /**
     * 患者证件类型
     * */
    @JsonProperty("patientIdentityCardType")
    private int patientIdentityCardType;
    /**
     * 患者证件号码
     * */
    @JsonProperty("patientIdentityCardNumber")
    private String patientIdentityCardNumber;
    /**
     * 患者类型
     * 1.成人 2.儿童
     * */
    @JsonProperty("patientCategory")
    private int patientCategory;
    /**
     * 就诊卡类型
     * */
    @JsonProperty("patientMedicalCardType")
    private String patientMedicalCardType;
    /**
     * 就诊卡号
     * */
    @JsonProperty("patientMedicalCardNumber")
    private String patientMedicalCardNumber;

    /**
     * 患者手机号
     * */
    @JsonProperty("patientMobile")
    private String patientMobile;

    @ApiModelProperty(notes = "医院编码")
    public String getHospitalCode() {
        return hospitalCode;
    }

    public void setHospitalCode(String hospitalCode) {
        this.hospitalCode = hospitalCode;
    }

    @ApiModelProperty(notes = "患者患者唯一编码")
    public String getPatientCode() {
        return patientCode;
    }

    public void setPatientCode(String patientCode) {
        this.patientCode = patientCode;
    }

    @ApiModelProperty(notes = "患者姓名")
    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }


    @ApiModelProperty(notes = "患者证件类型")
    public int getPatientIdentityCardType() {
        return patientIdentityCardType;
    }

    public void setPatientIdentityCardType(int patientIdentityCardType) {
        this.patientIdentityCardType = patientIdentityCardType;
    }

    @ApiModelProperty(notes = "患者证件号码")
    public String getPatientIdentityCardNumber() {
        return patientIdentityCardNumber;
    }

    public void setPatientIdentityCardNumber(String patientIdentityCardNumber) {
        this.patientIdentityCardNumber = patientIdentityCardNumber;
    }

    @ApiModelProperty(notes = "患者类型   1成人 2儿童")
    public int getPatientCategory() {
        return patientCategory;
    }

    public void setPatientCategory(int patientCategory) {
        this.patientCategory = patientCategory;
    }

    @ApiModelProperty(notes = "就诊卡类型")
    public String getPatientMedicalCardType() {
        return patientMedicalCardType;
    }

    public void setPatientMedicalCardType(String patientMedicalCardType) {
        this.patientMedicalCardType = patientMedicalCardType;
    }

    @ApiModelProperty(notes = "就诊卡号")
    public String getPatientMedicalCardNumber() {
        return patientMedicalCardNumber;
    }

    public void setPatientMedicalCardNumber(String patientMedicalCardNumber) {
        this.patientMedicalCardNumber = patientMedicalCardNumber;
    }

    @ApiModelProperty(notes = "患者手机号")
    public String getPatientMobile() {
        return patientMobile;
    }

    public void setPatientMobile(String patientMobile) {
        this.patientMobile = patientMobile;
    }
}
