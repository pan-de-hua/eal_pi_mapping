package app;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

public class Events {

	@XStreamAlias("EventID")
	private String EventID;
	@XStreamAlias("CarNumb")
	private String CarNumb;
	@XStreamAlias("Date")
	private String Date;
	@XStreamAlias("EVType")
	private String EVType;
	@XStreamAlias("EVDesc")
	private String EVDesc;
	@XStreamAlias("Waybill")
	private String Waybill;
	@XStreamAlias("FO")
	private String FO;
	@XStreamAlias("EXECUTION")
	private String EXECUTION;
	@XStreamAlias("Itinerary")
	private String Itinerary;
	@XStreamAlias("KabanID")
	private String KabanID;
	@XStreamAlias("KabanDate")
	private String KabanDate;
	@XStreamAlias("TotalPcs")
	private String TotalPcs;
	@XStreamAlias("TotalCW")
	private String TotalCW;
	@XStreamAlias("TotalNum")
	private String TotalNum;
	@XStreamImplicit(itemFieldName = "Images")
	private List<Picture> Images;

	@JSONField(name = "EventID")
	public String getEventID() {
		return EventID;
	}
	public void setEventID(String eventID) {
		EventID = eventID;
	}
	@JSONField(name = "CarNumb")
	public String getCarNumb() {
		return CarNumb;
	}
	public void setCarNumb(String carNumb) {
		CarNumb = carNumb;
	}
	
	@JSONField(name = "DateTime")
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	
	@JSONField(name = "EVType")
	public String getEVType() {
		return EVType;
	}
	public void setEVType(String eVType) {
		EVType = eVType;
	}
	
	@JSONField(name = "Waybill")
	public String getWaybill() {
		return Waybill;
	}
	public void setWaybill(String waybill) {
		Waybill = waybill;
	}
	
	@JSONField(name = "FO")
	public String getFO() {
		return FO;
	}
	public void setFO(String fO) {
		FO = fO;
	}
	
	@JSONField(name = "EXECUTION")
	public String getEXECUTION() {
		return EXECUTION;
	}
	public void setEXECUTION(String eXECUTION) {
		EXECUTION = eXECUTION;
	}
	
	@JSONField(name = "EVDesc")
	public String getEVDesc() {
		return EVDesc;
	}
	public void setEVDesc(String eVDesc) {
		EVDesc = eVDesc;
	}
	
	@JSONField(name = "Itinerary")
	public String getItinerary() {
		return Itinerary;
	}
	public void setItinerary(String itinerary) {
		Itinerary = itinerary;
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
	
	@JSONField(name = "TotalPcs")
	public String getTotalPcs() {
		return TotalPcs;
	}
	public void setTotalPcs(String totalPcs) {
		TotalPcs = totalPcs;
	}
	
	@JSONField(name = "TotalCW")
	public String getTotalCW() {
		return TotalCW;
	}
	public void setTotalCW(String totalCW) {
		TotalCW = totalCW;
	}
	
	@JSONField(name = "TotalNum")
	public String getTotalNum() {
		return TotalNum;
	}
	public void setTotalNum(String totalNum) {
		TotalNum = totalNum;
	}
	
	@JSONField(name = "Images")
	public List<Picture> getImages() {
		return Images;
	}
	public void setImages(List<Picture> images) {
		Images = images;
	}
	
	
}
