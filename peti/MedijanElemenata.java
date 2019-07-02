package treciZadatak;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class MedijanElemenata implements IPromatrac{

	private SlijedBrojeva slijedbrojeva;
	
	public MedijanElemenata (SlijedBrojeva slijedbrojeva) {
		this.slijedbrojeva = slijedbrojeva;
	}
	@Override
	public void update() {
		List<Integer> listaBrojeva = new ArrayList<>(slijedbrojeva.listaBrojeva);
		
        Collections.sort(listaBrojeva);
        
        if (listaBrojeva.size()%2 == 0) {
        	int polozajmedijana = listaBrojeva.size()/2;
        	System.out.printf("medijan brojeva iznosi : %.1f \n", ((double)listaBrojeva.get(polozajmedijana)+listaBrojeva.get(polozajmedijana-1))/2);
        }
        else
        	System.out.println("medijan brojeva iznosi : " + listaBrojeva.get(listaBrojeva.size()/2));
		
	}

	
}
