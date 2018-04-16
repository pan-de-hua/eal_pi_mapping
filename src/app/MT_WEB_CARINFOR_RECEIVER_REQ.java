package app;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONField;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
@XStreamAlias("ns0:MT_WEB_CARINFOR_RECEIVER_REQ")
public class MT_WEB_CARINFOR_RECEIVER_REQ implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6704116861776700496L;

	@XStreamAsAttribute 
    @XStreamAlias("xmlns:ns0")
    final String ns0="urn:eal:tm:app";
	
	@XStreamAlias("CarNumb")
	private String CarNumb;

	@JSONField(name = "CarNumb")
	public String getCarNumb() {
		return CarNumb;
	}

	public void setCarNumb(String carNumb) {
		CarNumb = carNumb;
	}

	public MT_WEB_CARINFOR_RECEIVER_REQ() {
		super();
	}

	public MT_WEB_CARINFOR_RECEIVER_REQ(String carNumb) {
		super();
		CarNumb = carNumb;
	}

	


	
}
