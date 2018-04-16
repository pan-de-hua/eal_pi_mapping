package app;

import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
@XStreamAlias("ns0:MT_WEB_GET_ALLEVENTS_REQ")
public class MT_WEB_GET_ALLEVENTS_REQ implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = -1779481995018485462L;

	@XStreamAsAttribute 
    @XStreamAlias("xmlns:ns0")
    final String ns0="urn:eal:tm:app";
	
	@XStreamAlias("CarNumb")
	private String CarNumb;
	@XStreamAlias("EVType")
	private String EVType;
	@XStreamAlias("DateTime1")
	private String DateTime1;
	@XStreamAlias("DateTime2")
	private String DateTime2;
	
	@JSONField(name = "CarNumb")
	public String getCarNumb() {
		return CarNumb;
	}


	public void setCarNumb(String carNumb) {
		CarNumb = carNumb;
	}

	@JSONField(name = "EVType")
	public String getEVType() {
		return EVType;
	}


	public void setEVType(String eVType) {
		EVType = eVType;
	}

	@JSONField(name = "DateTime1")
	public String getDateTime1() {
		return DateTime1;
	}


	public void setDateTime1(String dateTime1) {
		DateTime1 = dateTime1;
	}

	@JSONField(name = "DateTime2")
	public String getDateTime2() {
		return DateTime2;
	}


	public void setDateTime2(String dateTime2) {
		DateTime2 = dateTime2;
	}


	public MT_WEB_GET_ALLEVENTS_REQ() {
		super();
	}


	public MT_WEB_GET_ALLEVENTS_REQ(String carNumb, String eVType, String dateTime1, String dateTime2) {
		super();
		CarNumb = carNumb;
		EVType = eVType;
		DateTime1 = dateTime1;
		DateTime2 = dateTime2;
	}

	
}
