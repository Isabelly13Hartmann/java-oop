public class Barco extends Viatura {
    private boolean temPiscina;

    // Construtor vazio
    public Barco() {
        super("Barco", 0, 0, "");
    }

    // Getters e Setters
    public boolean isTemPiscina() {
        return temPiscina;
    }

    public void setTemPiscina(boolean temPiscina) {
        this.temPiscina = temPiscina;
    }

    // @Override serve para indicar que estamos a sobrescrever um método da classe
    // "pai "(Viatura)
    @Override

    // Método mostrarInfo para incluir a informação sobre a piscina
    public void mostrarInfo() {
        System.out.println("Vou mostrar as informações do Barco:\n");
        System.out.println("-  Tipo de Barco?" + getTipoCarro());
        System.out.println("-  Número de Rodas:" + getNumRodas());
        System.out.println("-  Velocidade Máxima:" + getVelMaxima() + " km/h");
        System.out.println("-  Matrícula:" + getMatricula());

        if (temPiscina) {
            System.out.println("- Tem piscina: Sim :)");
        } else {
            System.out.println("-  Não tem piscina: :(\n");
        }
    }

}
