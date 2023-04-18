package ex04;

public class Conta {
    String nomeCliente;
    int numConta;
    double saldo;

    Conta(String nome, int numC, double sal){
        nomeCliente = nome;
        numConta = numC;
        saldo = sal;
    }

    Conta(String nome){
        nomeCliente = nome;
        numConta = 0;
        saldo = 0;
    }

    Conta(String nome, int numC){
        nomeCliente = nome;
        numConta = numC;
        saldo = 0;
    }

    void imprimir(){
        System.out.println("Nome: " + nomeCliente + "\nNúmero da Conta: " + numConta + "\nSaldo: " + saldo + "\n");
    }

    void sacar(double s){
        saldo = saldo - s;
    }

    void depositar(double d){
        saldo = saldo + d;
    }
}
