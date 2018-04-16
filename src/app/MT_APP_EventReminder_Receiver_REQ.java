package app;

import java.io.Serializable;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
@XStreamAlias("nm:MT_APP_EventReminder_Sender_REQ")
public class MT_APP_EventReminder_Receiver_REQ implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9130630735264913335L;
	@XStreamAsAttribute 
    @XStreamAlias("xmlns:nm")
    final String nm="urn:eal:tm:app";
	
	@XStreamImplicit(itemFieldName = "DATA")
	private List<EventReminder> DATA;
	@JSONField(name = "DATA")
	public List<EventReminder> getDATA() {
		return DATA;
	}

	public void setDATA(List<EventReminder> dATA) {
		DATA = dATA;
	}

	public MT_APP_EventReminder_Receiver_REQ(List<EventReminder> dATA) {
		super();
		DATA = dATA;
	}

	public MT_APP_EventReminder_Receiver_REQ() {
		super();
	}
	
	
}
