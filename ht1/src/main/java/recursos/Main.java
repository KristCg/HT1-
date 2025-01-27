package recursos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Licuadora licuadora = new Licuadora(1, 10.0);
            int op;

            do {
                System.out.println("Menu");
                System.out.println("1. Encender");
                System.out.println("2. Apagar");
                System.out.println("3. Llenar");
                System.out.println("4. Servir");
                System.out.println("5. Incrementar Velocidad");
                System.out.println("6. Decrementar Velocidad");
                System.out.println("7. Vaciar");
                System.out.println("8. Consultar Estado");
                System.out.println("9. Salir");
                System.out.print("Seleccione una opción: ");
                op = scanner.nextInt();

                switch (op) {
                    case 1:
                        licuadora.encender();
                        System.out.println("Licuadora encendida.");
                        break;
                    case 2:
                        licuadora.apagar();
                        System.out.println("Licuadora apagada.");
                        break;
                    case 3:
                        System.out.print("Ingrese cantidad a llenar (litros): ");
                        double cantidad = scanner.nextDouble();
                        System.out.println("Cantidad actual: " + licuadora.llenar(cantidad) + " litros");
                        break;
                    case 4:
                        System.out.print("Ingrese cantidad a servir (litros): ");
                        double servir = scanner.nextDouble();
                        System.out.println("Cantidad restante: " + licuadora.servir(servir) + " litros");
                            break;
                    case 5:
                        System.out.println("Velocidad actual: " + licuadora.incrementarVelocidad());
                        break;
                    case 6:
                        System.out.println("Velocidad actual: " + licuadora.decrecerVelocidad());
                        break;
                    case 7:
                        licuadora.vaciar();
                        System.out.println("Licuadora vaciada.");
                        break;
                    case 8:
                        System.out.println("Estado: " + (licuadora.estaLlena() ? "Llena" : "Vacía"));
                        System.out.println("Velocidad: " + licuadora.incrementarVelocidad());
                        break;
                    case 9:
                        System.out.println("Cerrando Programa...");
                        break;
                    default:
                        System.out.println("Opción inválida");
                }
            
            } while (op != 9);
        }
    }
}