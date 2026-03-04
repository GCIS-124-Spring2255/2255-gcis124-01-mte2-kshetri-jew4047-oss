// Question: Q1 (mte2, gcis124, 2255)
// Package name: shapes
// File name: Circle.java

package mte2.shapes;

public class Circle {
    public class Circle implements Shape {
    
      private final double radius;
      public Circle(double radius) {    this.radius = radius;    }
      @Override
      public double perimeter(){
        return (double) 2*(3.14)*this.radius;
      }
     @Override
     public double area(){
        return (double) 3.14 *(this.radius * this.radius);
     }
    }
    public static void main(String[] args) {
        
        // ...

    }
}