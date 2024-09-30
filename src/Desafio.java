import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nombre = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        Double saldo= 1599.99;
        int opcion= 0;

        System.out.println("**************************");
        System.out.println("\nNombre del Cliente:"+ nombre);
        System.out.println("El tipo de cuenta es :"+ tipoDeCuenta);
        System.out.println("Su Saldo disponible es de :"+saldo+ "$");
        System.out.println("\n**************************");

        String menu = """
                ***Escriba el numero de la opcion deseada***
                1- consultar saldo 
                2- retirar
                3- depositar
                9- salir 
                """;
        Scanner teclado= new Scanner(System.in);
        while (opcion !=9){
            System.out.println(menu);

            opcion= teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("el saldo actualizado es :"+saldo+"$");
                    break;
                case 2 :
                    System.out.println("¿cual es el valor que desea retirar?");
                    double valorARetirar= teclado.nextDouble();
                    if (saldo<valorARetirar){
                        System.out.println("saldo insuficiente");
                    }else{
                        saldo=saldo - valorARetirar;
                        System.out.println("el saldo actualizadoes de:"+saldo);

                    }
                    break;
                case 3:
                    System.out.println("¿cual es el valor que desea depositar?");
                    double valorADepositar = teclado.nextDouble();
                    saldo= saldo+valorADepositar;
                    //ootra forma saldo+=valorADepositar//
                    System.out.println("el saldo actualizado es de :"+saldo);
                    break;
                case 9:
                    System.out.println("saliendo del progarama, gracias por utilizar nuestro servicios");
                    break;
                default:
                    System.out.println("opcion no valida");

            }

        }


    }
}
