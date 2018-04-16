package app;

import java.io.Serializable;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.annotations.XStreamOmitField;
@XStreamAlias("nm:MT_APP_RECEIVER_GET_TASK_RESP")
public class MT_APP_RECEIVER_GET_TASK_RESP implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 773962400199828522L;

	@XStreamAsAttribute 
    @XStreamAlias("xmlns:nm")
    final String nm="urn:eal:tm:app";
	
	@XStreamAlias("Type")
	private String Type;
	@XStreamAlias("Message")
	private String Message;
	@XStreamImplicit(itemFieldName = "Data")
	private List<Task_Order> Data;
	
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
	@JSONField(name = "Data")
	public List<Task_Order> getData() {
		return Data;
	}
	public void setData(List<Task_Order> data) {
		Data = data;
	}
	public MT_APP_RECEIVER_GET_TASK_RESP() {
		super();
	}
	public MT_APP_RECEIVER_GET_TASK_RESP(String type, String message, List<Task_Order> data) {
		super();
		Type = type;
		Message = message;
		Data = data;
	}
	
}
