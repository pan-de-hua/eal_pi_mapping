package app;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.io.IOUtils;

import com.alibaba.fastjson.JSON;
import com.sap.aii.mapping.api.AbstractTransformation;
import com.sap.aii.mapping.api.StreamTransformationException;
import com.sap.aii.mapping.api.TransformationInput;
import com.sap.aii.mapping.api.TransformationOutput;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.naming.NoNameCoder;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class JavaMapping_GET_TASK_REQ extends AbstractTransformation {

	@Override
	public void transform(TransformationInput in, TransformationOutput out)
			throws StreamTransformationException {
		this.execute(in.getInputPayload().getInputStream(), out
				.getOutputPayload().getOutputStream());
	}
	
	public void execute(InputStream is, OutputStream os)
			throws StreamTransformationException {
		String outjson = "";
		String inxml = "";
		try {
			 outjson = IOUtils.toString(is);
			 MT_APP_RECEIVER_GET_TASK_REQ userObj = JSON.parseObject(outjson,MT_APP_RECEIVER_GET_TASK_REQ.class);  
			 XStream xstream=new XStream(new DomDriver("utf-8", new NoNameCoder()));
			 xstream.processAnnotations(userObj.getClass());
			 inxml =xstream.toXML(userObj);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			os.write(inxml.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
