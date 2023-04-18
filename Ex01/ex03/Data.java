package ex03;

public class Data {

     int dia, mes, ano;

     Data(){
        dia = 01;
        mes = 01;
        ano = 2023;
     }

     Data(int a){
        dia = 01;
        mes = 01;
        ano = a;
     }

     Data(int m, int a){
        dia = 01;
        mes = m;
        ano = a;
     }

     void entraDados(int d, int m, int a){
        dia = d;
        mes = m;
        ano = a;
     }

     void imprimeData(){
        System.out.println("Data: " + dia + " / " + mes + " / " + ano + "\n");
     }
}
