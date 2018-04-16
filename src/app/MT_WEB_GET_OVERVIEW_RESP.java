package app;

import java.io.Serializable;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
@XStreamAlias("nm:MT_WEB_GET_OVERVIEW_RESP")
public class MT_WEB_GET_OVERVIEW_RESP implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 6923980654563047881L;


	@XStreamAsAttribute 
    @XStreamAlias("xmlns:nm")
    final String nm="urn:eal:tm:app";
	
	
	@XStreamAlias("Type")
	private String Type;
	@XStreamAlias("Message")
	private String Message;
		
	@XStreamImplicit(itemFieldName = "MonitorTransData")
	private List<MonitorTransData> MonitorTransData;


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


	@JSONField(name = "MonitorTransData")
	public List<MonitorTransData> getMonitorTransData() {
		return MonitorTransData;
	}

	public void setMonitorTransData(List<MonitorTransData> monitorTransData) {
		MonitorTransData = monitorTransData;
	}


	public MT_WEB_GET_OVERVIEW_RESP() {
		super();
	}

	public MT_WEB_GET_OVERVIEW_RESP(String type, String message, List<app.MonitorTransData> monitorTransData) {
		super();
		Type = type;
		Message = message;
		MonitorTransData = monitorTransData;
	}



	
	
}
