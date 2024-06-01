import java.util.Scanner;

public class CalculaAposentadoria {
    
    public static void main(String[] args){
        Scanner tc = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = tc.nextInt();

        System.out.println("Digite o seu sexo (M/F): ");
        String sexo = tc.next();

        System.out.println("Digite os anos de contribuição: ");
        int anosContribuição = tc.nextInt();

        String resultado = verificarAposentadoria(idade, sexo, anosContribuição);

        System.out.println(resultado);

        tc.close();
    }

    public static String verificarAposentadoria(int idade, String sexo, int anosContribuicao){
        int idadeMinima = sexo.equals("F") ? 62 : 65;
        int tempoContribuicao = sexo.equals("F") ? 30 : 35;

        boolean podeAposentarPorIdade = idade >= idadeMinima;
        boolean podeAposentarPorContribuicao = anosContribuicao >= tempoContribuicao;

        if(podeAposentarPorIdade || podeAposentarPorContribuicao){
            return "Você já pode se aposentar";
        }else {
            int anosFaltantesIdade = idadeMinima - idade;
            int anosFaltantesContribuicao = tempoContribuicao - anosContribuicao;
            int anosFaltantes = Math.max(anosFaltantesIdade, anosFaltantesContribuicao);
            
            return "Faltam " + anosFaltantes + " anos para você poder se aposentar.";
    }
    }}
