package treciZadatak;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DatotecniIspisElemenata implements IPromatrac{
	private Path put;
	private SlijedBrojeva slijedbrojeva;
	
	public DatotecniIspisElemenata(Path put, SlijedBrojeva slijedbrojeva) {
		this.put = put;
		this.slijedbrojeva = slijedbrojeva;
	}

	@Override
	public void update() {
		List<String> lines = new ArrayList<>();
		for (Integer i :slijedbrojeva.listaBrojeva) {
			String string = i.toString();
			lines.add(string + " ");
		}
		try {
			Files.write(put, lines, Charset.forName("UTF-8"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
}
