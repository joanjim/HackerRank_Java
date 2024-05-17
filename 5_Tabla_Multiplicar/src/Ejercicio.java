import java.io.*;

public class Ejercicio {

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        
        /*1. Se importa todo el paquete io y luego se agrega un BufferedReader 
         * (Creo que ese read tambien se usa para leer por consola).*/
        int i, RES;
        
        /*2. Se declaran las variables y un for para ir recorriendo cada numero por
         * el que se debe multiplicar el numero ingresado y luego solo se imprime con el formato.*/
        for(i=1;i<=10;i++){
            RES = N*i;
            System.out.println(N+" x "+i+" = "+RES);
        }
        /*3. Se cierra el bufferedReader.*/
        bufferedReader.close();
	}
}
