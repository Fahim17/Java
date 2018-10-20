import java.util.Random;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		for (int i = 0; i < 500; i++) {
			System.out.println((r.nextInt(200))-100);
			
		}
	}

}
