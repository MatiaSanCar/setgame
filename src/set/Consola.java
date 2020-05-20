package set;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public class Consola {

	public static void main(String[] args) {
		Juego juego=new Juego(leerArchivo());
		List<Set> resultado=juego.buscaSets();		
		System.out.println(resultado.toString());

	}

	private static Carta[] leerArchivo() {
		File fichero=new File ("set.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(fichero);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		int numCartas;
		String leer;
		leer=sc.nextLine();
		numCartas=Integer.parseInt(leer);
		Carta cartas[]=new Carta[numCartas] ;
		try {				
			for(int i=0;i<numCartas;i++) {
				Color color;
				Forma forma;
				Numero numero;
				Patron patron;
				leer=sc.nextLine();
				switch (leer.charAt(0)) {
				case 'R': color=Color.ROJO;
				case 'r': color=Color.ROJO;break;
				case 'V': color=Color.VERDE;
				case 'v': color=Color.VERDE;break;
				case 'A': color=Color.AZUL;
				case 'a': color=Color.AZUL;break;
				default: throw new Exception("Color mal"); 
				}
				switch (leer.charAt(1)) {
				case 'P': forma=Forma.PASTILLA;
				case 'p': forma=Forma.PASTILLA;break;
				case 'G': forma=Forma.S;
				case 'g': forma=Forma.S;break;
				case 'R': forma=Forma.ROMBO;
				case 'r': forma=Forma.ROMBO;break;
				default: throw new Exception("Forma mal"); 
				}
				switch (leer.charAt(2)) {
				case '1': numero=Numero.UNO;break;
				case '2': numero=Numero.DOS;break;
				case '3': numero=Numero.TRES;break;
				default: throw new Exception("Número mal"); 
				}
				switch (leer.charAt(3)) {
				case 'R': patron=Patron.RELLENO;
				case 'r': patron=Patron.RELLENO;break;
				case 'H': patron=Patron.HUECO;
				case 'h': patron=Patron.HUECO;break;
				case 'L': patron=Patron.RAYAS;
				case 'l': patron=Patron.RAYAS;break;
				default: throw new Exception("Patrón mal"); 
				}
				cartas[i]=new Carta(i,color,forma,numero,patron);
			}
			sc.close();	
			return cartas;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			sc.close();	
			return cartas;
		}
	}

	/*private static Carta[] leerConsola() {
	Scanner teclado=new Scanner(System.in);
	int numCartas;
	String leer;
	System.out.println("Introduce el número de cartas");
	leer=teclado.nextLine();
	numCartas=Integer.parseInt(leer);
	Carta cartas[]=new Carta[numCartas] ;
	try {		


		for(int i=0;i<numCartas;i++) {
			Colores color;
			Formas forma;
			Numero numero;
			Patrones patron;
			System.out.println("Vamos con la carta "+(i+1));
			System.out.println("Color de la carta:\tR:Rojo\tV:Verde\tA:Azul");
			System.out.println("Forma de la carta:\tP:Pastilla\tG:gusano\tR:rombo");
			System.out.println("Número de formas de la carta:\\t1:una\t2:dos\t2:tres");
			System.out.println("Patrón de la carta:\tR:Relleno\tH:Hueco\tL:Líneas");
			leer=teclado.nextLine();
			switch (leer.charAt(0)) {
			case 'R': color=Colores.ROJO;
			case 'r': color=Colores.ROJO;break;
			case 'V': color=Colores.VERDE;
			case 'v': color=Colores.VERDE;break;
			case 'A': color=Colores.AZUL;
			case 'a': color=Colores.AZUL;break;
			default: throw new Exception("Color mal"); 
			}
			switch (leer.charAt(1)) {
			case 'P': forma=Formas.PASTILLA;
			case 'p': forma=Formas.PASTILLA;break;
			case 'G': forma=Formas.S;
			case 'g': forma=Formas.S;break;
			case 'R': forma=Formas.ROMBO;
			case 'r': forma=Formas.ROMBO;break;
			default: throw new Exception("Forma mal"); 
			}
			switch (leer.charAt(2)) {
			case '1': numero=Numero.UNO;break;
			case '2': numero=Numero.DOS;break;
			case '3': numero=Numero.TRES;break;
			default: throw new Exception("Número mal"); 
			}
			switch (leer.charAt(3)) {
			case 'R': patron=Patrones.RELLENO;
			case 'r': patron=Patrones.RELLENO;break;
			case 'H': patron=Patrones.HUECO;
			case 'h': patron=Patrones.HUECO;break;
			case 'L': patron=Patrones.RAYAS;
			case 'l': patron=Patrones.RAYAS;break;
			default: throw new Exception("Patrón mal"); 
			}
			cartas[i]=new Carta(i,color,forma,numero,patron);
		}
	teclado.close();	
	return cartas;
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
		teclado.close();	
		return cartas;
	}
}*/
}


