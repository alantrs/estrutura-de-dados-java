package src.vetor;

public class VetorAdicionaQualquerPosicaoTeste {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("elemento1");
        vetor.adiciona("elemento2");
        vetor.adiciona("elemento3");
        vetor.adiciona("elemento4");

        vetor.adiciona(0, "elemento0");
        System.out.println(vetor.toString());
    }
}
