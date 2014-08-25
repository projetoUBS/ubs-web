package  br.ubs.com.modelo;

import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQueries({
	@NamedQuery(name = "UBS.findByLocalidade", query = "SELECT u FROM UBS u WHERE u.localidade = :localidade ORDER BY u.nome") })
public class UBS {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	 
	@Column(nullable=false)
	private String localidade;
	 
	@Column(nullable=false)
	private String nome;
	 
	@Column(nullable=true)
	private String telefone;
	 
	@Column(nullable=false)
	private String responsavel;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false,name="DT_CADASTRO")
	private Calendar dtCadastro;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false, name="DT_ENCERRAMENTO")
	private Calendar dtEncerramento;
	
	@OneToMany (cascade = {CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "ubs")		
	private List <Agenda> agenda;
	 
	@ManyToMany(mappedBy="ubs") 
	private List <Funcionario> funcionario;

	@OneToMany(mappedBy = "ubs")	
	private List <Estoque> estoque;

	
	//Getters e Setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public Calendar getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(Calendar dtCadastro) {
		this.dtCadastro = dtCadastro;
	}

	public Calendar getDtEncerramento() {
		return dtEncerramento;
	}

	public void setDtEncerramento(Calendar dtEncerramento) {
		this.dtEncerramento = dtEncerramento;
	}

	public List<Agenda> getAgenda() {
		return agenda;
	}

	public void setAgenda(List<Agenda> agenda) {
		this.agenda = agenda;
	}

	public List<Funcionario> getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(List<Funcionario> funcionario) {
		this.funcionario = funcionario;
	}

	public List<Estoque> getEstoque() {
		return estoque;
	}

	public void setEstoque(List<Estoque> estoque) {
		this.estoque = estoque;
	}
	 
}
 
