package xyz.curuhome.chap110;
public class Radian {
    private double rad;
    Radian (double theta){
		rad = Math.PI/180.0*theta;
	}
	public double getRad() {
		return rad;
	}
	public static double RadtoTheta(double rad) {
		return 180.0/Math.PI*rad;
	}
	public static double thetaToRad(double theta) {
		return Math.PI/180.0*theta;
	}
}