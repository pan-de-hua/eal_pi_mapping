package app;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

public class EventData {
	@XStreamAlias("EventID")
	private String EventID;
	@XStreamAlias("DateTime")
	private String DateTime;
	@XStreamAlias("EVType")
	private String EVType;
	@XStreamImplicit(itemFieldName = "Images")
	private List<Picture> Images;

	@JSONField(name = "EventID")
	public String getEventID() {
		return EventID;
	}
	public void setEventID(String eventID) {
		EventID = eventID;
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
	
	@JSONField(name = "Images")
	public List<Picture> getImages() {
		return Images;
	}
	public void setImages(List<Picture> images) {
		Images = images;
	}
	
	
	
}
