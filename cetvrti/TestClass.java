package cetvrtiZadatak;

public class TestClass {
	
	public static void main(String[] args) {
		FibonacciGenerator numberGenerator = new FibonacciGenerator(10);
		ClosestDistributionCalculator distributionCalculator = new ClosestDistributionCalculator();
		DistributionTester dt = new DistributionTester(numberGenerator, distributionCalculator);
		System.out.println(dt.distribute(80));
	}

}
