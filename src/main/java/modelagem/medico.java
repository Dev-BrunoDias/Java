package modelagem;

public class medico {
    private int idMedico;
    private double crm;
    private String nome;
    private String endereco;
    private int telefone;
    private String especialidade;

    public medico(int idMedico, double crm, String nome, String endereco, int telefone, String especialidade) {
        this.idMedico = idMedico;
        this.crm = crm;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.especialidade = especialidade;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public double getCrm() {
        return crm;
    }

    public void setCrm(double crm) {
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
