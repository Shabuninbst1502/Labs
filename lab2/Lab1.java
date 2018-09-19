import java.util.Scanner;

public class Lab1 {
	public static void main(String[] argv) {
		
		enterThePoint();

		Point3d firstPoint = createPoint();
		Point3d secondPoint = createPoint();
		Point3d thridPoint = createPoint();

		if (firstPoint.equals(secondPoint)) {
			Error();
		} else if(secondPoint.equals(thridPoint)) {
			Error();
		} else if(firstPoint.equals(thridPoint)) {
			Error();
		} else {
			print(computeArea(firstPoint, secondPoint, thridPoint));
		}
	}

	public static Point3d createPoint() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("x: ");
		double x = scanner.nextDouble();
		System.out.println("y: ");
		double y = scanner.nextDouble();
		System.out.println("z: ");
		double z = scanner.nextDouble();
		return new Point3d(x, y, z);
	}

	public static void Error() {
		System.out.println("Не должно быть равных точек");
	}

	public static void enterThePoint(int n) {
		System.out.println("Введите 3 точки");
	}

	public static void print(double result) {
		System.out.println("Площадь равна: " + result);
	}

	public static double computeArea(Point3d firstPoint, Point3d secondPoint, Point3d thridPoint) {
		return Math.sqrt(
			(firstPoint.getX() + secondPoint.getX() + thridPoint.getX()) * 
			(- firstPoint.getX() + secondPoint.getX() + thridPoint.getX()) * 
			(firstPoint.getX() - secondPoint.getX() + thridPoint.getX()) * 
			(firstPoint.getX() + secondPoint.getX() - thridPoint.getX())) / 4;
	}
} 