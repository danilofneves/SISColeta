package br.ufs.coleta.SISColeta.entities;

// Generated 02/01/2015 16:46:54 by Hibernate Tools 4.0.0

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
public class TbDestinatario implements GenericEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private TbInstituicao tbInstituicao;
	private String nome;
	private String departamento;
	private String centro;
	private Set<TbRetirada> tbRetiradas = new HashSet<TbRetirada>(0);

	public TbDestinatario() {
	}

	public TbDestinatario(int idtbDestinatario, TbInstituicao tbInstituicao) {
		this.id = idtbDestinatario;
		this.tbInstituicao = tbInstituicao;
	}

	public TbDestinatario(int idtbDestinatario, TbInstituicao tbInstituicao,
			String nome, String departamento, String centro,
			Set<TbRetirada> tbRetiradas) {
		this.id = idtbDestinatario;
		this.tbInstituicao = tbInstituicao;
		this.nome = nome;
		this.departamento = departamento;
		this.centro = centro;
		this.tbRetiradas = tbRetiradas;
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
	public TbInstituicao getTbInstituicao() {
		return this.tbInstituicao;
	}

	public void setTbInstituicao(TbInstituicao tbInstituicao) {
		this.tbInstituicao = tbInstituicao;
	}

	@Column(name = "nome", length = 45)
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
	public Set<TbRetirada> getTbRetiradas() {
		return this.tbRetiradas;
	}

	public void setTbRetiradas(Set<TbRetirada> tbRetiradas) {
		this.tbRetiradas = tbRetiradas;
	}

}