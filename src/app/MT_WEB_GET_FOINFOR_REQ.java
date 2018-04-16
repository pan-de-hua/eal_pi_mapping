package app;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONField;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
@XStreamAlias("ns0:MT_WEB_GET_FOINFOR_REQ")
public class MT_WEB_GET_FOINFOR_REQ implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6255879148720749613L;

	@XStreamAsAttribute 
    @XStreamAlias("xmlns:ns0")
    final String ns0="urn:eal:tm:app";
	
	@XStreamAlias("FO")
	private String FO;
	
	@JSONField(name = "FO")
	public String getFO() {
		return FO;
	}

	public void setFO(String fO) {
		FO = fO;
	}

	public MT_WEB_GET_FOINFOR_REQ() {
		super();
	}

	public MT_WEB_GET_FOINFOR_REQ(String fO) {
		super();
		FO = fO;
	}
	
}
