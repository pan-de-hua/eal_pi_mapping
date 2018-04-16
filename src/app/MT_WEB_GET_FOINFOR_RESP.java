package app;

import java.io.Serializable;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
@XStreamAlias("nm:MT_WEB_GET_FOINFOR_RESP")
public class MT_WEB_GET_FOINFOR_RESP implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 210417488007938156L;


	@XStreamAsAttribute 
    @XStreamAlias("xmlns:nm")
    final String nm="urn:eal:tm:app";
	
	
	@XStreamAlias("Type")
	private String Type;
	@XStreamAlias("Message")
	private String Message;
		
	@XStreamImplicit(itemFieldName = "GoodsData")
	private List<GoodsData> GoodsData;

	@XStreamImplicit(itemFieldName = "EventData")
	private List<EventData> EventData;
	
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

	@JSONField(name = "GoodsData")
	public List<GoodsData> getGoodsData() {
		return GoodsData;
	}

	public void setGoodsData(List<GoodsData> goodsData) {
		GoodsData = goodsData;
	}

	@JSONField(name = "EventData")
	public List<EventData> getEventData() {
		return EventData;
	}

	public void setEventData(List<EventData> eventData) {
		EventData = eventData;
	}

	public MT_WEB_GET_FOINFOR_RESP() {
		super();
	}

	public MT_WEB_GET_FOINFOR_RESP(String type, String message, List<app.GoodsData> goodsData,
			List<app.EventData> eventData) {
		super();
		Type = type;
		Message = message;
		GoodsData = goodsData;
		EventData = eventData;
	}
	
	
}
