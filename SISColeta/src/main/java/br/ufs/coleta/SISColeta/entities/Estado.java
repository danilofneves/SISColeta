package br.ufs.coleta.SISColeta.entities;

// Generated 25/01/2015 11:00:24 by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TbEstado generated by hbm2java
 */
@Entity
@Table(name = "tb_estado", schema = "public")
public class Estado implements GenericEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nome;
	private String uf;
	private Set<Municipio> municipios = new HashSet<Municipio>(0);

	public Estado() {
	}

	public Estado(int idtbEstado) {
		this.id = idtbEstado;
	}

	public Estado(int idtbEstado, String nome, String uf,
			Set<Municipio> municipios) {
		this.id = idtbEstado;
		this.nome = nome;
		this.uf = uf;
		this.municipios = municipios;
	}

	@Id
	@Column(name = "idtb_estado", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "nome", length = 45)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "uf", length = 2)
	public String getUf() {
		return this.uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tbEstado")
	public Set<Municipio> getTbMunicipios() {
		return this.municipios;
	}

	public void setTbMunicipios(Set<Municipio> municipios) {
		this.municipios = municipios;
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
        if (!(object instanceof Estado)) {
            return false;
        }
        Estado other = (Estado) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

}
