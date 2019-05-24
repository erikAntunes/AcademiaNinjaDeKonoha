public class ProfessorAdjunto extends Professor {

    private Integer horasMonitoramento;
    private String especialidade;


    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Integer getHorasMonitoramento() {
        return horasMonitoramento;
    }

    public void setHorasMonitoramento(Integer horasMonitoramento) {
        this.horasMonitoramento = horasMonitoramento;
    }
}
