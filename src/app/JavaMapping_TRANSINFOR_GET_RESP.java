package app;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.IOUtils;

import com.alibaba.fastjson.JSON;
import com.sap.aii.mapping.api.AbstractTransformation;
import com.sap.aii.mapping.api.StreamTransformationException;
import com.sap.aii.mapping.api.TransformationInput;
import com.sap.aii.mapping.api.TransformationOutput;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.basic.DateConverter;
import com.thoughtworks.xstream.io.naming.NoNameCoder;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class JavaMapping_TRANSINFOR_GET_RESP extends AbstractTransformation {

	@Override
	public void transform(TransformationInput in, TransformationOutput out) throws StreamTransformationException {
		this.execute(in.getInputPayload().getInputStream(), out.getOutputPayload().getOutputStream());
	}

	public void execute(InputStream is, OutputStream os) throws StreamTransformationException {
		String outjson = "";
		try {
			XStream xstream = new XStream(new DomDriver("utf-8", new NoNameCoder()));
			xstream.processAnnotations(MT_WEB_TRANSINFOR_GET_RESP.class);
			//xstream.registerConverter(new DateConverter("yyyy-MM-dd HH:mm:ss", null));
			MT_WEB_TRANSINFOR_GET_RESP ob1 = (MT_WEB_TRANSINFOR_GET_RESP) xstream.fromXML(is);
			outjson = JSON.toJSONString(ob1);
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
