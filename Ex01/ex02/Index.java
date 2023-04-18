package ex02;

public class Index {
    public static void main(String[] args) {
        /*
            Crie uma classe de nome Televisao que armazene atributos para o canal de TV, marca e tamanho em polegadas. Em seguida, crie um método de nome “aumentaCanal” que aumenta em 1 o canal da TV, outro método de nome “abaixaCanal” que diminui em 1 o canal da TV e um método de nome “imprimir” que imprime os dados da TV na tela. Após isso, instancie um objeto em uma classe com void main e teste os métodos criados 16 Orientação a Objetos Exercícios
        */ 

        Televisao tv1 = new Televisao(5, 40, "Samsung");
        Televisao tv2 = new Televisao(9, 50, "Panasonic");

        tv1.abaixaCanal();
        tv1.imprimir();

        tv2.aumentaCanal();
        tv2.imprimir();

    }
}
