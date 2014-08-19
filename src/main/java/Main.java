
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
		BufferedWriter escrever = null;

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
				linha = linha + " ";
				palavra = "";
				for (int i = 0; i < linha.length(); i++) {
					if (Character.isAlphabetic(linha.charAt(i))) {
						palavra = palavra + linha.charAt(i);
					} else {
						if (palavras.containsKey(palavra)) {
							palavras.put(palavra, palavras.get(palavra) + 1);
						} else {
							palavras.put(palavra, 1);
						}
						palavra = "";
					}

				}

				linha = ler.readLine();
			}
		} catch (IOException ex) {
			Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
		}
		try {
			escrever = new BufferedWriter(new FileWriter("saida.csv"));
		} catch (IOException ex) {
			Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
		}
		for (String p : palavras.keySet()) {
			try {
				escrever.write(p + ", " + palavras.get(p));
				escrever.newLine();
			} catch (IOException ex) {
				Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
		try {
			ler.close();
			escrever.close();
		} catch (IOException ex) {
			Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
