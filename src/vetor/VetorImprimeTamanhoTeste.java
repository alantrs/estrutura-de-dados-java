package src.vetor;

public class VetorImprimeTamanhoTeste {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("elemento1");
        vetor.adiciona("elemento2");
        vetor.adiciona("elemento3");
        vetor.adiciona("elemento4");

        System.out.println(vetor.getQuantidade());
        System.out.println(vetor.toString());
    }
}
