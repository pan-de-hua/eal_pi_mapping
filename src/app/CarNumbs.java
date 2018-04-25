package app;

import com.alibaba.fastjson.annotation.JSONField;
import com.thoughtworks.xstream.annotations.XStreamAlias;
public class CarNumbs {
	
	@XStreamAlias("CarNumb")
	private String CarNumb;
	
	@JSONField(name = "CarNumb")
	public String getCarNumb() {
		return CarNumb;
	}

	public void setCarNumb(String carNumb) {
		CarNumb = carNumb;
	}
	
}
