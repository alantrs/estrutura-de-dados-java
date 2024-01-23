package src.vetor;

public class VetorAdicionaTeste {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(1);

        try{
            vetor.adiciona("elemento1");
            vetor.adiciona("elemento2");
        }catch(Exception e){
            System.out.println("Vetor cheio");
        }

    }
}
