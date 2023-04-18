public class Index {
    public static void main(String[] args) {
        Animal a1 = new Animal("José", 10);
        Mamifero m1 = new Mamifero("Pedro", 14, "Curto", "Leão-Africano");
        Cachorro c1 = new Cachorro("Billy Jackson", 7, "Curto", "Canis familiaris", "Shih-tzu", "Branco");

        a1.fazerSom();
        m1.amamentar();
        m1.fazerSom();
        c1.latir();
        c1.amamentar();
        c1.fazerSom();
    }
}
