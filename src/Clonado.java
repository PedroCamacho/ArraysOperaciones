import java.util.Arrays;

public class Clonado {
	public static void main(String[] args) {
		//Declaraci�n e inicialiazaci�n
		int [] primos = { 1, 2, 3, 5, 7, 11, 13, 17, 19, 23 };
		int [] copiaClonado;
		int [] copiaReferencia;
		
		//Clonaci�n
		copiaClonado = primos.clone();
		//Cambio el clon, sin afectar al original
		copiaClonado[0] = 0;
		//Copia de referencia
		copiaReferencia = primos;
		//Cambio la copia y afecta al original
		copiaReferencia[1] = 0;
		
		//Salida
		System.out.println(Arrays.toString(primos));
		System.out.println(Arrays.toString(copiaClonado));
		System.out.println(Arrays.toString(copiaReferencia));

	}
}
