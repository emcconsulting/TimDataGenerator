import java.util.Random;

import com.cdr.gen.util.RandomGaussian;


public class test {
	
	public static void getLocation(double x0, double y0, int radius) {
	    Random random = new Random();

	    // Convert radius from meters to degrees
	    double radiusInDegrees = radius / 111000f;

	    double u = random.nextDouble();
	    double v = random.nextDouble();
	    double w = radiusInDegrees * Math.sqrt(u);
	    double t = 2 * Math.PI * v;
	    double x = w * Math.cos(t);
	    double y = w * Math.sin(t);

	    // Adjust the x-coordinate for the shrinking of the east-west distances
	    double new_x = x / Math.cos(Math.toRadians(y0));

	    double foundLongitude = new_x + x0;
	    double foundLatitude = y + y0;
	    System.out.println(foundLongitude + ","+ foundLatitude );
	}
	
	public static void main(String[] args) {
		
		for (int i=0; i<1000; i++){
		getLocation(19.8388, 78.7378, 300000);
		}
}
}
