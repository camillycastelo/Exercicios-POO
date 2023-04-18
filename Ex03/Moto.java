public class Moto {
    private String modelo, marca;
    private boolean ligado;
    private float velocidade;

    public Moto(){
        this.modelo = "";
        this.marca = "";
        this.ligado = false;
        this.velocidade = 0;
    }

    public Moto(String modelo, String marca, boolean ligado, float velocidade){
        this.modelo = modelo;
        this.marca = marca;
        this.ligado = ligado;
        this.velocidade = velocidade;
    }

    public void acelerar(){
        if(this.ligado)
            this.velocidade += 10;
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
        if(this.ligado && this.velocidade == 0)
            this.ligado = false;
    }

    public void buzinar(){
        System.out.println("bi bi");
    }

    public void imprimir(){
        System.out.println("\nMoto \nModelo: " + getModelo() + "\nMarca: " + getMarca() + "\nLigado: " + this.ligado + "\nVelocidade: " + this.velocidade);
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getMarca(){
        return this.marca;
    } 
}
