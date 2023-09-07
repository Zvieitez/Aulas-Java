package Aula06.banco;

public class Conta_Estudantil extends Conta{

    private String numeroCarteiraEstudantil;

    public String getNumeroCarteiraEstudantil() {
        return numeroCarteiraEstudantil;
    }
    @Override
    public void setSaldo(double saldo){
        super.setSaldo(saldo + 2);
    }

    public void setNumeroCarteiraEstudantil(String numeroCarteiraEstudantil) {
        this.numeroCarteiraEstudantil = numeroCarteiraEstudantil;
    }
}
