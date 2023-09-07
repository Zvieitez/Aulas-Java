package Aula06.Cadastros;

public class Pessoa_Fisica extends Pessoa {

    private String cpf;
    private String genero;
    private String estadoCivil;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void declararImposto(double valor) {
        if (valor > 3000) {
            System.out.println(valor - 1000);

        } else {
            System.out.println(valor);
        }

    }
}
