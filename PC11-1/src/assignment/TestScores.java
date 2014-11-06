package assignment;

public class TestScores {
	private double average;
	
	public TestScores(double[] inputScores) throws Exception {
		int num = 0;
		double sum = 0;
		
		for(double score : inputScores) {
			if(score < 0 || score > 100)
				throw new Exception("Invalid score: " + score);
			
			sum += score;
			num++;
		}
		
		average = sum/num;
	}
	
	public double averageScore() {
		return average;
	}
}
