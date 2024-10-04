public class Principal {
    public static void main(String[] args) {

        Bolo boloAnaMaria = new BoloChocolate();
        boloAnaMaria.preparar();

        boloAnaMaria = new BoloCenoura();
        boloAnaMaria.preparar();

        boloAnaMaria = new BoloMorango();
        boloAnaMaria.preparar();

        boloAnaMaria = new BoloAbacaxi();
        boloAnaMaria.preparar();

    }
}
