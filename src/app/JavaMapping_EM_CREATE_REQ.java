package app;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

import org.apache.commons.io.IOUtils;

import com.alibaba.fastjson.JSON;
import com.sap.aii.mapping.api.AbstractTransformation;
import com.sap.aii.mapping.api.StreamTransformationException;
import com.sap.aii.mapping.api.TransformationInput;
import com.sap.aii.mapping.api.TransformationOutput;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.naming.NoNameCoder;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class JavaMapping_EM_CREATE_REQ extends AbstractTransformation{
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
		String inxml = "";
		try {
			 outjson = IOUtils.toString(is);
			 MT_APP_EM_CREATE_REQ Obj = JSON.parseObject(outjson,MT_APP_EM_CREATE_REQ.class); 
			 //XStream xstream1 = new XmlDeclarationXStream();
			 XStream xstream=new XStream(new DomDriver("UTF-8", new NoNameCoder()));
			 xstream.processAnnotations(Obj.getClass());
			 os.write(getDeclaration().getBytes()); 
			 xstream.toXML(Obj,os);
		} catch (Exception e) {
			e.printStackTrace();
		}

//		try {
//			os.write(inxml.getBytes());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
	public String getDeclaration() {  
        return "<?xml version=\"" + this.version + "\" encoding=\"" + this.ecoding + "\"?>";  
    }
}
