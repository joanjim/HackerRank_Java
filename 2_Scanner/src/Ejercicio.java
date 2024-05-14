import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		
		//1. Se importa el Scanner para poder declararlo y crear la variable "scan" que va a leer
		//los datos que se hayan ingresado.
		Scanner scan = new Scanner(System.in);
		//2. Se agrega un try finally para quitar la advertencia de: "no se ha cerrado el scan".
		try {
			
			//3.Se crean tres variables de tipo int para capturar lo ingresado por teclado
			//siempre y cuando se ingresen numeros por el "scan.nextInt()", ya que si se ingresa
			//letras, debe colocarse de tipo String y poner "scan.next()" y ya con eso captura caracteres.
	        int a = scan.nextInt();
	        int b = scan.nextInt();
	        int c = scan.nextInt();
	        
	        
	        //4. Se imprimen lo capturado.
	        System.out.println(a);
	        System.out.println(b);
	        System.out.println(c);	
		} finally {
			//5. Se cierra el scan en caso de tener algo diferente a vacio.
			if (scan!=null) {
				scan.close();
			}
		}
	}

}
