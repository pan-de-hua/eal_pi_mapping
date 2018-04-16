package app;

import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
@XStreamAlias("ns0:MT_WEB_GET_OVERVIEW_REQ")
public class MT_WEB_GET_OVERVIEW_REQ implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3088044253967246390L;

	@XStreamAsAttribute 
    @XStreamAlias("xmlns:ns0")
    final String ns0="urn:eal:tm:app";
	
	@XStreamAlias("CarNumb")
	private String CarNumb;
	@XStreamAlias("KabanID")
	private String KabanID;
	@XStreamAlias("Status")
	private String Status;
	
	@JSONField(name = "CarNumb")
	public String getCarNumb() {
		return CarNumb;
	}

	public void setCarNumb(String carNumb) {
		CarNumb = carNumb;
	}

	@JSONField(name = "KabanID")
	public String getKabanID() {
		return KabanID;
	}

	public void setKabanID(String kabanID) {
		KabanID = kabanID;
	}

	@JSONField(name = "Status")
	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public MT_WEB_GET_OVERVIEW_REQ() {
		super();
	}

	public MT_WEB_GET_OVERVIEW_REQ(String carNumb, String kabanID, String status) {
		super();
		CarNumb = carNumb;
		KabanID = kabanID;
		Status = status;
	}

}
