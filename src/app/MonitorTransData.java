package app;

import com.alibaba.fastjson.annotation.JSONField;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

public class MonitorTransData {

	@XStreamAlias("CarNumb")
	private String CarNumb;
	@XStreamAlias("KabanID")
	private String KabanID;
	@XStreamAlias("KabanDate")
	private String KabanDate;
	@XStreamAlias("Itinerary")
	private String Itinerary;
	@XStreamAlias("TotalPCS")
	private String TotalPCS;
	@XStreamAlias("TotalWeight")
	private String TotalWeight;
	@XStreamAlias("FO")
	private String FO;
	@XStreamAlias("StartDate")
	private String StartDate;
	@XStreamAlias("ExpectArriveDate")
	private String ExpectArriveDate;
	@XStreamAlias("ActualArriveDate")
	private String ActualArriveDate;
	@XStreamAlias("Health")
	private String Health;
	@XStreamAlias("TotalNum")
	private String TotalNum;
	@XStreamAlias("Driver1")
	private String Driver1;
	@XStreamAlias("Driver1Telephone")
	private String Driver1Telephone;
	@XStreamAlias("Driver2")
	private String Driver2;
	@XStreamAlias("Driver2Telephone")
	private String Driver2Telephone;
	
	@JSONField(name = "CarNumb")
	public String getCarNumb() {
		return CarNumb;
	}
	public void setCarNumb(String carNumb) {
		CarNumb = carNumb;
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
	
	@JSONField(name = "Itinerary")
	public String getItinerary() {
		return Itinerary;
	}
	public void setItinerary(String itinerary) {
		Itinerary = itinerary;
	}
	
	@JSONField(name = "TotalPCS")
	public String getTotalPCS() {
		return TotalPCS;
	}
	public void setTotalPCS(String totalPCS) {
		TotalPCS = totalPCS;
	}
	
	@JSONField(name = "TotalWeight")
	public String getTotalWeight() {
		return TotalWeight;
	}
	public void setTotalWeight(String totalWeight) {
		TotalWeight = totalWeight;
	}
	
	@JSONField(name = "FO")
	public String getFO() {
		return FO;
	}
	public void setFO(String fO) {
		FO = fO;
	}
	
	@JSONField(name = "StartDate")
	public String getStartDate() {
		return StartDate;
	}
	public void setStartDate(String startDate) {
		StartDate = startDate;
	}
	
	@JSONField(name = "ExpectArriveDate")
	public String getExpectArriveDate() {
		return ExpectArriveDate;
	}
	public void setExpectArriveDate(String expectArriveDate) {
		ExpectArriveDate = expectArriveDate;
	}
	
	@JSONField(name = "ActualArriveDate")
	public String getActualArriveDate() {
		return ActualArriveDate;
	}
	public void setActualArriveDate(String actualArriveDate) {
		ActualArriveDate = actualArriveDate;
	}
	
	@JSONField(name = "Health")
	public String getHealth() {
		return Health;
	}
	public void setHealth(String health) {
		Health = health;
	}
	
	@JSONField(name = "TotalNum")
	public String getTotalNum() {
		return TotalNum;
	}
	public void setTotalNum(String totalNum) {
		TotalNum = totalNum;
	}
	
	@JSONField(name = "Driver1")
	public String getDriver1() {
		return Driver1;
	}
	public void setDriver1(String driver1) {
		Driver1 = driver1;
	}
	
	@JSONField(name = "Driver1Telephone")
	public String getDriver1Telephone() {
		return Driver1Telephone;
	}
	public void setDriver1Telephone(String driver1Telephone) {
		Driver1Telephone = driver1Telephone;
	}
	
	@JSONField(name = "Driver2")
	public String getDriver2() {
		return Driver2;
	}
	public void setDriver2(String driver2) {
		Driver2 = driver2;
	}
	
	@JSONField(name = "Driver2Telephone")
	public String getDriver2Telephone() {
		return Driver2Telephone;
	}
	public void setDriver2Telephone(String driver2Telephone) {
		Driver2Telephone = driver2Telephone;
	}
	
	
}
