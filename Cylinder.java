/*
 * A Cylinder is a Circle plus a height.
 */

// Task 1a. Edit the definition to make Cylinder a subclass of Circle
//         

public class Cylinder extends Circle {
    
    // Task 1b. add additional private height attribute (double)
    private double height;

    // Task 2. add code to define the following four constructors
    // no-arg constructor (set height to 1.0)
    // 1-arg constructor (set height to the given value)
    // 2-arg constructor (set height and radius to the given values)
    // 3-arg constructor (set height, radius, and color to the given values)

    public Cylinder(){
        height = 1.0;
    }

    public Cylinder(double height){
        this.height = height;
    }

    public Cylinder(double height, double radius){
        super(radius);
        this.height = height;
    }

    public Cylinder(double height, double radius, String colour){
        super(radius,colour);
        this.height = height;
    }

    
    // Task 3. add getter and setter for height
    // (methods for radius and color are inherited)
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }

    // Task 4. add code for method getVolume()
    // make use of superclass' getArea() method
    public double getVolume(){
        return height * super.getArea();
    }

 
    // Task 5. Override toString() method to describe itself
    // (output format should be in line with format: Cylinder[Circle[...],height=X.XX]
    public String toString(){
        return String.format("Cylinder[Circle[radius=%.2f,color=%s],height=%.2f]", super.getRadius(), super.getColor(),height);
    }

    // add following in to Cylinder.java
   @Override
   public double getArea() {
        return (2 * super.getArea()) + ((2*Math.PI*super.getRadius())*height);
   }  

   public double getBaseArea(){
        return super.getArea();
   }

 }