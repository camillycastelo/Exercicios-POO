public class Cachorro extends Mamifero {
    private String raca;
    private String cor;

    public Cachorro(String nome, int idade, String tipo_pelo, String especie, String raca, String cor){
        super(nome, idade, tipo_pelo, especie);
        this.raca = raca;
        this.cor = cor;
    }

    public void latir(){
        System.out.println("Au Au ein");
    }   
    
    public void fazerSom(){
        System.out.println("Au Au ein 2");
    }

    public String getRaca(){
        return this.raca;
    }

    public String getCor(){
        return this.cor;
    }
}
