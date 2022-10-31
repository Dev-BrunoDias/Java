package modelagem;

public class paciente {
    private int idPaciente;
    private String nome;
    private String endereco;
    private int telefone;
    private int idMedico;

    public paciente(int idPaciente, String nome, String endereco, int telefone, int idMedico) {
        this.idPaciente = idPaciente;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.idMedico = idMedico;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
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

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }
}
