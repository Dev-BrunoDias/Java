package modelagem;

public class consultas {
    private int idConsulta;
    private int dia;
    private String observação;
    private int idPaciente;
    private int idResponsavel;

    public consultas(int idConsulta, int dia, String observação, int idPaciente, int idResponsavel) {
        this.idConsulta = idConsulta;
        this.dia = dia;
        this.observação = observação;
        this.idPaciente = idPaciente;
        this.idResponsavel = idResponsavel;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getObservação() {
        return observação;
    }

    public void setObservação(String observação) {
        this.observação = observação;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getIdResponsavel() {
        return idResponsavel;
    }

    public void setIdResponsavel(int idResponsavel) {
        this.idResponsavel = idResponsavel;
    }
}
