package app;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONField;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("ns0:MT_APP_EventReminder_Sender_RESP")
public class MT_APP_EventReminder_Sender_RESP implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2450215578954889127L;

	@XStreamAsAttribute 
    @XStreamAlias("xmlns:ns0")
    final String ns0="urn:eal:tm:app";
	
	@XStreamAlias("Type")
	private String Type;
	@XStreamAlias("Message")
	private String Message;
	
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
	public MT_APP_EventReminder_Sender_RESP(String type, String message) {
		super();
		Type = type;
		Message = message;
	}
	public MT_APP_EventReminder_Sender_RESP() {
		super();
	}
	
	
	
	
}
