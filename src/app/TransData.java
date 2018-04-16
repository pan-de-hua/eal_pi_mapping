package app;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.thoughtworks.xstream.annotations.XStreamAlias;

public class TransData {
	@XStreamAlias("CarNumb")
	private String CarNumb;
	@XStreamAlias("KabanID")
	private String KabanID;
	@XStreamAlias("Date")
	private String  Date;
	@XStreamAlias("Itinerary")
	private String Itinerary;
	@XStreamAlias("TotalPCS")
	private Double TotalPCS;
	@XStreamAlias("TotalWeight")
	private Double TotalWeight;
	@XStreamAlias("FO")
	private String FO;
	@XStreamAlias("TotalNum")
	private Double TotalNum;
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
	
	@JSONField(name = "Date")
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	
	@JSONField(name = "Itinerary")
	public String getItinerary() {
		return Itinerary;
	}
	public void setItinerary(String itinerary) {
		Itinerary = itinerary;
	}
	
	@JSONField(name = "TotalPCS")
	public Double getTotalPCS() {
		return TotalPCS;
	}
	public void setTotalPCS(Double totalPCS) {
		TotalPCS = totalPCS;
	}
	
	@JSONField(name = "TotalWeight")
	public Double getTotalWeight() {
		return TotalWeight;
	}
	public void setTotalWeight(Double totalWeight) {
		TotalWeight = totalWeight;
	}
	
	@JSONField(name = "FO")
	public String getFO() {
		return FO;
	}
	public void setFO(String fO) {
		FO = fO;
	}
	
	@JSONField(name = "TotalNum")
	public Double getTotalNum() {
		return TotalNum;
	}
	public void setTotalNum(Double totalNum) {
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
