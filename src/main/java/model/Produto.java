package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "T_DAI_PRODUTO")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_produto")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "id_usuario", nullable = false)
	private Usuario usuario;

	@Column(name = "nm_produto", nullable = false)
	private String nome;

	@Column(name = "ds_categoria", nullable = false)
	private String categoria;

	@Column(name = "dt_validade", nullable = false)
	private LocalDate validade;

	@Column(name = "ds_cheiro", nullable = false)
	private Integer cheiro;

	@Column(name = "ds_aparencia", nullable = false)
	private Integer aparencia;

	@Column(name = "ds_consistencia", nullable = false)
	private Integer consistencia;

	@Column(name = "ds_embalagem", nullable = false)
	private Integer embalagem;

	@Column(name = "ds_qualidade", nullable = false)
	private Integer qualidade;

	@Column(name = "ds_produto")
	private String descricao;
	

	public Produto() {
		super();
	}

	public Produto(Long id, Usuario usuario, String nome, String categoria, LocalDate validade, Integer cheiro,
			Integer aparencia, Integer consistencia, Integer embalagem, Integer qualidade, String descricao) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.nome = nome;
		this.categoria = categoria;
		this.validade = validade;
		this.cheiro = cheiro;
		this.aparencia = aparencia;
		this.consistencia = consistencia;
		this.embalagem = embalagem;
		this.qualidade = qualidade;
		this.descricao = descricao;
	}
	
	public Produto(Usuario usuario, String nome, String categoria, LocalDate validade, Integer cheiro,
			Integer aparencia, Integer consistencia, Integer embalagem, Integer qualidade, String descricao) {
		super();
		this.usuario = usuario;
		this.nome = nome;
		this.categoria = categoria;
		this.validade = validade;
		this.cheiro = cheiro;
		this.aparencia = aparencia;
		this.consistencia = consistencia;
		this.embalagem = embalagem;
		this.qualidade = qualidade;
		this.descricao = descricao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public LocalDate getValidade() {
		return validade;
	}

	public void setValidade(LocalDate validade) {
		this.validade = validade;
	}

	public Integer getCheiro() {
		return cheiro;
	}

	public void setCheiro(Integer cheiro) {
		this.cheiro = cheiro;
	}

	public Integer getAparencia() {
		return aparencia;
	}

	public void setAparencia(Integer aparencia) {
		this.aparencia = aparencia;
	}

	public Integer getConsistencia() {
		return consistencia;
	}

	public void setConsistencia(Integer consistencia) {
		this.consistencia = consistencia;
	}

	public Integer getEmbalagem() {
		return embalagem;
	}

	public void setEmbalagem(Integer embalagem) {
		this.embalagem = embalagem;
	}

	public Integer getQualidade() {
		return qualidade;
	}

	public void setQualidade(Integer qualidade) {
		this.qualidade = qualidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", usuario=" + usuario + ", nome=" + nome + ", categoria=" + categoria
				+ ", validade=" + validade + ", cheiro=" + cheiro + ", aparencia=" + aparencia + ", consistencia="
				+ consistencia + ", embalagem=" + embalagem + ", qualidade=" + qualidade + ", descricao=" + descricao
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aparencia == null) ? 0 : aparencia.hashCode());
		result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
		result = prime * result + ((cheiro == null) ? 0 : cheiro.hashCode());
		result = prime * result + ((consistencia == null) ? 0 : consistencia.hashCode());
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((embalagem == null) ? 0 : embalagem.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((qualidade == null) ? 0 : qualidade.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
		result = prime * result + ((validade == null) ? 0 : validade.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (aparencia == null) {
			if (other.aparencia != null)
				return false;
		} else if (!aparencia.equals(other.aparencia))
			return false;
		if (categoria == null) {
			if (other.categoria != null)
				return false;
		} else if (!categoria.equals(other.categoria))
			return false;
		if (cheiro == null) {
			if (other.cheiro != null)
				return false;
		} else if (!cheiro.equals(other.cheiro))
			return false;
		if (consistencia == null) {
			if (other.consistencia != null)
				return false;
		} else if (!consistencia.equals(other.consistencia))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (embalagem == null) {
			if (other.embalagem != null)
				return false;
		} else if (!embalagem.equals(other.embalagem))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (qualidade == null) {
			if (other.qualidade != null)
				return false;
		} else if (!qualidade.equals(other.qualidade))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		if (validade == null) {
			if (other.validade != null)
				return false;
		} else if (!validade.equals(other.validade))
			return false;
		return true;
	}

}