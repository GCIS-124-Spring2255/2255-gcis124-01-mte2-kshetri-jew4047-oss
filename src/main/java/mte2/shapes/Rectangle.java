// Question: Q1 (mte2, gcis124, 2255)
// Package name: shapes
// File name: Rectangle.java

package mte2.shapes;

public class Rectangle {
   public class Rectangle implements Shape {
    
       private final double length;
       private final double width;

       public Rectangle(double length,double width) {  this.length = length;  this.width = width;  }
       
       @Override
       public double perimeter(){
        return (double) 2*(this.length + this.width);
       }
       @Override
       public double area(){
        return (double) this.length * this.width;
       }
   }
    public static void main(String[] args) {
        
        // ...

    }
    
}