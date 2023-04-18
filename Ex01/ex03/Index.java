package ex03;

public class Index {
    public static void main(String[] args) {

    /*
       Crie uma classe de nome Data que armazene o dia, mês e ano de uma data. Em seguida crie um método de nome “entraDados” que receba as 3 informações para gravar nos atributos, outro método de nome “imprimeData” que imprime a data no formato dia/mês/ano
    */

        Data d1 = new Data();
        Data d2 = new Data();
        Data d3 = new Data();

        d1.entraDados(15, 05, 2003);
        d2.entraDados(05, 02, 1969);
        d3.entraDados(13, 12, 2000);

        d1.imprimeData();
        d2.imprimeData();
        d3.imprimeData();
    }
}
