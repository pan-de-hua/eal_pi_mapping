package app;

import com.alibaba.fastjson.annotation.JSONField;
import com.thoughtworks.xstream.annotations.XStreamAlias;

public class GoodsData {
	@XStreamAlias("Waybill_prefix")
	private String Waybill_prefix;
	@XStreamAlias("Waybill")
	private String Waybill;
	@XStreamAlias("Weight")
	private String Weight;
	@XStreamAlias("PCS")
	private String PCS;
	@XStreamAlias("BatchFlag")
	private String BatchFlag;
	@XStreamAlias("FO")
	private String FO;
	
	@JSONField(name = "Waybill")
	public String getWaybill() {
		return Waybill;
	}
	public void setWaybill(String waybill) {
		Waybill = waybill;
	}
	
	@JSONField(name = "Weight")
	public String getWeight() {
		return Weight;
	}
	public void setWeight(String weight) {
		Weight = weight;
	}
	@JSONField(name = "Waybill_prefix")
	public String getWaybill_prefix() {
		return Waybill_prefix;
	}
	public void setWaybill_prefix(String waybill_prefix) {
		Waybill_prefix = waybill_prefix;
	}
	@JSONField(name = "PCS")
	public String getPCS() {
		return PCS;
	}
	public void setPCS(String pCS) {
		PCS = pCS;
	}

	@JSONField(name = "BatchFlag")
	public String getBatchFlag() {
		return BatchFlag;
	}
	public void setBatchFlag(String batchFlag) {
		BatchFlag = batchFlag;
	}

	@JSONField(name = "FO")
	public String getFO() {
		return FO;
	}
	public void setFO(String fO) {
		FO = fO;
	}
	
	
}
