package treciZadatak;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TestnaKlasa {
	public static void main(String[] args) {
		
		IIzvor izvor = new TipkovnickiIzvor();
		//Path put = Paths.get("C:\\Users\\Filip\\Desktop\\6.semestar\\oblikovniDrugiLabos\\brojevi.txt");
		//IIzvor izvor = new DatotecniIzvor(put);
		SlijedBrojeva slijedbrojeva = new SlijedBrojeva(izvor);
		IPromatrac sumaelemenata = new SumaElemenata(slijedbrojeva);
		IPromatrac prosjekelemenata = new ProsjekElemenata(slijedbrojeva);
		IPromatrac medijanelemenata = new MedijanElemenata(slijedbrojeva);
		Path put2 = Paths.get("C:\\\\Users\\\\Filip\\\\Desktop\\\\6.semestar\\\\oblikovniDrugiLabos\\datotecnizapisivac.txt");
		IPromatrac dispiselemenata = new DatotecniIspisElemenata(put2, slijedbrojeva);
		slijedbrojeva.dodaj(sumaelemenata);
		slijedbrojeva.dodaj(prosjekelemenata);
		slijedbrojeva.dodaj(medijanelemenata);
		slijedbrojeva.dodaj(dispiselemenata);
		slijedbrojeva.kreni();
		
	}
}
