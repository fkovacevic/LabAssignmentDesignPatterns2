package cetvrtiZadatak;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ClosestDistributionCalculator implements IDistributionCalculator{

	@Override
	public Integer distribute(Integer percentile, List<Integer> integerSequence) {
		Collections.sort(integerSequence);
		Integer n_p =(int) Math.round(percentile*integerSequence.size()/100 + 0.5);
		return integerSequence.get(n_p-1);
	}

}
