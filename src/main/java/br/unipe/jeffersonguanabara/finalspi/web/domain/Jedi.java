package br.unipe.jeffersonguanabara.finalspi.web.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Jedi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String classificacaoJedi;
    private String classeJedi;
    private String corDoSabre;
    private int idade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClassificacaoJedi() {
        return classificacaoJedi;
    }

    public void setClassificacaoJedi(String classificacaoJedi) {
        this.classificacaoJedi = classificacaoJedi;
    }

    public String getClasseJedi() {
        return classeJedi;
    }

    public void setClasseJedi(String classeJedi) {
        this.classeJedi = classeJedi;
    }

    public String getCorDoSabre() {
        return corDoSabre;
    }

    public void setCorDoSabre(String corDoSabre) {
        this.corDoSabre = corDoSabre;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
