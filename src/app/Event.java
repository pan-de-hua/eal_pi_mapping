package app;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
public class Event {
	@XStreamAlias("DateTime")
	private String DateTime;
	@XStreamAlias("EVType")
	private String EVType;
	@XStreamAlias("EVDesc")
	private String EVDesc;
	@XStreamImplicit(itemFieldName = "Waybills")
	private List<Waybill> Waybills;
	@XStreamImplicit(itemFieldName = "Images")
	private List<Picture> Images;

	@JSONField(name = "Images")
	public List<Picture> getImages() {
		return Images;
	}
	public void setImages(List<Picture> images) {
		Images = images;
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
	
	@JSONField(name = "Waybills")
	public List<Waybill> getWaybills() {
		return Waybills;
	}
	public void setWaybills(List<Waybill> waybills) {
		Waybills = waybills;
	}
	

	
	
	
}
