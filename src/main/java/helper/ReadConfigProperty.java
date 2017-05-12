package helper;

import java.io.InputStream;
import java.util.Properties;


public class ReadConfigProperty {

	protected InputStream input = null;
	protected Properties prop = null;
	
	public ReadConfigProperty(){
		try {
			input = ReadConfigProperty.class.getClassLoader().getResourceAsStream("resource/config.properties");
			prop = new Properties();
			prop.load(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getUrl(){
		if (prop.getProperty("url") == null)
			return "";
		System.err.println("URL: "+prop.getProperty("url"));
		return prop.getProperty("url");
	}
	
	public String getBrowser(){
		if (prop.getProperty("browser") == null)
			return "";
		System.err.println("Browser: "+prop.getProperty("browser"));
		return prop.getProperty("browser");
	}
	
	public String getUsername(){
		if (prop.getProperty("Username") == null)
			return "";
		System.err.println("Username: "+prop.getProperty("Username"));
		return prop.getProperty("Username");
	}
	
	public String getPassword(){
		if (prop.getProperty("Password") == null)
			return "";
		System.err.println("Password: "+prop.getProperty("Password"));
		return prop.getProperty("Password");
	}


}
