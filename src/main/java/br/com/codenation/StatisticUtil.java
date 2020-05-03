package br.com.codenation;

import java.lang.reflect.Array;
import java.util.*;

public class StatisticUtil {

	private int i;

	public static int average(int[] elements) {
		int qtdeElementos;
		int media = 0;
		int somaElementos = 0;
		qtdeElementos = elements.length;
		for (int i =0; i < elements.length; i++) {
			somaElementos = somaElementos + elements[i];
		}
		media = somaElementos / elements.length;
		return media;
	}

	public static int mode(int[] elements){
		int mode = 0;
		int qtd = 0;
		int valueAnt = elements[0];

		Map<Integer, Integer> mapMode = new HashMap<>();
		Arrays.sort(elements);

		for (int i = 0; i < elements.length; i++) {
			if (valueAnt == elements[i]){
				qtd ++;
			}else{
				qtd = 0;
				qtd ++;
			}

			if(mapMode.containsKey(elements[i])){
				mapMode.put(elements[i], qtd);
			}else{
				mapMode.put(elements[i], qtd);
			}
			valueAnt = elements[i];
		}

		qtd =0;

		Set<Map.Entry<Integer, Integer>> entries = mapMode.entrySet();
		for(Map.Entry<Integer, Integer> entry: entries){
			if (entry.getValue() > qtd){
				qtd = entry.getValue();
				mode = entry.getKey();
			}
		}
		return mode;
	}

	public static int median(int[] elements) {
		int qtdeElementos;
		int median;
		int somar1 = 0, somar2 = 0;
		qtdeElementos = elements.length;
		Arrays.sort(elements);

		if(elements.length % 2 > 0){
			median = elements[qtdeElementos/2];
		} else {
			somar1 =( qtdeElementos/2) - 1;
			somar2 = somar1 + 1;
			median = (elements[somar1] + elements[somar2]) / 2;
		}
		return median;
	}
}