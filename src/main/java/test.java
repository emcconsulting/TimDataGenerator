import java.util.Random;

import com.cdr.gen.util.RandomGaussian;


public class test {
	
	public static void main(String[] args) {
		
	
		  Random rand = new Random();
	    
		rand.setSeed(System.currentTimeMillis());

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt(10) + 0;

        System.out.println (randomNum);

}
}
