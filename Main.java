/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Conta{
    private String numero;
    private double saldo;

    public Conta(String numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNumero(){
        return this.numero;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void creditar(double valor){
        this.saldo += valor;
    }
    public void debitar(double valor){
        this.saldo -= valor;
    }
}