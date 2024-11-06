package br.com.meli.hospital.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;



@Document(indexName = "idx_prontuario")
public class Prontuario {	
	@Id
	private Integer idPaciente;
	private String queixa;
	private String diagnostico;
	private String condutaMedica;
	private String prescricao;
	public Integer getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(Integer idPaciente) {
		this.idPaciente = idPaciente;
	}
	public String getQueixa() {
		return queixa;
	}
	public void setQueixa(String queixa) {
		this.queixa = queixa;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	public String getCondutaMedica() {
		return condutaMedica;
	}
	public void setCondutaMedica(String condutaMedica) {
		this.condutaMedica = condutaMedica;
	}
	public String getPrescricao() {
		return prescricao;
	}
	public void setPrescricao(String prescricao) {
		this.prescricao = prescricao;
	}
	
	
}
