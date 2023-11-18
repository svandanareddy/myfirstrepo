package DDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingDataFromPropertyFile {
	public static void main(String[]args) throws IOException {
	FileInputStream fis=new FileInputStream("./textdata/data.properties");
	Properties property=new Properties();
	property.load(fis);
	String value=property.getProperty("username");
	
	System.out.println(value);
	

}
}