package olamundo;

public class Veiculo {
    private
        String marca, modelo, placa;
    private int ano_fabricacao, velocidade;
    private float potencia_motor;

    public void acelerar(){
        velocidade += 5;
        System.out.println("Veículo está aumentando a velocidade. ");
    }

    public void parar(){
        velocidade = 0;
        System.out.println("Veículo está diminuindo a velocidade. ");
    }

    public void buzinar(){
        System.out.println("Veículo está buzinando. ");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPotencia_motor() {
        return potencia_motor;
    }

    public void setPotencia_motor(float potencia_motor) {
        this.potencia_motor = potencia_motor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno_fabricacao() {
        return ano_fabricacao;
    }

    public void setAno_fabricacao(int ano_fabricacao) {
        this.ano_fabricacao = ano_fabricacao;
    }

    public int getVelocidade() {
        return velocidade;
    }
}
