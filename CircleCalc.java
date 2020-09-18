import java.util.Random;

/**
 * 
 * @author Jonathan Rayo
 *This Program will find the area and circumference  of a circle with a random radius up to 100.
 */

public class CircleCalc {
	
	/**
	This function calculates the circumference of a circle
	formula is 2*pi*r
	@param r is the random radius generated.
	@return C is the circumference that will be returned to the user.
	*/
	
	public static double computeCircum(int r) {
		double C = 2*Math.PI*r;
		return C;
	}
	/**
	 * This function calculates the area of a circle
	 * formula is pi*r^2
	 * @param r this is the radius that is randomly generated
	 * @return this returns the area which is A
	 */
	
	public static double  computeArea(int r) {
		double A = Math.PI*Math.pow(r, 2);
		return A;
	}
	
	public static void main(String[] args) {
		Random rnd = new Random();
		int r;
		r = rnd.nextInt(100);
		double Area = computeArea(r);
		double C = computeCircum(r);
		System.out.printf("The radius is %d. \n",r);
		System.out.printf("The area of the circle is %.2f and the circumference is %.2f. \n", Area, C);		
	}

}
