package treciZadatak;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TipkovnickiIzvor implements IIzvor{
	Scanner sc;
	
	public TipkovnickiIzvor() {
		this.sc = new Scanner(System.in);
	}
	


	@Override
	public int vratiBroj() {
		return sc.nextInt();
	}

}
