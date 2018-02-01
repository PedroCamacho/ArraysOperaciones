import java.util.Arrays;

public class Burbuja {

	public void ordenBurbuja (int [] vector){
		int aux;
		for (int k = 0; k < vector.length; k++) {
			for (int i = 0; i < vector.length - k - 1; i++) {
				if (vector[i]>vector[i+1]) {
					aux=vector[i];
					vector[i]=vector[i+1];
					vector[i+1]=aux;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		//Declaración e Inicialización
		int [] arrayEjemplo = {3,6,9,0,8,5,1,2};
		Burbuja programa = new Burbuja();
		
		//Salida inicial
		System.out.print("Sin ordenar: ");
		System.out.println(Arrays.toString(arrayEjemplo));
		
		//Ordenación
		programa.ordenBurbuja(arrayEjemplo);
		
		//Salida final
		System.out.print("Ordenado:    ");
		System.out.println(Arrays.toString(arrayEjemplo));
		
	}

}
