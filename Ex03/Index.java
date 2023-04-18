public class Index {
    public static void main(String[] args) {
        /*
          Analise o modelo UML das classes em anexo e faça a implementação em Java de acordo com as instruções.
         */
        Carro c1 = new Carro("Fiat Cronos", "Fiat", false, 0, 4);
        Carro c2 = new Carro("Fiat Uno", "Fiat", true, 30.0f, 2);

        c1.ligar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.desligar();

        c1.imprimir();

        c2.brecar();
        c2.brecar();
        c2.brecar();
        c2.desligar();

        c2.imprimir();

        Moto m1 = new Moto("CG 160 Start", "Honda", false, 0);
        Moto m2 = new Moto("NXR 160 Bros ESDD", "Honda", true, 20);

        m1.ligar();
        m1.acelerar();
        m1.acelerar();
        m1.acelerar();
        m1.acelerar();
        m1.brecar();

        m1.imprimir();
        m1.buzinar();

        m2.brecar();
        m2.brecar();
        m2.desligar();

        m2.imprimir();
    }
}
