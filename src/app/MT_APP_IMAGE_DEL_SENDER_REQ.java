package app;

import java.io.Serializable;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
@XStreamAlias("ns0:MT_APP_IMAGE_DEL_RECEIVER_REQ")
public class MT_APP_IMAGE_DEL_SENDER_REQ implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4705596715525932004L;
	@XStreamAsAttribute 
    @XStreamAlias("xmlns:ns0")
    final String ns0="urn:eal:tm:app";
	
	
	@XStreamImplicit(itemFieldName = "Images")
	private List<Picture> Images;
	
	@JSONField(name = "Images")
	public List<Picture> getImages() {
		return Images;
	}

	public void setImages(List<Picture> images) {
		Images = images;
	}

	public MT_APP_IMAGE_DEL_SENDER_REQ(List<Picture> images) {
		super();
		Images = images;
	}

	public MT_APP_IMAGE_DEL_SENDER_REQ() {
		super();
	}
	
	
	
}
