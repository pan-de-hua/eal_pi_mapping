package app;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONField;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
@XStreamAlias("nm:MT_APP_EM_CREATE_RETURN_RESP")
public class MT_APP_EM_CREATE_RETURN_RESP implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 919618515033802323L;

	@XStreamAsAttribute 
    @XStreamAlias("xmlns:nm")
    final String nm="urn:eal:tm:app";
	
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
	public MT_APP_EM_CREATE_RETURN_RESP() {
		super();
	}
	public MT_APP_EM_CREATE_RETURN_RESP(String type, String message) {
		super();
		Type = type;
		Message = message;
	}
	
	
}
