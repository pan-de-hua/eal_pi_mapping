package app;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONField;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("ns0:MT_APP_GET_EVENTS_REQ")
public class MT_APP_GET_EVENTS_REQ implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3353568536177477009L;
	@XStreamAsAttribute 
    @XStreamAlias("xmlns:ns0")
    final String ns0="urn:eal:tm:app";
	
	@XStreamAlias("Waybill")
	private String Waybill;

	@JSONField(name = "Waybill")
	public String getWaybill() {
		return Waybill;
	}

	public void setWaybill(String waybill) {
		Waybill = waybill;
	}

	public MT_APP_GET_EVENTS_REQ(String waybill) {
		super();
		Waybill = waybill;
	}

	public MT_APP_GET_EVENTS_REQ() {
		super();
	}
	
}
