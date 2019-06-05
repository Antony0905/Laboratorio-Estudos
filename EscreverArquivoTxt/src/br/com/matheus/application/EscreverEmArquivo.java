package br.com.matheus.application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import org.junit.Test;


public class EscreverEmArquivo {
	
	@Test
	public void main() {

		Date date = new Date();
		SimpleDateFormat formatadorHora = new SimpleDateFormat("HH:mm:ss");
		SimpleDateFormat formatadorDia = new SimpleDateFormat("ddMMyyyy");
		
		String horaAtual = formatadorHora.format(date);
		String diaAtual = formatadorDia.format(date);
		
		
		// Se não exisir o arquivo ele cria
		Path caminho = Paths.get("C:/Users/mlealsou/Desktop/Teste.txt");
		Path caminho2 = Paths.get("C:/Users/mlealsou/Desktop/"+diaAtual+".log");
		
		String texto = "Teste de escrita em arquivo txt.";
		byte[] textoEmByte = texto.getBytes();
		
		try {
			
			Files.write(caminho, textoEmByte);
			JOptionPane.showMessageDialog(null, "Sucesso :)");
			System.out.println("Sucesso");
			
		} catch (IOException e) {
			
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Algo deu Errado :/ " + e);
			System.out.println("Algo deu Errado :/");
			
			String texto2 = horaAtual + ": " + e.toString();
			byte[] textoEmByte2 = texto2.getBytes();
			
			try {
				Files.write(caminho2, textoEmByte2);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
			
	}

}
