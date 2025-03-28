package Day06.Ex01_추상클래스;

public class circle extends Shape{

	double radius; //반지름
	
	
	public Circle() {
		this(0);
		
		public Circle(double radiius) {
			this.radius =radius;
			
			
		}
	}
	@Override
	double area() {
		//원의 넓이 = 원주율 x 반지름x 반지름
		return Math.PI*radius *radius;
	}
	//getter,setter
	@Override
	double round() {
		return 2 * Math.PI * radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	
	//toStirng()
	
	
}
