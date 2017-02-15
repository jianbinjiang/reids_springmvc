package model;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 * @author jiangjianbin
 *  医院待缴费流水号
 */
@ApiModel(value = "QueryPendingFeesPrePayment", description = "医院待缴费流水号")
@JsonRootName("prePayment")
public class QueryPendingFeesPrePayment {

	/*
	 * 医院待缴费流水号
	 */
	@JsonProperty("pendingFeeOrderNumber")
	private String pendingFeeOrderNumber;
	
	/*
	 * 处方号
	 */
	@JsonProperty("prescriptionCode")
	private String prescriptionCode;
	
	/*
	 * 患者唯一编码
	 */
	@JsonProperty("patientCode")
	private String patientCode;
	
	/*
	 * 费别
	 */
	@JsonProperty("feeCategory")
	private int feeCategory;
	
	/*
	 * 开单科室
	 */
	@JsonProperty("billingDepartmentName")
	private String billingDepartmentName;
	
	/*
	 * 开单日期
	 */
	@JsonProperty("billingDate")
	private String billingDate;
	
	/*
	 * 执行科室
	 */
	@JsonProperty("execDepartmentName")
	private String execDepartmentName;
	
	/*
	 * 临床诊断
	 */
	@JsonProperty("clinicalDiagnosis")
	private String clinicalDiagnosis;
	
	/*
	 * 费用总额
	 */
	@JsonProperty("totalFee")
	private BigDecimal  totalFee;
	
	/*
	 * 说明
	 */
	@JsonProperty("description")
	private String description;
	

	@ApiModelProperty(notes = "医院待缴费流水号")
	public String getPendingFeeOrderNumber() {
		return pendingFeeOrderNumber;
	}

	public void setPendingFeeOrderNumber(String pendingFeeOrderNumber) {
		this.pendingFeeOrderNumber = pendingFeeOrderNumber;
	}

	@ApiModelProperty(notes = "处方号")
	public String getPrescriptionCode() {
		return prescriptionCode;
	}

	public void setPrescriptionCode(String prescriptionCode) {
		this.prescriptionCode = prescriptionCode;
	}

	@ApiModelProperty(notes = "患者唯一编码")
	public String getPatientCode() {
		return patientCode;
	}

	public void setPatientCode(String patientCode) {
		this.patientCode = patientCode;
	}

	@ApiModelProperty(notes = "费别")
	public int getFeeCategory() {
		return feeCategory;
	}

	public void setFeeCategory(int feeCategory) {
		this.feeCategory = feeCategory;
	}

	@ApiModelProperty(notes = "开单科室")
	public String getBillingDepartmentName() {
		return billingDepartmentName;
	}

	public void setBillingDepartmentName(String billingDepartmentName) {
		this.billingDepartmentName = billingDepartmentName;
	}

	@ApiModelProperty(notes = "开单日期")
	public String getBillingDate() {
		return billingDate;
	}

	public void setBillingDate(String billingDate) {
		this.billingDate = billingDate;
	}

	@ApiModelProperty(notes = "执行科室")
	public String getExecDepartmentName() {
		return execDepartmentName;
	}

	public void setExecDepartmentName(String execDepartmentName) {
		this.execDepartmentName = execDepartmentName;
	}

	@ApiModelProperty(notes = "临床诊断")
	public String getClinicalDiagnosis() {
		return clinicalDiagnosis;
	}

	public void setClinicalDiagnosis(String clinicalDiagnosis) {
		this.clinicalDiagnosis = clinicalDiagnosis;
	}

	@ApiModelProperty(notes = "费用总额")
	public BigDecimal getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(BigDecimal totalFee) {
		this.totalFee = totalFee;
	}

	@ApiModelProperty(notes = "说明")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
