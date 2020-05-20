package set;

public class Carta {
	private Color color;
	private Forma forma;
	private Numero numero;
	private Patron patron;
	private int id;
	
	public Carta(int id, Color color, Forma forma, Numero numero, Patron patron) {
		this.id=id;
		this.color=color;
		this.forma=forma;
		this.numero=numero;
		this.patron=patron;
	}

	public Color getColor() {
		return color;
	}
	
	public Forma getForma() {
		return forma;
	}
	
	public Numero getNumero() {
		return numero;
	}

	public Patron getPatron() {
		return patron;
	}

	public int getId() {
		return id;
	}
	public String toString() {
		return id+": "+color+" "+"forma"+" "+numero+" "+patron;
	}
	public boolean equals(Carta carta) {
		if(this.id==carta.getId())return true;
		else return false;
	}
}
