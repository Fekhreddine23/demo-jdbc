package fr.diginamic.props;

import java.util.Enumeration;
import java.util.ResourceBundle;



public class TestConfigurationProps {

	public static void main(String[] args) {
		ResourceBundle config = ResourceBundle.getBundle("Appli");
		String userData = config.getString("database.user");
		System.out.println(userData);
		
		
		Enumeration<String> enumeration1 = config.getKeys();
		while (enumeration1.hasMoreElements()) {
			String key = enumeration1.nextElement();
			String val = config.getString(key);
			System.out.println(key + " : " + val);
			
		}
	}
}
