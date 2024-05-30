import java.util.*;

public class Ejercicio {

	public static void main(String[] args) {
		/*1. Se importa el paquete de util y se declara un nuevo scanner denominado "sc"
		 * para capturar los datos a ingresar.*/
        Scanner sc = new Scanner(System.in);
        
        /*2. Se captura primeramente la cantidad de datos que se quieren ingresar "t" para
         * validar cada tipo de dato al que pertenece.*/
        int t=sc.nextInt();

        /*3. Esta condicion for sirve para recorrer "t" que contiene la cantidad de datos
         * que se ingresan por teclado y recorre y valida cada uno de los datos ingresados.
         * Es decir si queremos validar 2 datos, "t" va a valer 2, lo que significa que
         * se va a recorrer el for 2 veces validando el numero que se ingrese.*/
        for(int i=0;i<t;i++)
        {
            try
            {
            	/*4. Se crea un try-cath y se crea una variable long "x" que guarda lo que capturamos
            	 * con el scanner "sc" y gracias a esto y junto con el try-cath podemos validar si lo
            	 * que se capturo es un numero valido para clasificarlo*/
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                
                /*5. Aqui se valida con condiciones if si es de tipo: byte, short, int, entre otros.
                 * Solamente si es verdadero ejecuta el mensaje, de lo contrario no hace nada.*/
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(x>=-32768 && x<=32767)System.out.println("* short");
                if(x>=Math.pow(-2, 31) && x<=(Math.pow(2, 31)-1))System.out.println("* int");
                if(x>=Math.pow(-2, 63) && x<=(Math.pow(2, 63)-1))System.out.println("* long");
            }
            catch(Exception e)
            {
            	/*6. En caso de que el sistema no pueda leer el numero ingresado o no
            	 * pueda ejecutar alguna de las lineas que estan dentro del try, simplemente
            	 * se va a mostrar el siguiente mensaje.*/
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
        /*7. Se cierra el scanner "sc".*/
        sc.close();
	}

}
