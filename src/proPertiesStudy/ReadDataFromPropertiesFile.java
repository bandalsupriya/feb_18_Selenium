package proPertiesStudy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertiesFile {

	public static void main(String[] args) throws IOException {
		       
		       //1.create object of properties file
	             Properties prop=new Properties();
				
				//2.create object of file InPutStream
				//put the path of myPropertiesFile
				FileInputStream fileName=new FileInputStream("C:\\Users\\hp1\\eclipse-workspace\\feb_18_Selenium\\MyPropertiy.properties");
				
				//3.load prperties file
				prop.load(fileName);
				
				//4.get the properties
				//get data in myProperties.properties file(test_output folder)
				System.out.println(prop.get("url"));
				System.out.println(prop.get("mobNum"));
				System.out.println(prop.get("pwd"));
				

			}

	}


