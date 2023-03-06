import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int numeroInicio = 5;
        int numeroFin = 14;
        int variableExtra = 0;

        //punto a - mostrar numeros del 5 al 14
        while (numeroInicio<=numeroFin){
            System.out.println(numeroInicio);
            numeroInicio += 1;
        }
        //punto b - mostrar numeros pares
        for (numeroInicio=5; numeroInicio<=numeroFin; numeroInicio++){
            if(numeroInicio%2 == 0){
                System.out.println("Numero par: " + numeroInicio);
            }
        }
        // punto c - variable extra que te haga elegir si mostrar par o impar
        System.out.println("Digite en su teclado: \nopción : 1 si usted quiere ver un número par. \nopción : 2 si quiere ver número impar");
        Scanner nuevaOpcion = new Scanner(System.in);
        variableExtra = nuevaOpcion.nextInt();
        if(variableExtra == 1){
            for(numeroInicio=5; numeroInicio<=numeroFin; numeroInicio++){
                if(numeroInicio%2 == 0){
                    System.out.println("Numeros pares: " + numeroInicio);
                }
            }
        }
        else if (variableExtra == 2) {
            for(numeroInicio=5; numeroInicio<=numeroFin; numeroInicio++){
                if(numeroInicio%2 != 0){
                    System.out.println("Numeros impares: " + numeroInicio);
                }
            }
        } else{
            System.out.println("Usted ha seleccionado una opción fuera del rango establecido");
        }
        //punto d - mostrar numeros pares pero a la inversa 14, 12...
        for (numeroFin=14; numeroFin>=5; numeroFin--){
            if(numeroFin%2 == 0){
                System.out.println("Numero par: " + numeroFin);
            }
        }


    }
}
