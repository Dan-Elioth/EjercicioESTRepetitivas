

import java.util.Random;
import java.util.Scanner;

public class EjerciciosTareaEstREpes {

     static Scanner teclado=new Scanner(System.in);

    public static void Ejercicio1(){
        double salIni=1500.0;
        int años=1;     
        while (años<=6) {            
            salIni=(salIni*0.10)+salIni;
            System.out.println("Amigo tu salario"+años+ " es: "+salIni);
            años++;
        }   
    }

    public static void Ejercicio2() {
        //Daclarar Variables
        String tipoPago;
        int cantidad;
        double totalPago=0;
        int contador=1;
        //proceso y datos de Entrada
        while (contador<=3){
            if (contador==1) {
                System.out.println("Ingrese la cantidad de hamburgesas simples:");
                cantidad=teclado.nextInt();
                totalPago=totalPago+cantidad*20;
            }
            if (contador==2) {
                System.out.println("Ingrese la cantidad de hamburgesas Dobles:");
                cantidad=teclado.nextInt();
                totalPago=totalPago+cantidad*25;
            }
            if (contador==3) {
                System.out.println("Ingrese la cantidad de hamburgesas Triples:");
                cantidad=teclado.nextInt();
                totalPago=totalPago+cantidad*28;
            }  
            contador++;                  
        }
        //datos de salida, entrada
        System.out.println("Ingrese la forma de pago (Con tarjeta=CT, Sin tarjeta=ST):");
        tipoPago=teclado.next();
        if (tipoPago.toUpperCase().equals("CT")) {
            totalPago=totalPago+totalPago*0.05;
        } 
        System.out.println("El monto total a pagar es:"+totalPago);
    }

    public static void Ejercicio3() {
        //Daclarar Variables
        int nNumeros, cantCero=0, cantNeg=0, cantPost=0;
        double numeros;
        
        //datos de Entrada
        System.out.println("Ingrese N cantidad:");
        nNumeros=teclado.nextInt();
        Random numAleatorio = new Random();
        //Proceso
        for (int numero=1; numero<=nNumeros; numero++) {
            /*System.out.print("Ingrese el valor de la posicion "+numero+":");*/
            /*numeros=teclado.nextDouble();*/
            numeros = numAleatorio.nextInt(20-10)-4;
            System.out.println(numeros);
            if (numeros<0) {cantNeg++;} 
            if (numeros>0) {cantPost=cantPost+1;} 
            if (numeros==0) {cantCero+=1;}             
        }
        //datos de salida
        System.out.println("De total de numeros:\n"+cantCero+" es/son cero(s)"+
        "\n"+cantNeg+" es/son menor(es) de cero"+
        "\n"+cantPost+" es/son mayor(es) de cero"
        );
    }



    public static void Ejercicio4() {
        //vamos a declarar variables
        int Nfocos=0, color, verde=0, blanco=0, rojo=0;
        
        //Datos de Entrada
        System.out.println("Ingrese la cantidad de focos:");
        Nfocos=teclado.nextInt();

        while (Nfocos>0){
            System.out.println("Los focos de colores son:\n1=Si es verde\n2=Si es blanco\n3= Si es rojo");
            color=teclado.nextInt();
            if (color>=1 && color<=3){
                if (color==1){
                    verde=verde+1;
                }else{
                    if (color==2){
                        blanco=blanco+1;
                    }else{
                        if (color==3){
                            rojo=rojo+1;
                        }
                    }
                }

            }
            Nfocos=Nfocos-1;
        }
        //Datos de salida
        System.out.println("La cantidad de focos  verdes es : "+verde);
        System.out.println("La cantidad de focos  blancos es : "+blanco);
        System.out.println("La cantidad de focos  rojos es : "+rojo);
    }

    public static void Ejercicio5() {
        //variables
        double ahorroIn=3, dias=2;
        //datos de entrada y proceso
        System.out.println("Tu ahorro del tu primer dia es: $ "+ahorroIn+ "  pesos");
        

        while(dias<=365){
            ahorroIn=ahorroIn*3;
            System.out.println("Amigo tu ahorro "+dias+ "  dia es : $ "+ahorroIn+ "  pesos");
            dias++; 
        }
    }

    public static void Ejercicio61(){
      //for → ciclo desde
        double salarioIn=1500;
    
        for (int años=1; años<=6; años++) {
            salarioIn=(salarioIn*0.10)+salarioIn;
            System.out.println("tu salario "+años+" es de: $"+salarioIn);
        }
    }
    public static void Ejercicio62() {
        //do while → ciclo repetir
        double salIni=1500.0;
        int años=1;     
        do {            
            salIni=(salIni*0.10)+salIni;
            System.out.println("Amigo tu salario"+años+ " es: "+salIni);
            años++;
        }   
        while (años<=6);
    }


    public static void Ejercicio71() {

        //do while→ ciclo desde

        //Daclarar Variables
        String tipoPago;
        int cantidad;
        double totalPago=0;
        int contador=1;
        //proceso y datos de Entrada
        do{
            if (contador==1) {
                System.out.println("Ingrese la cantidad de hamburgesas simples:");
                cantidad=teclado.nextInt();
                totalPago=totalPago+cantidad*20;
            }
            if (contador==2) {
                System.out.println("Ingrese la cantidad de hamburgesas Dobles:");
                cantidad=teclado.nextInt();
                totalPago=totalPago+cantidad*25;
            }
            if (contador==3) {
                System.out.println("Ingrese la cantidad de hamburgesas Triples:");
                cantidad=teclado.nextInt();
                totalPago=totalPago+cantidad*28;
            }  
            contador++;                  
        }
        while (contador<=3);
        //datos de salida, entrada
        System.out.println("Ingrese la forma de pago (Con tarjeta=CT, Sin tarjeta=ST):");
        tipoPago=teclado.next();
        if (tipoPago.toUpperCase().equals("CT")) {
            totalPago=totalPago+totalPago*0.05;
        } 
        System.out.println("El monto total a pagar es:"+totalPago);
    }

    public static void Ejercicio72() {

        //while → ciclo mientras


        //Daclarar Variables
        String tipoPago;
        int cantidad;
        double totalPago=0;
        int contador=1;
        //proceso y datos de Entrada
        while (contador<=3){
            if (contador==1) {
                System.out.println("Ingrese la cantidad de hamburgesas simples:");
                cantidad=teclado.nextInt();
                totalPago=totalPago+cantidad*20;
            }
            if (contador==2) {
                System.out.println("Ingrese la cantidad de hamburgesas Dobles:");
                cantidad=teclado.nextInt();
                totalPago=totalPago+cantidad*25;
            }
            if (contador==3) {
                System.out.println("Ingrese la cantidad de hamburgesas Triples:");
                cantidad=teclado.nextInt();
                totalPago=totalPago+cantidad*28;
            }  
            contador++;                  
        }
        //datos de salida, entrada
        System.out.println("Ingrese la forma de pago (Con tarjeta=CT, Sin tarjeta=ST):");
        tipoPago=teclado.next();
        if (tipoPago.toUpperCase().equals("CT")) {
            totalPago=totalPago+totalPago*0.05;
        } 
        System.out.println("El monto total a pagar es:"+totalPago);
    }

    public static void Ejercicio73() {
        //Daclarar Variables
        String tipoPago;
        int cantidad=0;
        double totalPago=0;

        //datos de entrada y Proceso

        for (int contador = 1; contador <=3; contador++) {
            
            if (contador==1) {
                System.out.println("Ingrese la cantidad de hamburgesas simples:");
                cantidad=teclado.nextInt();
                totalPago=totalPago+cantidad*20;
            }
            if (contador==2) {
                System.out.println("Ingrese la cantidad de hamburgesas Dobles:");
                cantidad=teclado.nextInt();
                totalPago=totalPago+cantidad*25;
            }
            if (contador==3) {
                System.out.println("Ingrese la cantidad de hamburgesas Triples:");
                cantidad=teclado.nextInt();
                totalPago=totalPago+cantidad*28;
        }

        }
        //datos de salida, entrada
        System.out.println("Ingrese la forma de pago (Con tarjeta=CT, Sin tarjeta=ST):");
        tipoPago=teclado.next();
        if (tipoPago.toUpperCase().equals("CT")) {
            totalPago=totalPago+totalPago*0.05;
        } 
        System.out.println("El monto total a pagar es:"+totalPago);

    }

    public static void Ejercicio8() {

        //Variables
        int Narticulos=1, cantidad=1;
        double precioN=0, descuento=0, descuentode15=0, descuentode12=0,descuento10=0, descuentofin=0;
        double descuento1fin=0, descuento2fin=0, descuento3fin=0;


        //Datos d entrada y proceso

        System.out.print("Ingrese cuantos articulos desea comprar:");
        Narticulos=teclado.nextInt();
        

        while (cantidad<=Narticulos) {

            System.out.println("Ingrese el costo del articulo "+cantidad+" :");

            precioN=teclado.nextDouble();

            if(precioN>=200){
                descuento=precioN*.15;
                descuentode15=precioN-descuento;
                descuento1fin=descuentofin+descuentode15;

                System.out.println("El descuento del articulo "+cantidad+" es de: $"+descuento);
                cantidad++;

            }else{
                if(precioN>100 && precioN<200){
                    descuento=precioN*.12;
                    descuentode12=precioN-descuento;
                    descuento2fin=descuentofin+descuentode12;
    
                    System.out.println("El descuento del artiuclo "+cantidad+" es de: $"+descuento);
                    cantidad++;

                }else{
                    descuento=precioN*.10;
                    descuento10=precioN-descuento;
                    descuento3fin=descuentofin+descuento10;
    
                    System.out.println("El descuento del artiuclo "+cantidad+" es de: $"+descuento);
                    cantidad++; 
                    
                }
            } 
               
        } 
        System.out.println("El precio total es de: $"+(descuento1fin+descuento2fin+descuento3fin));
    }


    public static void Ejercicio9() {
        //Variables
        int anhos=1;
        double ahorro, total=0, interes=0;
        System.out.println("Ingresa los años de ahorro");
        anhos=teclado.nextInt();

        while(anhos>0){

            for(int mes=1; mes<=12; mes++){
                System.out.println("Ingrese el ahorro del mes: "+mes);
                ahorro=teclado.nextDouble();
                total=total+ahorro;
            }
            interes=interes+(total*0.10);
            anhos=anhos-1;

            System.out.println("El interes anual es de: $"+interes);
            System.out.println("Lainversion final es de: $"+(total+interes));
        }
        
    }

    public static void Ejercicio10() {
        // Esta mal este Ing 
        int totalA=0, edad=0, suma=0, x=1, x2=1;


        System.out.println("Ingres cuantos salones hay");
        int salones=teclado.nextInt();
        while(salones>0){
            for (salones=1; x2 <=salones; x2++) {
                System.out.println("Ingrese la cantidad de alumnos del salon "+x2+":");
                totalA=teclado.nextInt();

                while (x<=totalA) {
                    System.out.println("Ingrese la edad del alumno "+x+":");
                    edad=teclado.nextInt();
                    suma=suma+edad;   
                    x++;   
                }
                System.out.println("la edad promedio del  salon "+salones+" es de"+(suma/totalA));
               
            }

        }
          
    }   

    public static void ejercicio14() {
        double nota=0, suma=0;
        int Na=0, AlumAprob=0, AlumDesaprob=0;

        System.out.println("Ingresa el numeros de alumnos");
        Na=teclado.nextInt();

        for (int n = 1; n<=Na; n++) {

            System.out.println("Ingrese la nota del alumno"+n+":");
            nota=teclado.nextDouble();

            suma=suma+nota;

            if(nota>=13){
                AlumAprob++;
            }else{
                if(nota<13){
                    AlumDesaprob++;
                    
                }
            }
            
        }
        System.out.println("De los "+Na+" alumnos : \nLos alumnos aprobados son:"+AlumAprob+"\nLosa alumnos desaprobados son :"+AlumDesaprob);
        
        
    }

    public static void main(String[] args) {
        System.out.println("Buen día estimado joven :)");
        //Ejercicio1();
        //Ejercicio2();
        //Ejercicio3();
        //Ejercicio4();
        //Ejercicio5();
        //Ejercicio12for();
        //Ejercicio21();
        //Ejercicio61();
        //Ejercicio62();
        //Ejercicio73();
        //Ejercicio9();
        //Ejercicio10();
        ejercicio14();
    }
}
