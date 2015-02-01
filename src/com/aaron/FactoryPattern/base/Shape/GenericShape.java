package com.aaron.FactoryPattern.base.Shape;

import com.aaron.FactoryPattern.ShapeAPI.*;

public class GenericShape implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside GenericShape::draw() method.");
	}
}