
public class Ejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 15;
		int i, a, b;
        String RES1 =null, RES2 = null;
        
        //For para imprimir resultados.
        for (i=1; i<=n; i++){
            //For para validar resultados antes de imprimirlos.
            //1. Validar multiplos de 3.
            for(a=3;a<=n;){
                if(i==a){
                    a=n+1;
                    RES1="Fizz";
                }else{
                    a=a+3;
                    RES1=null;
                }
            }
            //2. Validar multiplos de 5.
            for(b=5;b<=n;){
                if(i==b){
                    b=n+1;
                    RES2="Buzz";
                }else{
                    b=b+5;
                    RES2=null;
                }
            }
            
            //3. Imprimir resultado.
            if(RES1 == "Fizz" && RES2 == null){
                System.out.println(RES1);
            }else if(RES1 == null && RES2 == "Buzz"){
                System.out.println(RES2);
            }
            else if(RES1 == null && RES2 == null){
                System.out.println(i);
            }
            else if(RES1 == "Fizz" && RES2 == "Buzz"){
                System.out.println(RES1+RES2);
            }
        }
	}

}
