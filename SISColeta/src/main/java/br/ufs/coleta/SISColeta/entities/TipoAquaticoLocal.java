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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TbTipoAquaticoLocal generated by hbm2java
 */
@Entity
@Table(name = "tb_tipo_aquatico_local", schema = "public")
public class TipoAquaticoLocal implements GenericEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String descricao;
	private Set<Aquatico> aquaticos = new HashSet<Aquatico>(0);

	public TipoAquaticoLocal() {
	}

	public TipoAquaticoLocal(int idtbTipoAquaticoLocal) {
		this.id = idtbTipoAquaticoLocal;
	}

	public TipoAquaticoLocal(int idtbTipoAquaticoLocal, String descricao,
			Set<Aquatico> aquaticos) {
		this.id = idtbTipoAquaticoLocal;
		this.descricao = descricao;
		this.aquaticos = aquaticos;
	}

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@Column(name = "idtb_tipo_aquatico_local", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "descricao", length = 45)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tbTipoAquaticoLocal")
	public Set<Aquatico> getTbAquaticos() {
		return this.aquaticos;
	}

	public void setTbAquaticos(Set<Aquatico> aquaticos) {
		this.aquaticos = aquaticos;
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
        if (!(object instanceof TipoAquaticoLocal)) {
            return false;
        }
        TipoAquaticoLocal other = (TipoAquaticoLocal) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

}