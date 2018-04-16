package app;

import java.io.Serializable;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
@XStreamAlias("nm:MT_WEB_GET_ALLEVENTS_RESP")
public class MT_WEB_GET_ALLEVENTS_RESP implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = -5209173429446280619L;


	@XStreamAsAttribute 
    @XStreamAlias("xmlns:nm")
    final String nm="urn:eal:tm:app";
	
	
	@XStreamAlias("Type")
	private String Type;
	@XStreamAlias("Message")
	private String Message;
		
	@XStreamImplicit(itemFieldName = "Events")
	private List<Events> Events;


	@JSONField(name = "Type")
	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}
	@JSONField(name = "Message")
	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}


	@JSONField(name = "Events")
	public List<Events> getEvents() {
		return Events;
	}

	public void setEvents(List<Events> events) {
		Events = events;
	}

	public MT_WEB_GET_ALLEVENTS_RESP() {
		super();
	}

	public MT_WEB_GET_ALLEVENTS_RESP(String type, String message, List<app.Events> events) {
		super();
		Type = type;
		Message = message;
		Events = events;
	}

	
	
}
