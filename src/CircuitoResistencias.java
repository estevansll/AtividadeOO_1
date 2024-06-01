import java.util.Scanner;

public class CircuitoResistencias {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor da primeira resistência: ");
        double resistencia1 = scanner.nextDouble();
        
        System.out.print("Digite o valor da segunda resistência: ");
        double resistencia2 = scanner.nextDouble();
        
        System.out.print("Digite o valor da terceira resistência: ");
        double resistencia3 = scanner.nextDouble();
        
        System.out.print("Digite o valor da quarta resistência: ");
        double resistencia4 = scanner.nextDouble();
        
        double resistenciaEquivalente = resistencia1 + resistencia2 + resistencia3 + resistencia4;
        
        double maiorResistencia = Math.max(Math.max(resistencia1, resistencia2), Math.max(resistencia3, resistencia4));
        double menorResistencia = Math.min(Math.min(resistencia1, resistencia2), Math.min(resistencia3, resistencia4));
        
        System.out.println("Resistência equivalente: " + resistenciaEquivalente + " ohms");
        System.out.println("Maior resistência: " + maiorResistencia + " ohms");
        System.out.println("Menor resistência: " + menorResistencia + " ohms");
        
        scanner.close();
    }
}
