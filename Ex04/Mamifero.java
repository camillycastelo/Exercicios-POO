public class Mamifero extends Animal {
    protected String tipo_pelo;
    protected String especie;

    public Mamifero(String nome, int idade, String tipo_pelo, String especie){
        super(nome, idade);
        this.tipo_pelo = tipo_pelo;
        this.especie = especie;
    }

    public void amamentar(){
        System.out.println("Está amamentando!");
    }

    public String getTipo_pelo(){
        return this.tipo_pelo;
    }

    public String getEspecie(){
        return this.especie;
    }
}
