package br.com.matheus;

public class Regex {

	public static void main(String[] args) {

		String texto = "Check_Oracle_DB_Status_12312321312312_TESTE";

		String re = ".*Check_Oracle_DB_Status.*";

		if (texto.toUpperCase().matches(re.toUpperCase())) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		String text = "Check_Oracle_DB_Status";
		String sufixo = "TESTE";
		
		if (texto.toUpperCase().startsWith(text.toUpperCase()) && texto.toUpperCase().endsWith(sufixo.toUpperCase())) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
