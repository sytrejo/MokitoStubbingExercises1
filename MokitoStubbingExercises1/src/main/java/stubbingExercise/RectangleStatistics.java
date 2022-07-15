package stubbingExercise;

public class RectangleStatistics {

	public int calculateArea(Rectangle rectangle1) {

		return rectangle1.getLength() * rectangle1.getWidth();
	}

	public int calculateCircumference(Rectangle rectangle1) {
		
		return 2*rectangle1.getLength() + 2*rectangle1.getWidth();
	}

}
