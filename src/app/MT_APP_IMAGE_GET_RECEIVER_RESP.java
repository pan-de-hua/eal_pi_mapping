package app;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONField;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
@XStreamAlias("nm:MT_APP_IMAGE_GET_RECEIVER_RESP")
public class MT_APP_IMAGE_GET_RECEIVER_RESP implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5472066371586928899L;

	@XStreamAsAttribute 
    @XStreamAlias("xmlns:nm")
    final String nm="urn:eal:tm:app";
	
	@XStreamAlias("Type")
	private String Type;
	@XStreamAlias("Message")
	private String Message;
	@XStreamAlias("PicData")
	private String PicData;
	@XStreamAlias("PicUrl")
	private String PicUrl;
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
	@JSONField(name = "PicData")
	public String getPicData() {
		return PicData;
	}
	public void setPicData(String picData) {
		PicData = picData;
	}
	@JSONField(name = "PicUrl")
	public String getPicUrl() {
		return PicUrl;
	}
	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}
	public MT_APP_IMAGE_GET_RECEIVER_RESP(String type, String message, String picData) {
		super();
		Type = type;
		Message = message;
		PicData = picData;
	}
	public MT_APP_IMAGE_GET_RECEIVER_RESP() {
		super();
	}
	
	
}
