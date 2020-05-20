package set;


public class Set {
	private Carta carta1;
	private Carta carta2;
	private Carta carta3;
	private boolean igualColor;
	private boolean igualPatron;
	private boolean igualNumero;
	private boolean igualForma;
	private boolean ok;
	private int id;

	public Set(Carta carta1, Carta carta2) {
		this.carta1=carta1;
		this.carta2=carta2;
		this.igualColor=carta1.getColor()==carta2.getColor();
		this.igualPatron=carta1.getPatron()==carta2.getPatron();
		this.igualNumero=carta1.getNumero()==carta2.getNumero();
		this.igualForma=carta1.getForma()==carta2.getForma();
		this.ok=false;
	}

	//devuelve true si la carta que añado es un set
	public boolean addCarta(Carta carta) {
		//que no sea la misma carta
		if(carta.getId()==carta1.getId())
			return false;
		if(carta.getId()==carta2.getId())
			return false;
		//color
		if(igualColor) {
			if(carta1.getColor()!=carta.getColor())
				return false;
		}else{
			if((carta1.getColor()==carta.getColor())||(carta2.getColor()==carta.getColor()))
				return false;
		}
		//Forma
		if(igualForma) {
			if(carta1.getForma()!=carta.getForma())
				return false;
		}else{
			if((carta1.getForma()==carta.getForma())||(carta2.getForma()==carta.getForma()))
				return false;
		}
		//Numero
		if(igualNumero) {
			if(carta1.getNumero()!=carta.getNumero())
				return false;
		}else{
			if((carta1.getNumero()==carta.getNumero())||(carta2.getNumero()==carta.getNumero()))
				return false;
		}
		//Patron
		if(igualPatron) {
			if(carta1.getPatron()!=carta.getPatron())
				return false;
		}else{
			if((carta1.getPatron()==carta.getPatron())||(carta2.getPatron()==carta.getPatron()))
				return false;
		}
		this.carta3=carta;
		this.ok=true;
		//ordeno las cartas
		Carta aux;
		if (carta3.getId()<carta2.getId()) {
			aux=carta2;
			carta2=carta3;
			carta3=aux;
		}
		if (carta2.getId()<carta1.getId()) {
			aux=carta1;
			carta1=carta2;
			carta2=aux;
		}	
		//asigno el número
		this.id=carta1.getId()*100+carta2.getId()*10+carta3.getId();
		return true;	
	}

	public boolean isOk() {
		return this.ok;
	}
	public String toString() {
		return "["+(this.carta1.getId()+1)+", "+(this.carta2.getId()+1)+", "+(this.carta3.getId()+1)+"]";	
	}
	public boolean contains() {
		return igualColor;
		
	}
/*	public boolean equals(Set set) {
		int a1=carta1.getId();
		int a2=carta2.getId();
		int a3=carta3.getId();
		int b1=set.carta1.getId();
		int b2=set.carta2.getId();
		int b3=set.carta3.getId();
		if((a1==b1)&&(a2==b2)&&(a3==b3))
			return true;	
		else return false;	
	}*/
	/*public Set ordenaSet() {
	Carta aux;
	if (carta3.getId()<carta2.getId()) {
		aux=carta2;
		carta2=carta3;
		carta3=aux;
	}
	if (carta2.getId()<carta1.getId()) {
		aux=carta1;
		carta1=carta2;
		carta2=aux;
	}	

	return this;	
}*/

	public Integer getId() {
		return id;
	}

}
