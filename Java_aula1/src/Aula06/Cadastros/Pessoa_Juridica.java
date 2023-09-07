package Aula06.Cadastros;

public class Pessoa_Juridica extends Pessoa {


    private String nomeFanatasia;
    private String cnpj;

    public String getNomeFanatasia() {
        return nomeFanatasia;
    }

    public void setNomeFanatasia(String nomeFanatasia) {
        this.nomeFanatasia = nomeFanatasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void declararImposto(double valor){
        if (valor > 50000){
            System.out.println(valor - 1000);
        }else{
            System.out.println(valor);
        }
    }


}
