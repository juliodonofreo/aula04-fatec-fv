package olamundo;

public class Main {
    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo();
        veiculo.setMarca("Honda");
        veiculo.setModelo("Civic");
        veiculo.setPlaca("aaaaaa");
        veiculo.setAno_fabricacao(2020);
        veiculo.setPotencia_motor(3.4f);

        for (int i = 0; i < 10; i++) veiculo.acelerar();

        System.out.println(veiculo.getVelocidade());
    }
}