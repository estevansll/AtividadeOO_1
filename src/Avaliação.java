import javax.swing.JOptionPane;

public class Avaliação {
    
    public static void main(String[] args){

        String prova1Str = JOptionPane.showInputDialog(null, "Digite a nota da prova 1: ");
        double prova1 = Double.parseDouble(prova1Str);

        String prova2Str = JOptionPane.showInputDialog(null, "Digite a nota da prova 2:");
        double prova2 = Double.parseDouble(prova2Str);

        String trabalhoStr = JOptionPane.showInputDialog(null, "Digite a nota do trabalho");
        double trabalho = Double.parseDouble(trabalhoStr);

        double media = calcularMedia(prova1, prova2, trabalho);

        verificaAprovacao(media);

    }

    public static double calcularMedia(double prova1, double prova2, double trabalho){
        double media = (prova1+prova2+trabalho)/3;
        return media;
    }

    public static void verificaAprovacao(double media){
        if(media>=6.0){
            JOptionPane.showMessageDialog(null, "Nota: "+media +" - Aprovado");
        }else{
            JOptionPane.showMessageDialog(null, "Nota: "+media +" - Reprovado");
        }
    }

}
