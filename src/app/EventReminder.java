package app;

import com.alibaba.fastjson.annotation.JSONField;
import com.thoughtworks.xstream.annotations.XStreamAlias;

public class EventReminder {
	@XStreamAlias("UserID")
	private String UserID;
	@XStreamAlias("Message")
	private String Message;
	
	@JSONField(name = "UserID")
	public String getUserID() {
		return UserID;
	}
	public void setUserID(String userID) {
		UserID = userID;
	}
	@JSONField(name = "Message")
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	
}
