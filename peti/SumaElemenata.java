package treciZadatak;

public class SumaElemenata implements IPromatrac{
	
	private SlijedBrojeva slijedbrojeva;
	private int suma;
	
	
	public SumaElemenata(SlijedBrojeva slijedbrojeva) {
		this.slijedbrojeva = slijedbrojeva;
		this.suma = 0;
	}
	
	
	@Override
	public void update() {
		suma += slijedbrojeva.listaBrojeva.get(slijedbrojeva.listaBrojeva.size()-1);
		System.out.println("suma brojeva iznosi : " + suma);
	}

}
