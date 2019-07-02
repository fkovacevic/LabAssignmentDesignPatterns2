package treciZadatak;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SlijedBrojeva {
	private IIzvor izvor;
	List<Integer> listaBrojeva;
	List<IPromatrac> listaPromatraca;
	public SlijedBrojeva(IIzvor izvor) {
		this.izvor = izvor;
		this.listaBrojeva = new ArrayList<>();
		this.listaPromatraca = new ArrayList<>();
	}
	


	public void dodaj(IPromatrac promatrac) {
		this.listaPromatraca.add(promatrac);
	}
	
	public void obavijesti() {
		for (IPromatrac promatrac : listaPromatraca) 
			promatrac.update();
	}



	public void kreni() {
		int broj = 0;
		
		while (true) {
			broj = izvor.vratiBroj();
			if (broj == -1)
				break;
			try {
				TimeUnit.SECONDS.sleep(1);
				listaBrojeva.add(broj);
				obavijesti();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	
	
}
