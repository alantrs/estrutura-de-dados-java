package src.vetor;

public class VetorBuscaTeste {

    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);

        vetor.adiciona("elemento1");
        vetor.adiciona("elemento2");

        String s = vetor.busca(4);
        System.out.println(s);
    }
}
