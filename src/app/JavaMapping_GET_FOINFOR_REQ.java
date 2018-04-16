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

public class JavaMapping_GET_FOINFOR_REQ extends AbstractTransformation {
    private String version = "1.0";  
    private String ecoding = "utf-8"; 
	@Override
	public void transform(TransformationInput in, TransformationOutput out)
			throws StreamTransformationException {
		this.execute(in.getInputPayload().getInputStream(), out
				.getOutputPayload().getOutputStream());
	}
	
	public void execute(InputStream is, OutputStream os)
			throws StreamTransformationException {
		String outjson = "";
		//String inxml = "";
		try {
			 outjson = IOUtils.toString(is);
			 MT_WEB_GET_FOINFOR_REQ Obj = JSON.parseObject(outjson,MT_WEB_GET_FOINFOR_REQ.class);  
			 XStream xstream=new XStream(new DomDriver(ecoding, new NoNameCoder()));
			 xstream.processAnnotations(Obj.getClass());
			 //inxml =xstream.toXML(Obj);
			 os.write(getDeclaration().getBytes(ecoding)); 
			 xstream.toXML(Obj,os);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public String getDeclaration() {  
        return "<?xml version=\"" + this.version + "\" encoding=\"" + this.ecoding + "\"?>";  
    }
}
