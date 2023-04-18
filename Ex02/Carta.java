/**
  Usando a classe Carta implementada em aula, faça um programa que crie as 52 cartas de um baralho comum dispostas de forma aleatória em um vetor (pode ser dinâmico).
 */
public class Carta {

    private int face;   
    private int naipe;
    private boolean visivel;

    public Carta(){
        this.face = (int) (Math.random() * 13) + 1;
        this.naipe = (int) (Math.random() * 4);
        this.visivel = true;
    }

    public Carta(int face, int naipe){
        setFace(face);
        setNaipe(naipe);   
        this.visivel = true;
    }

    public void setFace(int face){ 
        if(face >= 1 && face <= 13)
            this.face = face;
        else 
            this.face = 1; 
    }

    public void setNaipe(int naipe){
        if(naipe >= 0 && naipe <= 3)
            this.naipe = naipe;
        else 
            this.naipe = 0; 
    }

    public int getNaipe(){ 
        return this.naipe;   
    }

    public int getFace(){
        return this.face;   
    }

    public void virarCarta(){
        this.visivel = !this.visivel;
    }

    public void imprimir(){
        String carta = "";

        if(face == 1) carta = "A";
        else if(face == 11) carta = "J";
        else if(face == 12) carta = "Q";
        else if (face == 13) carta = "K";
        else carta += face;

        if(naipe == 0) carta += " ouros";
        else if(naipe == 1) carta += " espadas";
        else if(naipe == 2) carta += " copas";
        else if(naipe == 3) carta += " paus";

        if(visivel){
            System.out.println(carta);
        } else {
            System.out.println("##");
        }
    }
}
