package br.ufs.coleta.SISColeta.entities;

// Generated 25/01/2015 11:00:24 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TbRetiradaColecaoId generated by hbm2java
 */
@Embeddable
public class RetiradaColecaoId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int tbColecaoId;
	private int tbRetiradaId;

	public RetiradaColecaoId() {
	}

	public RetiradaColecaoId(int tbColecaoId, int tbRetiradaId) {
		this.tbColecaoId = tbColecaoId;
		this.tbRetiradaId = tbRetiradaId;
	}

	@Column(name = "tb_colecao_id", nullable = false)
	public int getTbColecaoId() {
		return this.tbColecaoId;
	}

	public void setTbColecaoId(int tbColecaoId) {
		this.tbColecaoId = tbColecaoId;
	}

	@Column(name = "tb_retirada_id", nullable = false)
	public int getTbRetiradaId() {
		return this.tbRetiradaId;
	}

	public void setTbRetiradaId(int tbRetiradaId) {
		this.tbRetiradaId = tbRetiradaId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RetiradaColecaoId))
			return false;
		RetiradaColecaoId castOther = (RetiradaColecaoId) other;

		return (this.getTbColecaoId() == castOther.getTbColecaoId())
				&& (this.getTbRetiradaId() == castOther.getTbRetiradaId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getTbColecaoId();
		result = 37 * result + this.getTbRetiradaId();
		return result;
	}

}