package app;

import java.io.Serializable;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
@XStreamAlias("nm:MT_WEB_TRANSINFOR_GET_RESP")
public class MT_WEB_TRANSINFOR_GET_RESP implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = -2417752534534187709L;
	@XStreamAsAttribute 
    @XStreamAlias("xmlns:nm")
    final String nm="urn:eal:tm:app";
	
	
	@XStreamAlias("Type")
	private String Type;
	@XStreamAlias("Message")
	private String Message;
		
	@XStreamImplicit(itemFieldName = "TransData")
	private List<TransData> TransData;
	
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

	@JSONField(name = "TransData")
	public List<TransData> getTransData() {
		return TransData;
	}

	public void setTransData(List<TransData> transData) {
		TransData = transData;
	}

	public MT_WEB_TRANSINFOR_GET_RESP() {
		super();
	}

	public MT_WEB_TRANSINFOR_GET_RESP(String type, String message, List<app.TransData> transData) {
		super();
		Type = type;
		Message = message;
		TransData = transData;
	}

	
	
}
