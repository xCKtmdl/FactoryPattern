package com.aaron.FactoryPattern.custom.Shape;

import com.aaron.FactoryPattern.ShapeAPI.*;

public class Square implements Shape {

	   @Override
	   public void draw() {
	      System.out.println("Inside Square::draw() method.");
	   }
	}