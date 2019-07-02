package cetvrtiZadatak;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NormalDistributionGenerator implements INumberGenerator{
	Integer variance;
	Integer mean;
	Integer numberOfElements;
	
	public NormalDistributionGenerator(Integer variance, Integer mean, Integer numberOfElements) {
		this.variance = variance;
		this.mean = mean;
		this.numberOfElements = numberOfElements;
	}

	@Override
	public List<Integer> generate() {
		Random randomNumber = new Random();
		List<Integer> ndList = new ArrayList<>();
		for (int i = 0;i<numberOfElements;i++)
			ndList.add((int) Math.round(randomNumber.nextGaussian()*variance+mean));
		return ndList;
	}
	
	
}
