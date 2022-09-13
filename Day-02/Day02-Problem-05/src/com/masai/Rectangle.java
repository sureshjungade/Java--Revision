package com.masai;

public class Rectangle {

	private double width;
	private double length;
	
	public Rectangle(double width, double length) {
		if(width>=0 && length>=0) {
			this.width = width;
			this.length = length;
				
		}else if(length<0 && width>=0) {
			this.length = 0;
			this.width = width;
		}else if(length>=0 && width<0) {
			this.width = 0;
			this.length = length;
		}else {
			this.length = 0;
			this.width = 0;
		}
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getLength() {
		return length;
	}
	
	public double getArea() {
		return (width * length);
	}
	
}
