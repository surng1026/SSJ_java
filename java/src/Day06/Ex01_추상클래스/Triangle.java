package Day06.Ex01_추상클래스;

public class triangle extends Shape {

		double width, height;
		
		public Triangle() {
			this(0.0, 0.0);
			
		}
		
		public Triangle(double width, double height) {
			this.width = width;
			this.height = height;
			
		}
	@override
	double area() {
		//삼각형의 넓이 = (가로)x(세로)/2
		return width * height / 2;
	}
	
	@override
	double round() {
		//정삼각형
		//삼각형의 둘레 = 3*width
		return 3*width;
		
	}
	
	public double getWidth() {
		
	}
}
