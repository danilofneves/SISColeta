package br.ufs.coleta.SISColeta.entities;

// Generated 25/01/2015 11:00:24 by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TbInstituicao generated by hbm2java
 */
@Entity
@Table(name = "tb_instituicao", schema = "public")
public class Instituicao implements GenericEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Municipio municipio;
	private String nome;
	private String endereco;
	private String bairro;
	private String cep;
	private Set<Destinatario> destinatarios = new HashSet<Destinatario>(0);

	public Instituicao() {
	}

	public Instituicao(int idtbInstituicao, Municipio municipio) {
		this.id = idtbInstituicao;
		this.municipio = municipio;
	}

	public Instituicao(int idtbInstituicao, Municipio municipio,
			String nome, String endereco, String bairro, String cep,
			Set<Destinatario> destinatarios) {
		this.id = idtbInstituicao;
		this.municipio = municipio;
		this.nome = nome;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cep = cep;
		this.destinatarios = destinatarios;
	}

	@Id
	@Column(name = "idtb_instituicao", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tb_municipio_id", nullable = false)
	public Municipio getTbMunicipio() {
		return this.municipio;
	}

	public void setTbMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	@Column(name = "nome", length = 85)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "endereco", length = 75)
	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Column(name = "bairro", length = 75)
	public String getBairro() {
		return this.bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	@Column(name = "cep", length = 20)
	public String getCep() {
		return this.cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tbInstituicao")
	public Set<Destinatario> getTbDestinatarios() {
		return this.destinatarios;
	}

	public void setTbDestinatarios(Set<Destinatario> destinatarios) {
		this.destinatarios = destinatarios;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Instituicao)) {
            return false;
        }
        Instituicao other = (Instituicao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
}
