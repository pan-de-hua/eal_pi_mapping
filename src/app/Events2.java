package app;

import com.alibaba.fastjson.annotation.JSONField;
import com.thoughtworks.xstream.annotations.XStreamAlias;

public class Events2 {

	@XStreamAlias("Waybill")
	private String Waybill;
	@XStreamAlias("HangbanID")
	private String HangbanID;
	@XStreamAlias("Hangbandate")
	private String Hangbandate;
	@XStreamAlias("PCS")
	private Integer PCS;
	@XStreamAlias("CW")
	private Double CW;
	@XStreamAlias("KabanID")
	private String KabanID;
	@XStreamAlias("KabanDate")
	private String KabanDate;
	@XStreamAlias("Planstart")
	private String Planstart;
	@XStreamAlias("Actstart")
	private String Actstart;
	@XStreamAlias("Planarrive")
	private String Planarrive;
	@XStreamAlias("Actarrive")
	private String Actarrive;
	@XStreamAlias("Time1")
	private String Time1;
	@XStreamAlias("Time2")
	private String Time2;
	@XStreamAlias("Time3")
	private String Time3;
	@XStreamAlias("Time4")
	private String Time4;
	@XStreamAlias("Remark1")
	private String Remark1;
	@XStreamAlias("Remark2")
	private String Remark2;
	@XStreamAlias("Remark3")
	private String Remark3;
	@XStreamAlias("Remark4")
	private String Remark4;
	
	@JSONField(name = "Waybill")
	public String getWaybill() {
		return Waybill;
	}
	public void setWaybill(String waybill) {
		Waybill = waybill;
	}
	
	@JSONField(name = "HangbanID")
	public String getHangbanID() {
		return HangbanID;
	}
	public void setHangbanID(String hangbanID) {
		HangbanID = hangbanID;
	}
	
	@JSONField(name = "Hangbandate")
	public String getHangbandate() {
		return Hangbandate;
	}
	public void setHangbandate(String hangbandate) {
		Hangbandate = hangbandate;
	}
	
	@JSONField(name = "PCS")
	public Integer getPCS() {
		return PCS;
	}
	public void setPCS(Integer pCS) {
		PCS = pCS;
	}
	
	@JSONField(name = "CW")
	public Double getCW() {
		return CW;
	}
	public void setCW(Double cW) {
		CW = cW;
	}
	
	@JSONField(name = "KabanID")
	public String getKabanID() {
		return KabanID;
	}
	public void setKabanID(String kabanID) {
		KabanID = kabanID;
	}
	
	@JSONField(name = "KabanDate")
	public String getKabanDate() {
		return KabanDate;
	}
	public void setKabanDate(String kabanDate) {
		KabanDate = kabanDate;
	}
	
	@JSONField(name = "Planstart")
	public String getPlanstart() {
		return Planstart;
	}
	public void setPlanstart(String planstart) {
		Planstart = planstart;
	}
	
	@JSONField(name = "Actstart")
	public String getActstart() {
		return Actstart;
	}
	public void setActstart(String actstart) {
		Actstart = actstart;
	}
	
	@JSONField(name = "Planarrive")
	public String getPlanarrive() {
		return Planarrive;
	}
	public void setPlanarrive(String planarrive) {
		Planarrive = planarrive;
	}
	
	@JSONField(name = "Actarrive")
	public String getActarrive() {
		return Actarrive;
	}
	public void setActarrive(String actarrive) {
		Actarrive = actarrive;
	}
	
	@JSONField(name = "Time1")
	public String getTime1() {
		return Time1;
	}
	public void setTime1(String time1) {
		Time1 = time1;
	}
	
	@JSONField(name = "Time2")
	public String getTime2() {
		return Time2;
	}
	public void setTime2(String time2) {
		Time2 = time2;
	}
	
	@JSONField(name = "Time3")
	public String getTime3() {
		return Time3;
	}
	public void setTime3(String time3) {
		Time3 = time3;
	}
	
	@JSONField(name = "Time4")
	public String getTime4() {
		return Time4;
	}
	public void setTime4(String time4) {
		Time4 = time4;
	}
	
	@JSONField(name = "Remark1")
	public String getRemark1() {
		return Remark1;
	}
	public void setRemark1(String remark1) {
		Remark1 = remark1;
	}
	
	@JSONField(name = "Remark2")
	public String getRemark2() {
		return Remark2;
	}
	public void setRemark2(String remark2) {
		Remark2 = remark2;
	}
	
	@JSONField(name = "Remark3")
	public String getRemark3() {
		return Remark3;
	}
	public void setRemark3(String remark3) {
		Remark3 = remark3;
	}
	
	@JSONField(name = "Remark4")
	public String getRemark4() {
		return Remark4;
	}
	public void setRemark4(String remark4) {
		Remark4 = remark4;
	}
	
	
}
