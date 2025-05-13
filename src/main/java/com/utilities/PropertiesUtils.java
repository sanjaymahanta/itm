package com.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertiesUtils {

	
	public static String  readProperty(String key) {
		  
		  
		  FileInputStream fis = null;
		  Properties props = new Properties();
		  
		String path =  System.getProperty("user.dir")+"/src/main/resources/config.properties";
		
		  
		  try {
			fis  = new FileInputStream(path);
			props.load(fis);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
			if(fis!=null) {
				fis.close();
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		 return  props.getProperty(key);
		  
	  }
	}


