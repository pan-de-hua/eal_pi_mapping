package app;

import com.alibaba.fastjson.annotation.JSONField;
import com.thoughtworks.xstream.annotations.XStreamAlias;

public class Picture {
	@XStreamAlias("PicUID")
	private String PicUID;
	@XStreamAlias("PicData")
	private String PicData;
	@XStreamAlias("PicUrl")
	private String PicUrl;
	
	@JSONField(name = "PicUID")
	public String getPicUID() {
		return PicUID;
	}
	public void setPicUID(String picUID) {
		PicUID = picUID;
	}
	
	@JSONField(name = "PicData")
	public String getPicData() {
		return PicData;
	}
	public void setPicData(String picData) {
		PicData = picData;
	}
	
	@JSONField(name = "PicUrl")
	public String getPicUrl() {
		return PicUrl;
	}
	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}
	
}
