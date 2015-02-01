package com.aaron.FactoryPattern.custom.Shape;

import com.aaron.FactoryPattern.ShapeAPI.*;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}