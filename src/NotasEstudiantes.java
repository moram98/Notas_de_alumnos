import java.util.Scanner;

public class NotasEstudiantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sumaPromedioMayor5 = 0;
        int contadorMayor5 = 0;
        double sumaPromedioMenor4 = 0;
        int contadorMenor4 = 0;
        int contadorNotas1 = 0;
        double sumaTotal = 0;
        int contadorTotal = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Ingrese la nota del alumno " + (i + 1) + ": ");
            double nota = scanner.nextDouble();

            if (nota == 0) {
                System.out.println("Error: Nota inválida. El programa ha finalizado.");
                return;
            }

            sumaTotal += nota;
            contadorTotal++;

            if (nota >= 5) {
                sumaPromedioMayor5 += nota;
                contadorMayor5++;

            } else if (nota <= 4) {
                sumaPromedioMenor4 += nota;
                contadorMenor4++;
            }

            if (nota == 1) {
                contadorNotas1++;
            }
        }

        double promedioMayor5 = contadorMayor5 > 0 ? sumaPromedioMayor5 / contadorMayor5 : 0;
        double promedioMenor4 = contadorMenor4 > 0 ? sumaPromedioMenor4 / contadorMenor4 : 0;
        double promedioTotal = contadorTotal > 0 ? sumaTotal / contadorTotal : 0;


        System.out.println("Promedio de notas mayores a 5: " + promedioMayor5);
        System.out.println("Promedio de notas inferiores a 4: " + promedioMenor4);
        System.out.println("Cantidad de notas 1: " + contadorNotas1);
        System.out.println("Promedio total: " + promedioTotal);
    }
}