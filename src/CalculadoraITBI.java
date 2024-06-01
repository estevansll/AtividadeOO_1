import javax.swing.JOptionPane;

public class CalculadoraITBI {
    
    public static void main(String[] args){

        String valorTransaçãoStr = JOptionPane.showInputDialog(null, "Digite o valor de transação do imovel: ");
        double valorTransação = Double.parseDouble(valorTransaçãoStr);

        String valorVenalStr = JOptionPane.showInputDialog(null, "Digite o valor venal do imóvel: ");
        double valorVenal = Double.parseDouble(valorVenalStr);

        String porcentagemStr = JOptionPane.showInputDialog(null, "Digite a porcentagem do imposto ITBI:");
        double porcentagem  = Double.parseDouble(porcentagemStr);

        double maiorValor = Math.max(valorVenal, valorTransação);

        double imposto = calcularImposto(maiorValor, porcentagem);

        JOptionPane.showMessageDialog(null, "O valor do imposto ITBI a ser pago é: " + imposto);

        
    }

    public static double calcularImposto(double valor, double porcentagem){
        return valor * (porcentagem/100);
    }
}
