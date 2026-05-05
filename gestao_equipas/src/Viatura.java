public class Viatura {

    private String tipoCarro;
    private int numRodas;
    private int VelMaxima;
    private String matricula;

    // Construtor vazio
    public Viatura() {
    }

    // Construtor com parâmetros
    public Viatura(String tipoCarro, int numRodas, int VelMaxima, String matricula) {
        this.tipoCarro = tipoCarro;
        this.numRodas = numRodas;
        this.VelMaxima = VelMaxima;
        this.matricula = matricula;
    }

    // Getters e Setters
    public String getTipoCarro() {
        return tipoCarro;
    }

    public void setTipoCarro(String tipoCarro) {
        this.tipoCarro = tipoCarro;
    }

    public int getNumRodas() {
        return numRodas;
    }

    public void setNumRodas(int numRodas) {
        this.numRodas = numRodas;
    }

    public int getVelMaxima() {
        return VelMaxima;
    }

    public void setVelMaxima(int velMaxima) {
        VelMaxima = velMaxima;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Método para mostrar as informações do carro
    public void mostrarInfo() {
        System.out.println("Tipo de Carros:" + this.tipoCarro);
        System.out.println("Número de Rodas:" + this.numRodas);
        System.out.println("Velocidade Máxima:" + this.VelMaxima + " km/h");
        System.out.println("Matrícula:" + this.matricula);
    }

}
