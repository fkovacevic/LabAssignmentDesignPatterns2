package treciZadatak;

public class ProsjekElemenata implements IPromatrac{

	private int suma;
	public ProsjekElemenata(SlijedBrojeva slijedbrojeva) {
		this.slijedbrojeva = slijedbrojeva;
		this.suma = 0;
	}
	
	private SlijedBrojeva slijedbrojeva;
	@Override
	public void update() {
		suma += slijedbrojeva.listaBrojeva.get(slijedbrojeva.listaBrojeva.size()-1);
		double prosjek = ((double)suma/slijedbrojeva.listaBrojeva.size());
		System.out.printf("prosjek brojeva iznosi : %.3f \n", prosjek);
	}

}
