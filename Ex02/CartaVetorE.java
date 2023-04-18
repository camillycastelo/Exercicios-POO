public class CartaVetorE {
    public static void main(String[] args) {
        Carta baralho[] = new Carta[52];
        int cont = 0;

        for (int n = 0; n <= 3; n++) {
            for(int f = 1; f <= 13; f++){
                baralho[cont] = new Carta(f, n);
                cont++;
            }
        }

        for (int i = 0; i < baralho.length; i++) {
            baralho[i].imprimir();
        }

        embaralhar(baralho);

        System.out.println("\nEmbaralhado:\n");

        for (int i = 0; i < baralho.length; i++) {
            baralho[i].imprimir();
        }
    }

    public static void embaralhar(Carta desk[]){

        Carta temp;
        int numA;

        for (int i = 0; i < desk.length; i++) {
            numA = (int) (Math.random() * desk.length);
            temp = desk[i];
            desk[i] = desk[numA];
            desk[numA] = temp;
        }
    }
}
