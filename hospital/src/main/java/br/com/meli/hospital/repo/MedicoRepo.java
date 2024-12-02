package br.com.meli.hospital.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.meli.hospital.model.Medico;

public interface MedicoRepo extends JpaRepository<Medico, Integer>{
	public List<Medico> findByNomeContaining(String nome);
	public Medico findByCrm(Integer crm);

}
