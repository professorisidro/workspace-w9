package br.com.meli.hospital.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_consulta")
public class Consulta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "numero_protocolo")
	private Integer numeroProtocolo;
	
	@Column(name = "data_consulta")
	private LocalDate data;
	
	@ManyToOne
	@JoinColumn(name = "tbl_paciente_id")
	private Paciente paciente;
	
	@ManyToOne
	@JoinColumn(name = "tbl_medico_id")
	private Medico medico;

	public Integer getNumeroProtocolo() {
		return numeroProtocolo;
	}

	public void setNumeroProtocolo(Integer numeroProtocolo) {
		this.numeroProtocolo = numeroProtocolo;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}
}
