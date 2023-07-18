package day04.practice;

public class PolygonTest {
	public static void main(String[] args) {
		Polygon rec;
		
		try {
			
			rec = new Rectangle(1,1);
	
			rec.calculateArea();
			rec.circumference();
			
			RightAngledTriangle ratt = new RightAngledTriangle(20.0, 10.0);
			ratt.calculateArea();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}