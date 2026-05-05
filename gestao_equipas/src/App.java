public class App {
    public static void main(String[] args) throws Exception {

        Barco carro = new Barco();

        carro.setNumRodas(4);
        carro.setTipoCarro("Carro Desportivo");
        carro.setVelMaxima(120);
        carro.setMatricula("AB-12-CD");

        carro.mostrarInfo();

    }
}
