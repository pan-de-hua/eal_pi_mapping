package app;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
@XStreamAlias("ns0:MT_APP_RECEIVER_GET_TASK_REQ")
public class MT_APP_RECEIVER_GET_TASK_REQ implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5076086365289320737L;
	@XStreamAlias("UserID")
	private String UserID;
	@XStreamAsAttribute 
    @XStreamAlias("xmlns:ns0")
    final String ns0="urn:eal:tm:app";
	
	public String getUserID() {
		return UserID;
	}

	public void setUserID(String userID) {
		UserID = userID;
	}

	public MT_APP_RECEIVER_GET_TASK_REQ() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MT_APP_RECEIVER_GET_TASK_REQ(String userID) {
		super();
		UserID = userID;
	}
	
}
