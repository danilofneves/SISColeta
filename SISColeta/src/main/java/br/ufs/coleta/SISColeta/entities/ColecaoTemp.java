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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * TbColecao generated by hbm2java
 */
@Entity
@Table(name = "temp_tb_colecao", schema = "public")
@NamedQueries({
	@NamedQuery(name="ColecaoTemp.findByColeta", query="SELECT c FROM ColecaoTemp c WHERE c.tbColeta.id = :idcoleta")
})
public class ColecaoTemp implements GenericEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private ColetaTemp coleta;
	private Especie especie;
	private Usuario usuario;
	private Usuario determinador;
	private Integer quantidade;
	private String observacao;

	public ColecaoTemp() {
	}

	public ColecaoTemp(Integer idtbColecao, ColetaTemp coleta, Especie especie,
			Usuario usuario) {
		this.id = idtbColecao;
		this.coleta = coleta;
		this.especie = especie;
		this.usuario = usuario;
	}

	public ColecaoTemp(Integer idtbColecao, ColetaTemp coleta, Especie especie,
			Usuario usuario, Integer quantidade) {
		this.id = idtbColecao;
		this.coleta = coleta;
		this.especie = especie;
		this.usuario = usuario;
		this.quantidade = quantidade;
	}

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@Column(name = "idtemp_colecao", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "temp_tb_coleta_id", nullable = false)
	public ColetaTemp getTbColeta() {
		return this.coleta;
	}

	public void setTbColeta(ColetaTemp coleta) {
		this.coleta = coleta;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "tb_especie_id", nullable = false)
	@NotNull(message = "Campo não pode ser vázio!")
	public Especie getTbEspecie() {
		return this.especie;
	}

	public void setTbEspecie(Especie especie) {
		this.especie = especie;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tb_usuario_id", nullable = false)
	public Usuario getTbUsuario() {
		return this.usuario;
	}

	public void setTbUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_determinador", nullable = false)
	public Usuario getDeterminador() {
		return this.determinador;
	}

	public void setDeterminador(Usuario determinador) {
		this.determinador = determinador;
	}

	@Column(name = "quantidade")
	@NotNull(message = "Campo não pode ser vázio!")
	public Integer getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}	

	@Column(name = "observacao", length = 20)
	@NotNull(message = "Campo não pode ser vázio!")
	@NotEmpty(message = "Campo não pode ser vázio!")
	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
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
        if (!(object instanceof ColecaoTemp)) {
            return false;
        }
        ColecaoTemp other = (ColecaoTemp) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

}
