import java.util.Random;

public class TestDemo {

	public int addPositive (int a, int b) {
		int num = 0;
		if (a >= 0 && b >= 0) {
			num = a+b;
		}else {
			throw new IllegalArgumentException("Both parameters must be positive!");
		}
		return num;
	}
	
	int randomNumberSquared() {
		int i = getRandomInt();
		return i*i;
	}

	int getRandomInt() {
		Random random = new Random();
		return random.nextInt(10) + 1;
	}
}
