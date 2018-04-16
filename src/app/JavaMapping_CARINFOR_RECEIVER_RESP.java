package app;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import com.alibaba.fastjson.JSON;
import com.sap.aii.mapping.api.AbstractTransformation;
import com.sap.aii.mapping.api.StreamTransformationException;
import com.sap.aii.mapping.api.TransformationInput;
import com.sap.aii.mapping.api.TransformationOutput;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.naming.NoNameCoder;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class JavaMapping_CARINFOR_RECEIVER_RESP extends AbstractTransformation {

	@Override
	public void transform(TransformationInput in, TransformationOutput out) throws StreamTransformationException {
		this.execute(in.getInputPayload().getInputStream(), out.getOutputPayload().getOutputStream());
	}

	public void execute(InputStream is, OutputStream os) throws StreamTransformationException {
		String outjson = "";
		String inxml = "";
		try {
			XStream xstream = new XStream(new DomDriver("utf-8", new NoNameCoder()));
			xstream.processAnnotations(MT_WEB_CARINFOR_RECEIVER_RESP.class);
			MT_WEB_CARINFOR_RECEIVER_RESP ob1 = (MT_WEB_CARINFOR_RECEIVER_RESP) xstream.fromXML(is);
			outjson = JSON.toJSONString(ob1);
			
//			MT_WEB_CARINFOR_RECEIVER_RESP ob1 = new MT_WEB_CARINFOR_RECEIVER_RESP();
//			List<CarNumbs> datas = new ArrayList<CarNumbs>();
//			CarNumbs c = new CarNumbs();
//			c.setCarNumb("111");
//			datas.add(c);
//			CarNumbs c1 = new CarNumbs();
//			c1.setCarNumb("111");
//			datas.add(c1);
//			CarNumbs c2 = new CarNumbs();
//			c2.setCarNumb("111");
//			datas.add(c2);
//			ob1.setData(datas);
//			ob1.setMessage("message");
//			outjson = JSON.toJSONString(ob1);
//			XStream xstream2 = new XStream(new DomDriver("utf-8", new NoNameCoder()));
//			xstream2.processAnnotations(ob1.getClass());
//			inxml = xstream2.toXML(ob1);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			os.write(outjson.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
