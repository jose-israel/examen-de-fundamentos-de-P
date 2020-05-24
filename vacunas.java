import java.util.Scanner; 



class vacunas{
static Scanner teclado=new Scanner(System.in);

//este algoritmo procesa el tipo de vacuna que se debe aplicar a una persona
public static void vacunasJICC(){
    String sexo, tipovacuna;
    int edad;
    //datos de entrada
    System.out.println("ingresar la edad de la persona:");
    edad=teclado.nextInt();
    System.out.println("ingresar el sexo de la persona");
    sexo=teclado.next();
    //proceso
    if(edad<16){
        tipovacuna="aplicar Vacuna tipo A";
    }else if(edad>=16 && edad<=16){ 
        if(sexo.equals("M")){
        tipovacuna="Aplicar vacuna B";
        }else{
        tipovacuna="Aplicar vacuna A";          
        }
    }else{
        tipovacuna="Aplicar vacuna tipo C";
    }
    //Datos de salida 
    System.out.println(tipovacuna); 
    } 
        

public static void main(String [] arg){
    System.out.println("hola rata");
    vacunasJICC();
}


}