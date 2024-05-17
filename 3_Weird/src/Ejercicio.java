import java.util.*;

public class Ejercicio {

	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		//1. Se agrega el Hello para poder escribir en pantalla.
		System.out.println("Hello");
		
		//2. Luego se usa scanner para capturar el numero que se esta ingresando por teclado.
        int N = scanner.nextInt();
        
        //3. Se usa skip para omitir ciertos caracteres al momento de leerlos. 
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        /*4. Creamos un ciclo for con una nueva variable "i" y se va a repetir hasta que "i" sea
        menor a "N" que es el numero ingresado. Luego va ir sumando de 2 en 2 la "i" y así podemos
        darnos cuenta si el numero ingresado es par o impar y dependiendo de si es par o no, imprime
        si es Weird o Not Weird.*/
        int i;
        for(i=0;i<N;){
            i = i+2;
            if(N==i){
                if(i>=2 && i<=5){
                    System.out.println("Not Weird");
                }else if(i>=6 && i<=20){
                    System.out.println("Weird");
                }else if(i>20){
                    System.out.println("Not Weird");
                }
            }else if(N==(i-1)){
                System.out.println("Weird");
            }  
        }
        scanner.close();
	}

}
