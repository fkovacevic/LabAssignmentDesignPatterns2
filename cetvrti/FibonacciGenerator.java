package cetvrtiZadatak;

import java.util.ArrayList;
import java.util.List;

public class FibonacciGenerator implements INumberGenerator{
	
	public int numberOfElements;
	
	public FibonacciGenerator(int numberOfElements) {
		this.numberOfElements = numberOfElements;
	}

	@Override
	public List<Integer> generate() {
		 int n1=0,n2=1,n3,i;    
		 List<Integer> fsList = new ArrayList<>();
		 
		 for(i=2;i<numberOfElements;++i)   
		 {    
			 n3=n1+n2;    
			 fsList.add(n3);
			 n1=n2;    
			 n2=n3;    
		 }  
		 
		return fsList;
	}

}
