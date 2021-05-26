package aula05;

public class Retangulo {

    private double comprimento;
    private double largura;

    public Retangulo() {
        //this.comprimento = -1;
        //this.largura = -1;
        this(-1, -1);
    }
    
    public Retangulo(double comprimento){
        this(comprimento, -1);
    }

    public Retangulo(double comprimento, double largura) {
        //this.comprimento = comprimento;
        //this.largura = largura;
        this.setComprimento(comprimento);
        this.setLargura(largura);
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        if (comprimento > 0 && comprimento < 20) {
            this.comprimento = comprimento;
        } else {
            this.comprimento = -1;
        }
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (largura > 0 && largura < 20) {
            this.largura = largura;
        } else {
            this.largura = -1;
        }
    }

    public double getPerimetro() {
        if (getComprimento() != -1 && getLargura() != -1) {
            return 2 * (getComprimento() + getLargura());
        } else {
            return -1;
        }
    }

    public double getArea() {
        if (getComprimento() != -1 && getLargura() != -1) {
            return getComprimento() * getLargura();
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        if (getComprimento() != -1 && getLargura() != -1) {
            return String.format("Comprimento: %.2f "
                    + "\nLargura: %.2f \nPerímetro: %.2f \nÁrea: %.2f",
                    getComprimento(), getLargura(), getPerimetro(), getArea());
        } else {
            return "VALORES INVÁLIDOS";
        }
    }

}
