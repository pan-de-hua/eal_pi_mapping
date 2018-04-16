package app;

import java.io.Serializable;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
@XStreamAlias("ns0:MT_APP_EM_CREATE_RETURN_REQ")
public class MT_APP_EM_CREATE_REQ implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6901097422085806390L;

	@XStreamAsAttribute 
    @XStreamAlias("xmlns:ns0")
    final String ns0="urn:eal:tm:app";
	
	@XStreamAlias("UserID")
	private String UserID;
	@XStreamAlias("OrderID")
	private String OrderID;
	@XStreamAlias("DateTime")
	private String DateTime;
	@XStreamAlias("EVType")
	private String EVType;
	@XStreamAlias("EVDesc")
	private String EVDesc;
	@XStreamAlias("Longitude")
	private String Longitude;
	@XStreamAlias("Latitude")
	private String Latitude;
	@XStreamAlias("Position")
	private String Position;
	@XStreamImplicit(itemFieldName = "Waybills")
	private List<Waybill> Waybills;
	@XStreamImplicit(itemFieldName = "Images")
	private List<Picture> Images;
	
	@JSONField(name = "UserID")
	public String getUserID() {
		return UserID;
	}
	public void setUserID(String userID) {
		UserID = userID;
	}
	
	@JSONField(name = "OrderID")
	public String getOrderID() {
		return OrderID;
	}
	public void setOrderID(String orderID) {
		OrderID = orderID;
	}
	
	@JSONField(name = "DateTime")
	public String getDateTime() {
		return DateTime;
	}
	public void setDateTime(String dateTime) {
		DateTime = dateTime;
	}
	
	@JSONField(name = "EVType")
	public String getEVType() {
		return EVType;
	}
	public void setEVType(String eVType) {
		EVType = eVType;
	}
	
	@JSONField(name = "EVDesc")
	public String getEVDesc() {
		return EVDesc;
	}
	public void setEVDesc(String eVDesc) {
		EVDesc = eVDesc;
	}
	
	@JSONField(name = "Longitude")
	public String getLongitude() {
		return Longitude;
	}
	public void setLongitude(String longitude) {
		Longitude = longitude;
	}
	
	@JSONField(name = "Latitude")
	public String getLatitude() {
		return Latitude;
	}
	public void setLatitude(String latitude) {
		Latitude = latitude;
	}
	
	@JSONField(name = "Position")
	public String getPosition() {
		return Position;
	}
	public void setPosition(String position) {
		Position = position;
	}
	
	@JSONField(name = "Waybills")
	public List<Waybill> getWaybills() {
		return Waybills;
	}
	public void setWaybills(List<Waybill> waybills) {
		Waybills = waybills;
	}
	
	@JSONField(name = "Images")
	public List<Picture> getImages() {
		return Images;
	}
	public void setImages(List<Picture> images) {
		Images = images;
	}
	public MT_APP_EM_CREATE_REQ() {
		super();
	}
	public MT_APP_EM_CREATE_REQ(String userID, String orderID, String dateTime, String eVType, String eVDesc,
			String longitude, String latitude, String position, List<Waybill> waybills, List<Picture> images) {
		super();
		UserID = userID;
		OrderID = orderID;
		DateTime = dateTime;
		EVType = eVType;
		EVDesc = eVDesc;
		Longitude = longitude;
		Latitude = latitude;
		Position = position;
		Waybills = waybills;
		Images = images;
	}

}
