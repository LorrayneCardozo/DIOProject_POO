package desafio.bootcamp;

import java.util.LinkedHashSet;
import java.util.Set;

public class Forum {
    private String assunto;
    private String tecnologia;
    private String descricao;
    private Set<String> comentarios = new LinkedHashSet<>();

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<String> getComentarios() {
        return comentarios;
    }

    public void setComentarios(Set<String> comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "Forum{" +
                "assunto='" + assunto + '\'' +
                ", tecnologia='" + tecnologia + '\'' +
                ", descricao='" + descricao + '\'' +
                ", comentarios=" + comentarios +
                '}';
    }
}
