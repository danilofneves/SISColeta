package br.ufs.coleta.SISColeta.entities;

// Generated 25/01/2015 11:00:24 by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TbOrdem generated by hbm2java
 */
@Entity
@Table(name = "tb_ordem", schema = "public")
public class Ordem implements GenericEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Classe classe;
	private String descricao;
	private Set<Familia> familias = new HashSet<Familia>(0);

	public Ordem() {
	}

	public Ordem(int idtbOrdem, Classe classe) {
		this.id = idtbOrdem;
		this.classe = classe;
	}

	public Ordem(int idtbOrdem, Classe classe, String descricao,
			Set<Familia> familias) {
		this.id = idtbOrdem;
		this.classe = classe;
		this.descricao = descricao;
		this.familias = familias;
	}

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@Column(name = "idtb_ordem", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "tb_classe_id", nullable = false)
	public Classe getTbClasse() {
		return this.classe;
	}

	public void setTbClasse(Classe classe) {
		this.classe = classe;
	}

	@Column(name = "descricao", length = 75)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tbOrdem")
	public Set<Familia> getTbFamilias() {
		return this.familias;
	}

	public void setTbFamilias(Set<Familia> familias) {
		this.familias = familias;
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
        if (!(object instanceof Ordem)) {
            return false;
        }
        Ordem other = (Ordem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

}