package app;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONField;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
@XStreamAlias("ns0:MT_WEB_TRANSINFOR_GET_REQ")
public class MT_WEB_TRANSINFOR_GET_REQ implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = -2799486816739140570L;

	@XStreamAsAttribute 
    @XStreamAlias("xmlns:ns0")
    final String ns0="urn:eal:tm:app";
	
	@XStreamAlias("CarNumb")
	private String CarNumb;
	@XStreamAlias("Waybill")
	private String Waybill;
	@XStreamAlias("KabanID")
	private String KabanID;
	
	@JSONField(name = "Waybill")
	public String getWaybill() {
		return Waybill;
	}

	public void setWaybill(String waybill) {
		Waybill = waybill;
	}
	
	@JSONField(name = "KabanID")
	public String getKabanID() {
		return KabanID;
	}

	public void setKabanID(String kabanID) {
		KabanID = kabanID;
	}

	@JSONField(name = "CarNumb")
	public String getCarNumb() {
		return CarNumb;
	}

	public void setCarNumb(String carNumb) {
		CarNumb = carNumb;
	}

	public MT_WEB_TRANSINFOR_GET_REQ() {
		super();
	}

	public MT_WEB_TRANSINFOR_GET_REQ(String carNumb, String waybill, String kabanID) {
		super();
		CarNumb = carNumb;
		Waybill = waybill;
		KabanID = kabanID;
	}



	


	
}
