package app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import com.sap.aii.mapping.api.StreamTransformationException;

public class run_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaMapping_APP_GET_EVENTS_RESP jm = new JavaMapping_APP_GET_EVENTS_RESP();
		String src = "d:\\PI\\is12.txt";
		InputStream in = null;
		try {
			in = new FileInputStream(new File(src));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		File file = new File("d:\\PI\\out12.txt");
		OutputStream os = null;
		try {
			os = new FileOutputStream(file,true);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			jm.execute(in,os);
		} catch (StreamTransformationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
