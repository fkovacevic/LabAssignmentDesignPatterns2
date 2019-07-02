package cetvrtiZadatak;

import java.util.ArrayList;
import java.util.List;

public class DistributionTester {

	private INumberGenerator numberGenerator;
	private IDistributionCalculator distributionCalculator;
	private List<Integer> integerSequence;

	public DistributionTester(INumberGenerator numberGenerator, IDistributionCalculator distributionCalculator) {
		this.numberGenerator = numberGenerator;
		this.distributionCalculator = distributionCalculator;
		this.integerSequence = numberGenerator.generate();
	}
	
	
	public Integer distribute(Integer percentile) {
		return distributionCalculator.distribute(percentile, this.integerSequence);
	}
	
}
