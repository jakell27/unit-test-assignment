import java.util.Random;

public class TestDemo {

	public int addPositive (int a, int b) {
		if (a + b > 0) {
			System.out.println(a + b);
		} else {
			throw new IllegalArgumentException("Both parameters must be positive!");
		}
		return a + b;
	}
	
	public int randomNumberSquared () {
		int numberSquared = getRandomInt() * getRandomInt();
		return numberSquared;
	}
	int getRandomInt() {
		Random random = new Random();
		return random.nextInt(10) + 1;
	}
}
