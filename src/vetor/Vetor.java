package src.vetor;

import java.util.Arrays;

public class Vetor {

    private String[] elementos;
    private Integer tamanho;

    public Vetor(Integer capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public void adiciona(String elemento) throws Exception{
        if(this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        }else{
            throw new Exception("");
        }
    }

    public String[] getElementos() {
        return elementos;
    }

    public void setElementos(String[] elementos) {
        this.elementos = elementos;
    }

    public Integer getTamanho() {
        return tamanho;
    }

    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();

        s.append("[");

        for(int i = 0; i <this.tamanho-1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if(this.tamanho>0){
            s.append(this.elementos[tamanho-1]);
        }

        s.append("]");
        return s.toString();
    }
}
