package org.example;

public class Aluno {

    private String ra;
    private String nome;
    private String curso;
    private String disciplina;
    private Double mediaFinal;
    private Integer qtdFaltas;

    public Aluno(String ra, String nome, String curso, String disciplina, Double mediaFinal, Integer qtdFaltas) {
        this.ra = ra;
        this.nome = nome;
        this.curso = curso;
        this.disciplina = disciplina;
        this.mediaFinal = mediaFinal;
        this.qtdFaltas = qtdFaltas;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Double getMediaFinal() {
        return mediaFinal;
    }

    public void setMediaFinal(Double mediaFinal) {
        this.mediaFinal = mediaFinal;
    }

    public Integer getQtdFaltas() {
        return qtdFaltas;
    }

    public void setQtdFaltas(Integer qtdFaltas) {
        this.qtdFaltas = qtdFaltas;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "ra='" + ra + '\'' +
                ", nome='" + nome + '\'' +
                ", curso='" + curso + '\'' +
                ", disciplina='" + disciplina + '\'' +
                ", mediaFinal=" + mediaFinal +
                ", qtdFaltas=" + qtdFaltas +
                '}';
    }
}
