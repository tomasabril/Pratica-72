
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná DAINF - Departamento
 * Acadêmico de Informática IF62C - Fundamentos de Programação 2
 *
 * Template de projeto de programa Java usando Maven. por Tomás Abril
 */
public class Main {

	public static void main(String[] args) {

		String extencao = ".csv";

		Scanner input = new Scanner(System.in);

		HashMap<String, Integer> palavras = new HashMap<>();

		BufferedReader ler;
		BufferedWriter escrever;

		String palavra, localLer, localEscrever, nomeArquivo, linha;
		while (true) {
			try {
				System.out.println("caminho do arquivo .txt :");
				localLer = input.next();
				ler = new BufferedReader(new FileReader(localLer));
				break;
			} catch (FileNotFoundException e) {
				System.out.println(e);
			}
		}
		try {
			linha = ler.readLine();
			while (linha != null) {
				
				linha = ler.readLine();
			}
		} catch (IOException ex) {
			Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
