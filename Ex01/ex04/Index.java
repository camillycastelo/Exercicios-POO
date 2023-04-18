package ex04;

public class Index {
    public static void main(String[] args) {
        /*
         Crie uma classe de nome Conta que armazene atributos para o nome do cliente, o número da conta e saldo. Em seguida, crie um método de nome “imprimir” que imprime os dados da conta, outro método de nome “sacar” que recebe um valor e saca do saldo, outro “depositar” que recebe um valor e deposita na conta.
        */

        Conta c1 = new Conta("Paulo", 1, 998.50);
        Conta c2 = new Conta("Maria", 2);
        Conta c3 = new Conta("Lupita", 3, 2050);

        c1.imprimir();
        c2.imprimir();
        c3.imprimir();

        c1.sacar(250.0);
        c2.depositar(1400.0);
        c3.sacar(500.0);
        c3.depositar(100.0);

        c1.imprimir();
        c2.imprimir();
        c3.imprimir();
    }
}
