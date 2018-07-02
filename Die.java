import java.util.Random;

public class Die {

	private int faceValue;
	private int maxFaceValue;
	private Random rand = new Random();

	public Die() {
		maxFaceValue = 6;
	}

	public Die( int maxFaceFalue ) {
		this.maxFaceValue = maxFaceValue;
	}

	public void roll() {
		faceValue = rand.nextInt(maxFaceValue)+1;
	}

	public int getFaceValue() {
		return faceValue;
	}
}