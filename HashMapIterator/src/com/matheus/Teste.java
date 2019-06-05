package com.matheus;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Teste {
	public static void main(String[] args) {
		HashMap<String, String> mapa = new HashMap<String, String>();
		mapa.put("Diegoo", " Ricardo");
		mapa.put(null, "Teste");
		mapa.put(null, "Outro Teste");
		mapa.put("Diego", " ;)");
		Set<String> chaves = mapa.keySet();
		for (Iterator<String> iterator = chaves.iterator(); iterator.hasNext();) {
			String chave = iterator.next();
			if (chave != null)
				System.out.println(chave);
		}
	}
}