import java.util.Scanner;
public class CalculadoraDesconto {
    
    public static void main(String[] args){

        Scanner tc = new Scanner(System.in);

        System.out.println("Digite um valor:");
        double produto = tc.nextInt();

        System.out.println("Digite um valor de porcentagem a ser aplicado:");
        double porcentagem = tc.nextInt();

        double precoFinal = aplicarPorcentagem(produto, porcentagem);

        System.out.println("Desconto: "+porcentagem+"%");
        System.out.println("Preço com desconto: "+precoFinal);

        tc.close();
    }
    public static double aplicarPorcentagem(double produto, double porcentagem){
        return produto * (porcentagem/100);
}}

