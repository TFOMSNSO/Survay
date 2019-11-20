package nsk.tfoms.survay.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

public class Util {

	public static Map<Integer, String> getMo(String st)
	{
			return getProperties(st);
	}
		
	private static Map<Integer, String> getProperties(String filename) 
	{
		Properties prop = new Properties();
		Map<Integer, String> map = new TreeMap<Integer, String>(
					new Comparator<Integer>() {
		 
					@Override
					public int compare(Integer o1, Integer o2) {
						return o1.compareTo(o2);
					}
		 
				});
		try {
		    InputStream stream = new FileInputStream(new File(filename));
		    InputStreamReader  reader = new InputStreamReader(stream,"UTF-8");
			prop.load(reader);
	
			Enumeration<?> e = prop.keys();
			while(e.hasMoreElements()) {
				String key = (String)e.nextElement();
				map.put(Integer.parseInt(key), prop.getProperty(key));
			}
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return map;
	}
}
