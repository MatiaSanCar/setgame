package set;

import java.util.ArrayList;
import java.util.List;

public class Juego {
	private int numCartas;
	private Carta[] cartas;
	private List<Set> sets;
	
	public Juego(Carta[] cartas) {
		this.cartas = cartas;
		this.numCartas = cartas.length;
		this.sets = new ArrayList<Set>();
	}

	public List<Set> buscaSets(){
		creaParejas();
		buscaTercera();
		limpiaSets();
		return sets;
	}
	
	
	private void creaParejas() {
		Set nuevaPareja;
		for(int i=0;i<numCartas;i++) {
			for(int j=i+1;j<numCartas;j++) {
				nuevaPareja=new Set(cartas[i],cartas[j]);
				sets.add(nuevaPareja);
			}
			
		}
	}
	
	private void buscaTercera() {
		for(Set set : sets) {
			for(Carta carta: cartas) {
				set.addCarta(carta);
			}
		}
		
	}

	private void limpiaSets() {
		List<Set> setsBuenos = new ArrayList<Set>();
		List <Integer> ids=new ArrayList<Integer>();
		for(Set set:sets)
			if(set.isOk()) {
				if(!ids.contains(set.getId())) {
					ids.add(set.getId());
					setsBuenos.add(set);
				
				}
			}
		
/*		for(Set set:sets) {
			if set.equ
		}*/
		this.sets=setsBuenos;
	}
	
}
