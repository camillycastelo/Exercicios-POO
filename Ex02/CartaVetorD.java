import java.util.ArrayList;

public class CartaVetorD {
    public static void main(String[] args) {
        ArrayList<Carta> baralho = new ArrayList<Carta>(); 

        for (int n = 0; n <= 3; n++) { 
            for (int f = 1; f <= 13; f++) { 
                    baralho.add(new Carta(f, n)); 
            }
        }

        for (int i = 0; i < baralho.size(); i++) {
            baralho.get(i).imprimir();
        }

        embaralhar(baralho);

        System.out.println("\nEmbaralhado: \n");
        
        for (int i = 0; i < baralho.size(); i++) {
            baralho.get(i).imprimir();
        }

    }

    public static void embaralhar(ArrayList<Carta> deck){
        Carta temp;
        int posAleat;

        for (int i = 0; i < deck.size(); i++) {
            posAleat = (int) (Math.random() * deck.size());
            temp = deck.get(i);
            deck.set(i, deck.get(posAleat));
            deck.set(posAleat, temp);
        }
    }
}
