package com.javaex.ex04;

import java.util.ArrayList;
import java.util.List;

public class ShapeApp {

    public static void main(String[] args) {
        List<Shape> sList = new ArrayList<Shape> ();
        
        Shape r1 = new Rectangle(5, 6);
        Shape t1 = new RectTriangle(6, 2);
        
        sList.add(r1);
        sList.add(t1);
        
        for(int i = 0; i < sList.size(); i++) {
        	System.out.println("area: " + sList.get(i).getArea());
        	System.out.println("Perimeter: " + sList.get(i).getPerimeter());
        	if(sList.get(i) instanceof Resizeable) {
        		((Rectangle)sList.get(i)).resize(0.5);
        		System.out.println("new area: " + sList.get(i).getArea());
            	System.out.println("new Perimeter: " + sList.get(i).getPerimeter());
        	}
        }
        
    }
}
