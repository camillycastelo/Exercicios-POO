package ex02;

public class Televisao {
    //atributos
    int canalDeTv = 1;
    double tamanho;
    String marca;

    //Construtores
    Televisao(int canal, double tam, String mar){
        canalDeTv = canal;
        tamanho = tam;
        marca = mar;
    }

    Televisao(double tam, String mar){
        canalDeTv = 1;
        tamanho = tam;
        marca = mar;
    }

    Televisao(){
        canalDeTv = 1;
        tamanho = 0;
        marca = "";
    }
    
    //métodos - comportamentos
    void aumentaCanal(){
        canalDeTv++;
    }

    void abaixaCanal(){
        canalDeTv--;
    }

    void imprimir(){
        System.out.println("Marca: " + marca + "\nTamanho: " + tamanho + "\nCanal de Tv: " + canalDeTv + "\n");
    }
}
