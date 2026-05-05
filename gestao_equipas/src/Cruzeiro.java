public class Cruzeiro extends Barco {
    private int numQuartos;
    private int numPisos;
    private String nomeBarco;

    // Construtor vazio
    public Cruzeiro() {
    }

    // Construtor com parâmetros
    public Cruzeiro(int numQuartos, int numPisos, String nomeBarco) {
        this.numQuartos = numQuartos;
        this.numPisos = numPisos;
        this.nomeBarco = nomeBarco;
    }

    // Getters e Setters
    public int getNumQuartos() {
        return numQuartos;
    }

    public void setNumQuartos(int numQuartos) {
        this.numQuartos = numQuartos;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    public String getNomeBarco() {
        return nomeBarco;
    }

    public void setNomeBarco(String nomeBarco) {
        this.nomeBarco = nomeBarco;
    }

    // Método para mostrar as informações do Cruzeiro
    public void mostraInfoCruzeiro() {
        super.mostrarInfo(); 
        System.out.println("-  Número de Quartos:" + this.numQuartos);
        System.out.println("-  Número de Pisos:" + this.numPisos);
        System.out.println("-  Nome do Barco:" + this.nomeBarco);
    }

}
