package br.com.matheus;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try {

			List<String> letras = new ArrayList<>();

			Scanner scanner = new Scanner(new File("input/alfabeto.csv"));
			scanner.useDelimiter(";");
			while (scanner.hasNext()) {
				
				String letra = null;
				letra = scanner.next();
				System.out.print(letra + "|");
				letras.add(letra);
				
			}
			scanner.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
