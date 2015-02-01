package com.aaron.FactoryPattern.custom.Shape;

import com.aaron.FactoryPattern.ShapeAPI.*;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}
}