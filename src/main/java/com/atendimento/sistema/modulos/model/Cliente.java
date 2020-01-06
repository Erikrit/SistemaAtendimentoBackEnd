package com.atendimento.sistema.modulos.model;

import com.atendimento.sistema.modulos.Enum.EnumCidade;
import com.atendimento.sistema.modulos.Enum.EnumEstado;

import javax.persistence.*;

@Entity
@Table(name="cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String sobreNome;

    private String email;

    private String telefone;

    private String empresa;

    private EnumCidade enumCidade;

    private EnumEstado enumEstado;

    private String senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public EnumCidade getEnumCidade() {
        return enumCidade;
    }

    public void setEnumCidade(EnumCidade enumCidade) {
        this.enumCidade = enumCidade;
    }

    public EnumEstado getEnumEstado() {
        return enumEstado;
    }

    public void setEnumEstado(EnumEstado enumEstado) {
        this.enumEstado = enumEstado;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
