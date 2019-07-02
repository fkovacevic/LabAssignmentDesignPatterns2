package cetvrtiZadatak;

import java.util.ArrayList;
import java.util.List;

public class LinearGenerator implements INumberGenerator{
	private Integer lowerBound;
	private Integer upperBound;
	private Integer increment;
	
	public LinearGenerator(Integer lowerBound, Integer upperBound, Integer increment) {
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
		this.increment = increment;
	}

	@Override
	public List<Integer> generate() {
		List<Integer> linearList = new ArrayList<>();
		for (int i = lowerBound;i<upperBound;i = i+increment)
			linearList.add(i);
		return linearList;
	}

}
