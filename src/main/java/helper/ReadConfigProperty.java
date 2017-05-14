package helper;

import java.io.InputStream;
import java.util.Properties;


public class ReadConfigProperty {

	protected InputStream input = null;
	protected Properties prop = null;
	
	public ReadConfigProperty(){
		try {
			System.out.println("aaaaaaaaaaaaaa ");

			input = ReadConfigProperty.class.getClassLoader().getResourceAsStream("config.properties");
			System.out.println("aaaaaaaaaaaaaa "+input);
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
		if (prop.getProperty("username") == null)
			return "";
		System.err.println("Username: "+prop.getProperty("username"));
		return prop.getProperty("username");
	}
	
	public String getPassword(){
		if (prop.getProperty("password") == null)
			return "";
		System.err.println("Password: "+prop.getProperty("password"));
		return prop.getProperty("password");
	}


}
