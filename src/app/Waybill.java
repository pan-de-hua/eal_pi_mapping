package app;

import com.alibaba.fastjson.annotation.JSONField;
import com.thoughtworks.xstream.annotations.XStreamAlias;

public class Waybill {
	
	@XStreamAlias("Waybill")
	private String Waybill;
	
	@JSONField(name = "Waybill")
	public String getWaybill() {
		return Waybill;
	}

	public void setWaybill(String waybill) {
		Waybill = waybill;
	}
	
}
