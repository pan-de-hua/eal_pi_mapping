package app;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONField;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("ns0:MT_APP_IMAGE_GET_RECEIVER_REQ")
public class MT_APP_IMAGE_GET_SENDER_REQ implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 198631681369939208L;
	
	@XStreamAsAttribute 
    @XStreamAlias("xmlns:ns0")
    final String ns0="urn:eal:tm:app";
	

    @XStreamAlias("PicUID")
	private String PicUID;

    @JSONField(name = "PicUID")
	public String getPicUID() {
		return PicUID;
	}


	public void setPicUID(String picUID) {
		PicUID = picUID;
	}


	public MT_APP_IMAGE_GET_SENDER_REQ(String picUID) {
		super();
		PicUID = picUID;
	}


	public MT_APP_IMAGE_GET_SENDER_REQ() {
		super();
	}
    
    
}
