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
 * TbDestinatario generated by hbm2java
 */
@Entity
@Table(name = "tb_destinatario", schema = "public")
public class Destinatario implements GenericEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Instituicao instituicao;
	private String nome;
	private String departamento;
	private String centro;
	private Set<Retirada> retiradas = new HashSet<Retirada>(0);

	public Destinatario() {
	}

	public Destinatario(int idtbDestinatario, Instituicao instituicao) {
		this.id = idtbDestinatario;
		this.instituicao = instituicao;
	}

	public Destinatario(int idtbDestinatario, Instituicao instituicao,
			String nome, String departamento, String centro,
			Set<Retirada> retiradas) {
		this.id = idtbDestinatario;
		this.instituicao = instituicao;
		this.nome = nome;
		this.departamento = departamento;
		this.centro = centro;
		this.retiradas = retiradas;
	}

	@Id
	@Column(name = "idtb_destinatario", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tb_instituicao_id", nullable = false)
	public Instituicao getTbInstituicao() {
		return this.instituicao;
	}

	public void setTbInstituicao(Instituicao instituicao) {
		this.instituicao = instituicao;
	}

	@Column(name = "nome", length = 95)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "departamento", length = 45)
	public String getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Column(name = "centro", length = 45)
	public String getCentro() {
		return this.centro;
	}

	public void setCentro(String centro) {
		this.centro = centro;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tbDestinatario")
	public Set<Retirada> getTbRetiradas() {
		return this.retiradas;
	}

	public void setTbRetiradas(Set<Retirada> retiradas) {
		this.retiradas = retiradas;
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
        if (!(object instanceof Destinatario)) {
            return false;
        }
        Destinatario other = (Destinatario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

}
