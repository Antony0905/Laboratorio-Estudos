package br.com.matheus.application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JOptionPane;

public class LerArquivo {

	public static void main(String[] args) {
		
		Path caminho = Paths.get("C:/Users/mlealsou/Desktop/hino.txt");
		
		try {
			
			byte[] texto = Files.readAllBytes(caminho);
			String leitura = new String(texto);
			System.out.println(leitura);
			JOptionPane.showMessageDialog(null, leitura);
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
