import java.util.Scanner;

public class Manipulacao {
    private String nome;
    private int qtdPerguntas = 5;
    private String[] gabarito = {"b","c","a","a","c"};
    private String[] alternativasPossiveis = {"a","b","c"};
    private String[] respAluno = new String[qtdPerguntas];
    private int qtdPontos = 2;
    private int nota=0;
    static private Scanner scanner = new Scanner(System.in);

    private String[] perguntas={
            "Pergunta 1",
            "Pergunta 2",
            "Pergunta 3",
            "Pergunta 4",
            "Pergunta 5",
    };
    private String[] enunciado = {
            "Quanto é 4x2?",
            "Qual a segunda letra do nosso alfabeto?",
            "Qual a capital do Brasil?",
            "Qual das séries é de comédia?",
            "Valor de PI?"
    };
    private String[] alternativas = {
            "a)2 | b)8 | c)16",
            "a)Z | b)C | c)B",
            "a)Brasilia | b)São Paulo | c)Curitiba",
            "a)Friends | b)This is Us | c)NCIS",
            "a)3.10 | b)3 | c)3.14"
    };


    public Manipulacao(String nome) {
        this.nome=nome;
    }

    public void perguntasEhRespostas(){
         for(int i=0; i < this.qtdPerguntas; i++){
             System.out.println(perguntas[i]);
             System.out.println(enunciado[i]);
             System.out.println(alternativas[i]);
             respAluno[i]=validacaoEscolha();
         }
    };

    public int resul(){
        for(int i=0; i< qtdPerguntas; i++){
            if(gabarito[i].equalsIgnoreCase(respAluno[i])){
                this.nota+=qtdPontos;
            }
        }
        return nota;
    }

    public String escolha(){
        return scanner.nextLine();
    }

    public String validacaoEscolha(){
        Boolean aux=false;
        String alternativa;
        do{
            alternativa=escolha();
            for(String op: alternativasPossiveis){
                if(alternativa.equalsIgnoreCase(op)){
                    aux=true;
                    break;
                }
            }
            if(!aux){
                System.out.println("OPÇÃO INVÁLIDA!alternativas possíveis são: a,b,c");
            }
        }while(!aux);
        return alternativa;
    }

   public static String nomeAluno(){
        System.out.println("Qual seu nome?");
        return scanner.nextLine();
    }

}
