package java_practise02;

public class P_5_4 {

	public static void main(String[] args) {
		double triangleArea = calcTriangleArea(10, 20);
		System.out.println(triangleArea);
		double circleArea = calcCircleArea(5);
		System.out.println(circleArea);
	}

	public static double calcTriangleArea(double bottom, double height) {
		double area = bottom * height / 2;
		return area;
	}

	public static double calcCircleArea(double radius) {
		double area = radius * radius * 3.14;
		return area;
	}

}
