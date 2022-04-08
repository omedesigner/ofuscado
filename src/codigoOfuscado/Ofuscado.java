package codigoOfuscado;

import java.io.IOException;
import java.util.Scanner;

public class Ofuscado {


	

	public static void imprimirPorPantalla(String textoAImprimir) {
		System.out.println(textoAImprimir);
	}

	public static int factorial(int numeroIntroducido) {
		if (numeroIntroducido == 0) {
			return 1;
		} else {
			int resultado = 1;
			int numeroADecrementar = numeroIntroducido;
			do {
				resultado *= numeroADecrementar;
				numeroADecrementar--;
			} while (numeroADecrementar > 0);
			return resultado;
		}
	}

	public static String darLaVueltaALaPalabra(String palabraIntroducida) {
		String palabraAlrevesConcatenada = "";
		int posicion = 0;
		do {
			palabraAlrevesConcatenada = palabraIntroducida.charAt(posicion) + palabraAlrevesConcatenada;
			posicion++;
		} while (posicion < palabraIntroducida.length());
		palabraAlrevesConcatenada = palabraIntroducida + palabraAlrevesConcatenada;
		return palabraAlrevesConcatenada;
	}

	public static void main(String[] args) throws IOException {
		int numOpcionMenu;
		Scanner entradaPorTeclado = new Scanner(System.in);
		do {
			numOpcionMenu= imprimirMenu();
			if ( numOpcionMenu== 1) {
				imprimirPorPantalla("Inserte un número:");
				String numeroIntroducidoParaFactorial = entradaPorTeclado.nextLine();
				int numeroParaFactorial = Integer.parseInt(numeroIntroducidoParaFactorial);
				int resuladoFactorial = factorial(numeroParaFactorial);
				imprimirPorPantalla("El resultado es:");
				imprimirPorPantalla("" + resuladoFactorial);
			} else {
				if (numOpcionMenu== 2) {
					imprimirPorPantalla("Inserte una palabra:");
					String palabraIntroducida = entradaPorTeclado.nextLine();
					String palabraAlReves =darLaVueltaALaPalabra(palabraIntroducida);
					imprimirPorPantalla("El resultado es:");
					imprimirPorPantalla("" + palabraAlReves);
				}
			}	
		} while (numOpcionMenu != 3);
	}
	 public static int imprimirMenu() {
		Scanner entradaPorTeclado = new Scanner(System.in);
		imprimirPorPantalla("BIENVENIDO AL PROGRAMA OFUSCADO");
		imprimirPorPantalla("-------------------------------");
		imprimirPorPantalla("Elija una opcion:");
		imprimirPorPantalla("1) factorial del número introducido");
		imprimirPorPantalla("2) da la vuelta a la palabra y la concatena a la introducida");
		imprimirPorPantalla("3) salir");
		imprimirPorPantalla(">");
		String opcionSeleccionada = entradaPorTeclado.nextLine();
		int numOpcionMenu = Integer.parseInt(opcionSeleccionada);
		return numOpcionMenu;
	}
}
