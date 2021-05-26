package aula03;

public class Pessoa {

    //Atributos
    public String nome;
    public double peso;
    public double altura;

    //Métodos
    public double getImc() {
        return peso / Math.pow(altura, 2);
    }

    @Override
    public String toString() {
        return "Nome..: " + nome.toUpperCase() + "\n"
             + "Peso..: " + String.format("%.2f\n", peso)
             + "Altura: " + String.format("%.2f\n", altura)
             + "IMC...: " + String.format("%.2f\n", getImc());
    }

}
