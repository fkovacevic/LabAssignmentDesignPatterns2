package treciZadatak;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class DatotecniIzvor implements IIzvor{
	private Path put;
	private Scanner sc;

	public DatotecniIzvor(Path put) {
		this.put = put;
		try {
			sc = new Scanner(put);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public int vratiBroj() {
		return sc.nextInt();
	}
	
	
}
