package br.com.meli.hospital.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.meli.hospital.model.Paciente;

public interface PacienteRepo extends JpaRepository<Paciente, Integer> {

}
