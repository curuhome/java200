package xyz.curuhome.chap110;
public class TriangleMain {
	public static void main(String[] args) {
		Triangle tri = new Triangle();
		System.out.println(tri.area(4));
		/* 6.928203230275509 */
		System.out.println(tri.area(4,4));
		/* 8.0 */
		System.out.println(tri.area(3,4,5.0));
		/* 6.0 */
		System.out.println(tri.area(3,4, new Radian(90)));
		/* 6.0 */
		System.out.println(tri.area(4, new Radian(60), new Radian(60)));
		/* 6.928203230275508 */

		System.out.println("1라디안 "+Radian.RadtoTheta(1)+"도");
		/* 1라디안 57.29577951308232도 */
		System.out.println("1도는 "+Radian.thetaToRad(1)+"라디안");
		/* 1도는 0.017453292519943295라디안 */
	}
}
