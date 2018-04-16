package app;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.annotations.XStreamOmitField;


public class Task_Order {

	@XStreamAlias("OrderID")
	private String OrderID;
	@XStreamAlias("OrderType")
    private String OrderType;
	@XStreamAlias("KabanID")
    private String KabanID;
	@XStreamAlias("KabanDate")
    private String KabanDate;
	@XStreamAlias("CarNumb")
    private String CarNumb;
	@XStreamAlias("SrcLoc")
    private String SrcLoc;
	@XStreamAlias("DesLoc")
    private String DesLoc;
	@XStreamImplicit(itemFieldName = "Items")
    private List<Task_Order_Waybill> Items;
    
    @JSONField(name = "Items")
	public List<Task_Order_Waybill> getItems() {
		return Items;
	}
	public void setItems(List<Task_Order_Waybill> items) {
		Items = items;
	}
	
	@JSONField(name = "OrderID")
	public String getOrderID() {
		return OrderID;
	}
	public void setOrderID(String orderID) {
		OrderID = orderID;
	}
	@JSONField(name = "OrderType")
	public String getOrderType() {
		return OrderType;
	}
	public void setOrderType(String orderType) {
		OrderType = orderType;
	}
	@JSONField(name = "KabanID")
	public String getKabanID() {
		return KabanID;
	}
	public void setKabanID(String kabanID) {
		KabanID = kabanID;
	}
	@JSONField(name = "KabanDate")
	public String getKabanDate() {
		return KabanDate;
	}
	public void setKabanDate(String kabanDate) {
		KabanDate = kabanDate;
	}
	@JSONField(name = "CarNumb")
	public String getCarNumb() {
		return CarNumb;
	}
	public void setCarNumb(String carNumb) {
		CarNumb = carNumb;
	}
	@JSONField(name = "SrcLoc")
	public String getSrcLoc() {
		return SrcLoc;
	}
	public void setSrcLoc(String srcLoc) {
		SrcLoc = srcLoc;
	}
	@JSONField(name = "DesLoc")
	public String getDesLoc() {
		return DesLoc;
	}
	public void setDesLoc(String desLoc) {
		DesLoc = desLoc;
	}

}
