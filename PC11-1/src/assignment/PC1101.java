package assignment;

public class PC1101 {

	public static void main(String[] args) {
		double[] scores = { 100.0, 45.3, 100.1, -1.0 };
		TestScores midterm;
		
		try {
			midterm = new TestScores(scores);
			midterm.averageScore();
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
