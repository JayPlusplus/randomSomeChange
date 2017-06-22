import java.util.Random;
public class RandomSomeChange {

	public static void main(String[] args) {
		
		        output("Generate 10 random integers between 1 and 6");

		        Random rnd = new Random();
		        
		        for (int i = 1; i <= 10; ++i)
		        {
		          int randomInt = 5 + rnd.nextInt(91);
		          System.out.println("Generated number: " + randomInt);
		        }
		    
		        System.out.println("Done.");
		    }

	private static void output(String string) {
	
		}

	}

