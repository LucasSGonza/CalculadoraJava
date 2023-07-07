package Logica;

/**
 *
 * @author Lucas
 */
public class Calculos {

    //atributos
    private String conta;
    private double calculo;

    //método construtor vazio
    public Calculos() {
    }

    //métodos
    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getConta() {
        return conta;
    }

    public void setCalculo(double calculo) {
        this.calculo = calculo;
    }

    public double getCalculo() {
        return calculo;
    }

    public String formarConta(String numero, String operador) {
        this.setConta((numero + operador));
        return this.conta;
    }

    public double fazerCalculo(String conta) {
        this.setCalculo(Double.parseDouble(conta));
        return this.calculo;
    }

}
