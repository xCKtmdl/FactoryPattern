package com.aaron.FactoryPattern;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.aaron.FactoryPattern.ShapeAPI.Shape;

public class ClassFactory<T> {

	
	private Map<String, String> classMappings = new HashMap<>();

	// C:\eclipse\projects\FactoryPattern\classmappings.txt

	public ClassFactory( String strClassMappingsFilePath)
			throws IOException {
		
		BufferedReader reader = new BufferedReader(new FileReader(
				strClassMappingsFilePath));

		String line = null;
		while ((line = reader.readLine()) != null) {
			String[] stringSplit = line.split(";");
			classMappings.put(stringSplit[0], stringSplit[1]);
		}

		reader.close();

	}
	


	public T getClass(String inputClass) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class<T> myspecialclass = (Class<T>)  Class.forName(classMappings.get(inputClass));
		@SuppressWarnings("unchecked")
		T myspecialshape =  myspecialclass.newInstance();
		return myspecialshape;
	
	}
}
