package app;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONField;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
@XStreamAlias("ns0:MT_APP_EM_GET_RECEIVER_REQ")
public class MT_APP_EM_GET_SENDER_REQ implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7912633276090522749L;

	@XStreamAsAttribute 
    @XStreamAlias("xmlns:ns0")
    final String ns0="urn:eal:tm:app";
	
	@XStreamAlias("OrderID")
	private String OrderID;

	@JSONField(name = "OrderID")
	public String getOrderID() {
		return OrderID;
	}

	public void setOrderID(String orderID) {
		OrderID = orderID;
	}

	public MT_APP_EM_GET_SENDER_REQ() {
		super();
	}

	public MT_APP_EM_GET_SENDER_REQ(String orderID) {
		super();
		OrderID = orderID;
	}
	
}
