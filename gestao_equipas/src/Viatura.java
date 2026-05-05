public class Viatura {

    private String tipoCarro;
    private int numRodas;
    private int VelMaxima;

//Constriutores
public Viatura(){
}    

public Viatura(String tipoCarro, int numRodas, int VelMaxima) {
    this.tipoCarro = tipoCarro;
    this.numRodas = numRodas;
    this.VelMaxima = VelMaxima;
}

//Getters e Setters
    public String getTipoCarro() {
        return tipoCarro;
    }

    public int getNumRodas() {
        return numRodas;
    }

    public int getVelMaxima() {
        return VelMaxima;
    }

}

    public void setTipoCarro(String tipoCarro) {
        this.tipoCarro = tipoCarro;
    }

    public void setNumRodas(int numRodas) {
        this.numRodas = numRodas;
    }

    public void setVelMaxima(int velMaxima) {
        VelMaxima = velMaxima;
    }

    public void mostrarInfo() {
        System.out.println("Tipo de Carros:" + this.tipoCarro);
        System.out.println("Número de Rodas:" + this.numRodas);
        System.out.println("Velocidade Máxima:" + this.VelMaxima + " km/h");
    }
}
