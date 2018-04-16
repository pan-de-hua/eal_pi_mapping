package app;

import java.io.Serializable;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
@XStreamAlias("nm:MT_APP_EM_GET_RECEIVER_RESP")
public class MT_APP_EM_GET_RECEIVER_RESP implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5172793183035265291L;

	@XStreamAsAttribute 
    @XStreamAlias("xmlns:nm")
    final String nm="urn:eal:tm:app";

	@XStreamAlias("Type")
	private String Type;
	@XStreamAlias("Message")
	private String Message;
	
	@XStreamImplicit(itemFieldName = "Events")
	private List<Event> Events;
	
	@JSONField(name = "Events")
	public List<Event> getEvents() {
		return Events;
	}
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

	public void setEvents(List<Event> eVENTS) {
		Events = eVENTS;
	}

	public MT_APP_EM_GET_RECEIVER_RESP(String type, String message, List<Event> events) {
		super();
		Type = type;
		Message = message;
		Events = events;
	}

	public MT_APP_EM_GET_RECEIVER_RESP() {
		super();
	};
	
	
}
