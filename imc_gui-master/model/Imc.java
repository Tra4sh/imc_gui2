package model;

public class Imc {
    private int peso;
    private double altura;
    private double imc;
    private String status;


    public String getStatus() {
        if (getImc() <= 18.5) {
            this.status = "Abaixo do Peso";
        } else if (getImc() > 18.5 && getImc() < 25.0) {
            this.status = "Peso normal";
        } else {
            this.status = "Acima  do Peso";
        }
        return status;
    }

    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getImc() {
        imc = peso / Math.pow(altura, 2);
        return imc;
    }
    public void setImc(double imc) {
        this.imc = imc;
    }
}
