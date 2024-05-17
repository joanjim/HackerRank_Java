import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		//1. Se importa y se declara el scanner a usar "sc".
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        
        /*2. Como siempre se ingresan tres Strings con sus respectivos Int, se declara un for
         * para recorrer cada String y cada Int que se esta ingresando. El primer String y su Int
         * quedan guardados en "s1" y x respectivamente y se lee con el next y nextInt.
         * */ 
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            
            /*3. Al leerlos, valida que debe hacer con ellos, si se le agrega 0 al int o
             * si le agrega doble cero dependiendo el int de ese String y le agrega el formato
             * de un espacio de 15s (recordar que la "s" es para String y la "d" es para int)
             * y así para los demas String e Int.*/
            String news = null;
            if(Integer.toString(x).length() == 2){
                news = "0"+x;
                String FMT = String.format("%-15s", s1);
                System.out.println(FMT+news);
            }else if(Integer.toString(x).length() == 1){
                news = "00"+x;
                String FMT = String.format("%-15s", s1);
                System.out.println(FMT+news);
            }else{
                String FMT = String.format("%-15s", s1);
                System.out.println(FMT+x);
            }
        }
        System.out.println("================================");
        //4. De esta forma también se puede cerrar el scanner de una formas mas sencilla.
        sc.close();
	}
}
