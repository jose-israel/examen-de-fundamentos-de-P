import java.util.Scanner;

public class bono{

    static Scanner teclado=new Scanner(System.in);

        public static void calcularelbono(){
        int puntos;
        double salariomin, montobono;
        //datos de entrada 
        System.out.println("ingresar el salario minimo");
        salariomin=teclado.nextDouble();
        System.out.println("ingresar el puntaje que ha obtenido el profesor");
        puntos=teclado.nextInt();
        //proceso
        if(puntos>=00 && puntos<=100){
            montobono=10*salariomin;
        }   else if(puntos>=101 && puntos<=150){
            montobono=50*salariomin;
        }else{
                montobono=100*salariomin;
            } 
            //datos de salida 
            System.out.println("el monto de bono es:"+montobono);    
            }
        









public static void main(String [] arg){
    //System.out.println("holas rata");
    calcularelbono();

}

}
