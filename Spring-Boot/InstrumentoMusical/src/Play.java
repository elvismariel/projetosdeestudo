import br.com.instrumentoMusical.core.Flauta;
import br.com.instrumentoMusical.core.InstrumentoMusical;
import br.com.instrumentoMusical.core.Marca;
import br.com.instrumentoMusical.core.Violao;
import br.com.instrumentoMusical.material.Madeira;
import br.com.instrumentoMusical.material.Material;
import br.com.instrumentoMusical.material.Plastico;

public class Play {

	public static void main(String[] args) {

		Marca marca1 = new Marca("Yamaha");
		Material madeira = new Madeira("Cedro Rosa");
		InstrumentoMusical violao = new Violao(marca1, madeira, 5);
		violao.Afiar();

		System.out.println("");

		Marca marca2 = new Marca("Honda");
		Material plastico = new Plastico("Plastico");
		InstrumentoMusical flauta = new Flauta(marca2, plastico, 12);
		flauta.Afiar();
	}
}
