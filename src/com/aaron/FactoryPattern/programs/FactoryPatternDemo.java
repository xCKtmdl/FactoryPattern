package com.aaron.FactoryPattern.programs;

import java.io.IOException;

import com.aaron.FactoryPattern.*;
import com.aaron.FactoryPattern.ShapeAPI.*;

public class FactoryPatternDemo<T> {

	   public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
	     
		   ClassFactory<Shape> newClassFactory = new ClassFactory<Shape>("C:\\eclipse\\projects\\FactoryPattern\\classmappings.txt");
		   
		   Shape shape1 = (Shape) newClassFactory.getClass("com.aaron.FactoryPattern.base.Shape.GenericShape");
		   
		   shape1.draw();

	   }
	}