package ad1.poo.principal;

import ad1.poo.models.Computador;
import ad1.poo.models.Gabinete;
import ad1.poo.models.Memoria;
import ad1.poo.models.Monitor;
import ad1.poo.models.Placa;
import ad1.poo.models.Processador;
import ad1.poo.models.Teclado;

public class Principal {

	public static void main(String[] args) {

		Processador cpu1 = new Processador("Intel CORE i5", 790.0);
		Processador cpu2 = new Processador("Intel CORE i7", 1599.99);
		Processador cpu3 = new Processador("AMD Ryzen 5", 489.90);

		Placa mem1 = new Memoria("Kingstone", 8, 109.0);
		Placa mem2 = new Memoria("Corsair", 32, 449.99);
		Placa mem3 = new Memoria("Corsair", 32, 449.99);

		Monitor mon1 = new Monitor("Monitor LED", 17.0, 379.0);
		Monitor mon2 = new Monitor("Monitor LED", 19.5, 590.0);
		
		Teclado tec1 = new Teclado("Teclado USB", 30.0);
		Teclado tec2 = new Teclado("Teclado Bluetooth", 99.99);
		
		Gabinete gab1 = new Gabinete("Super Dragon");
		Gabinete gab2 = new Gabinete("Power Gamer");
		
		Computador com1 = new Computador("Super Dragon Completo");
		Computador com2 = new Computador("Power Gamer Completo");
		
		gab1.inclui(cpu1);
		gab1.inclui(mem1);
		gab1.inclui(mem2);
		
		gab2.inclui(cpu2);
		gab2.inclui(mem3);
		
		com1.inclui(gab1);
		com1.inclui(mon1);
		com1.inclui(tec1);
		com2.inclui(gab2);
		com2.inclui(mon2);
		com2.inclui(tec2);
		
		System.out.println(com1);
		System.out.println(com2);
	
		
	}
}
