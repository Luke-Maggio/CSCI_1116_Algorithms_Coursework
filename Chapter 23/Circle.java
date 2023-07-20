package exercise23_03;

public class Circle extends GeometricObject {
	
	  public double radius;
	  public String color;
	  public int locationX;
	  public int locationY;
	  
	  public int circleID;
	  
	  /**Default constructor*/
	  public Circle() {
	    this(1.0);
	  }

	  /**Construct circle with a specified radius*/
	  public Circle(double radius) {
	    this(radius, "white", false);
	  }

	  /**Construct a circle with specified radius, filled, and color*/
	  public Circle(double radius, String color, boolean filled) {
	    super(color, filled);
	    this.radius = radius;
	  }

	  /**Return radius*/
	  public double getRadius() {
	    return radius;
	  }

	  /**Set a new radius*/
	  public void setRadius(double radius) {
	    this.radius = radius;
	  }

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
}
