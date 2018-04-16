package app;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.io.IOUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.sap.aii.mapping.api.AbstractTransformation;
import com.sap.aii.mapping.api.StreamTransformationException;
import com.sap.aii.mapping.api.TransformationInput;
import com.sap.aii.mapping.api.TransformationOutput;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.naming.NoNameCoder;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class JavaMapping_EventReminder_REQ extends AbstractTransformation{

	@Override
	public void transform(TransformationInput in, TransformationOutput out)
			throws StreamTransformationException {
		this.execute(in.getInputPayload().getInputStream(), out
				.getOutputPayload().getOutputStream());
	}
	
	public void execute(InputStream is, OutputStream os)
			throws StreamTransformationException {
		String outjson = "";
		try {
			XStream xstream = new XStream(new DomDriver("utf-8", new NoNameCoder()));
			xstream.processAnnotations(MT_APP_EventReminder_Receiver_REQ.class);
			MT_APP_EventReminder_Receiver_REQ ob1 = (MT_APP_EventReminder_Receiver_REQ) xstream.fromXML(is);
			outjson = JSON.toJSONString(ob1);
			JSONObject jsonObject = JSONObject.parseObject(outjson) ;
			for(java.util.Map.Entry<String,Object> entry:jsonObject.entrySet()){  
				outjson = entry.getValue().toString();  
	           }  

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
