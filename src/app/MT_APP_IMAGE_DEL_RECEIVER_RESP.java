package app;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONField;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
@XStreamAlias("nm:MT_APP_IMAGE_DEL_RECEIVER_RESP")
public class MT_APP_IMAGE_DEL_RECEIVER_RESP implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4130244465609716047L;

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
	public MT_APP_IMAGE_DEL_RECEIVER_RESP(String type, String message) {
		super();
		Type = type;
		Message = message;
	}
	public MT_APP_IMAGE_DEL_RECEIVER_RESP() {
		super();
	}
	
}
