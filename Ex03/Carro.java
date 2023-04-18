public class Carro {
    private String modelo, marca;
    private boolean ligado;
    private float velocidade;
    private int qtdPortas;

    public Carro(){
        this.modelo = "";
        this.marca = "";
        this.ligado = false;
        this.velocidade = 0;
        this.qtdPortas = 0;
    }

    public Carro(String modelo, String marca, boolean ligado, float velocidade, int qtdPortas){
        this.modelo = modelo;
        this.marca = marca;
        this.ligado = ligado;
        this.velocidade = velocidade;
        this.qtdPortas = qtdPortas;
    }

    public void acelerar(){
        if(this.ligado)
            this.velocidade += 5;
    }

    public void brecar(){
        if(this.ligado && this.velocidade >= 0)
            this.velocidade -= 10;
    }

    public void ligar(){
        if(this.ligado == false && this.velocidade == 0)
            this.ligado = true;  
    }

    public void desligar(){
        if(this.ligado == true && this.velocidade == 0)
            this.ligado = false;
    }

    public void imprimir(){
        System.out.println("\nCarro \nModelo: " + getModelo() + "\nMarca: " + getMarca() + "\nLigado: " + this.ligado + "\nVelocidade: " + this.velocidade + "\nQuantidade de Portas: " + getQtdPortas());
    }

    public void setModelo(String modelo){ // é um método que permite alterar o valor de um atributo privado
        this.modelo = modelo;
    }

    public String getModelo(){ // é um método que retorna o valor de um atributo privado
        return this.modelo;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setQtdPortas(int qtdPortas){
        this.qtdPortas = qtdPortas;
    }

    public int getQtdPortas(){
        return this.qtdPortas;
    }
    
}