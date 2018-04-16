package app;

import java.io.Serializable;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
@XStreamAlias("nm:MT_WEB_CARINFOR_RECEIVER_RESP")
public class MT_WEB_CARINFOR_RECEIVER_RESP implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 935560357168398828L;

	@XStreamAsAttribute 
    @XStreamAlias("xmlns:nm")
    final String nm="urn:eal:tm:app";
	@XStreamAlias("Type")
	private String Type;
	@XStreamAlias("Message")
	private String Message;
	
	
	@XStreamImplicit(itemFieldName = "Data")
	private List<CarNumbs> Data;

	public MT_WEB_CARINFOR_RECEIVER_RESP() {
		super();
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
	@JSONField(name = "Data")
	public List<CarNumbs> getData() {
		return Data;
	}

	public void setData(List<CarNumbs> data) {
		Data = data;
	};
	
	
}
