package app;

import java.io.Serializable;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("nm:MT_APP_GET_EVENTS_RESP")
public class MT_APP_GET_EVENTS_RESP implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6862991989737625401L;
	@XStreamAsAttribute 
    @XStreamAlias("xmlns:nm")
    final String nm="urn:eal:tm:app";
	
	@XStreamAlias("Type")
	private String Type;
	
	@XStreamAlias("Message")
	private String Message;
	
	@XStreamImplicit(itemFieldName = "Events")
	private List<Events2> Events;

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
	public List<Events2> getEvents() {
		return Events;
	}

	public void setEvents(List<Events2> events) {
		Events = events;
	}
	
	
}
