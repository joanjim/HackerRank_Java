import java.util.*;

public class Ejercicio {

	public static void main(String[] args) {
		/*1. Se importa el paquete de util y luego se declara un scanner para capturar los valores.*/
        Scanner in = new Scanner(System.in);
        
        /*2. La variable t va a capturar la cantidad de tandas que se deban a validar.*/
        int t=in.nextInt();
        
        /*3. Se declara el for para recorrer cada una de las tandas que se hayan ingresado y luego
         * se lee lo que contiene cada tanda, ya que cada tanda siempre contiene tres numeros.*/
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            /*4. Se crean variables y se construye la formula base "RES".*/
            int y, RES;
            RES = a+1*b;
            
            /*5. Luego se declara otro for que sirve para recorrer cada uno de los numeros de cada tanda
             * y adicional dentro del for se le suma la nueva formula con el respectivo numero elevado.*/
            for(y=0;y<=n-1;y++){
                if(y!=0){
                    double ITE = Math.pow(2, y);
                    RES = RES+(int)ITE*b;
                }
                if(y==n-1){
                    System.out.println(RES);
                }else{
                    System.out.print(RES+" ");
                }
            }
        }
        /*6. Se cierra el scanner.*/
        in.close();
	}

}
