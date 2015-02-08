package br.ufs.coleta.SISColeta.entities;

// Generated 25/01/2015 11:00:24 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * TbEspecieImagem generated by hbm2java
 */
@Entity
@Table(name = "tb_especie_imagem", schema = "public")
public class EspecieImagem implements GenericEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Especie especie;
	private String imagem;

	public EspecieImagem() {
	}

	public EspecieImagem(int idtbEspecieImagem, Especie especie) {
		this.id= idtbEspecieImagem;
		this.especie = especie;
	}

	public EspecieImagem(int idtbEspecieImagem, Especie especie,
			String imagem) {
		this.id = idtbEspecieImagem;
		this.especie = especie;
		this.imagem = imagem;
	}

	@Id
	@Column(name = "idtb_especie_imagem", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tb_especie_id", nullable = false)
	public Especie getTbEspecie() {
		return this.especie;
	}

	public void setTbEspecie(Especie especie) {
		this.especie = especie;
	}

	@Column(name = "imagem")
	public String getImagem() {
		return this.imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
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
        if (!(object instanceof EspecieImagem)) {
            return false;
        }
        EspecieImagem other = (EspecieImagem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

}
