import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        int sueldoIngresado = 0, inmuebleIngresado=0, vehiculosIngresados=0, antiguedadIngresada=0;
        Scanner ingresarSueldo = new Scanner(System.in);
        Scanner ingresarInmuebles = new Scanner(System.in);
        Scanner ingresarVehiculos = new Scanner(System.in);
        Scanner ingresarAntiguedad = new Scanner(System.in);

        int sueldoMinimo= 163539,  inmueblesMinimos=1;
        int sueldoMedio= 572386,  inmueblesMedio=2;
        int sueldoMax= 572386, inmueblesMax=3, cantVehiculo1=3;


        System.out.printf("Digite su sueldo: ");
        sueldoIngresado = ingresarSueldo.nextInt();
        System.out.printf("Digite cantidad de inmuebles: ");
        inmuebleIngresado = ingresarInmuebles.nextInt();
        System.out.printf("Digite cantidad de vehiculos: ");
        vehiculosIngresados = ingresarVehiculos.nextInt();

        if(vehiculosIngresados>0){
            System.out.printf("Digite la antiguedad menor del vehiculo: ");
            antiguedadIngresada = ingresarAntiguedad.nextInt();
            if((sueldoIngresado <= sueldoMinimo) && (inmuebleIngresado <= inmueblesMinimos)  && (antiguedadIngresada>3)){
                System.out.println("Usted pertenece a la Categoria 3");
            }
            else if(sueldoIngresado>sueldoMinimo){
                if((sueldoIngresado < sueldoMedio) && (inmuebleIngresado <= inmueblesMedio)  && (antiguedadIngresada<3)){
                    System.out.println("Usted pertenece a la Categoria 2");
                }
            }

            if((sueldoIngresado >= sueldoMax) && (inmuebleIngresado >= inmueblesMax) && (vehiculosIngresados >= cantVehiculo1) && (antiguedadIngresada<5)){
                System.out.println("Usted pertenece a la Categoria 1");
            }

        }
        else {
            if((sueldoIngresado <= sueldoMinimo) && (inmuebleIngresado <= inmueblesMinimos)){
                System.out.println("Usted pertenece a la Categoria 3");
            }
            else if(sueldoIngresado>sueldoMinimo){
                if((sueldoIngresado < sueldoMedio) && (inmuebleIngresado <= inmueblesMedio)){
                    System.out.println("Usted pertenece a la Categoria 2");
                }
            }

            if((sueldoIngresado >= sueldoMax) && (inmuebleIngresado >= inmueblesMax) ){
                System.out.println("Usted pertenece a la Categoria 1");
            }
        }


    }
}
