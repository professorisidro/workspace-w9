package br.com.meli.hospital.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.meli.hospital.dto.ConsultasPorMesDTO;
import br.com.meli.hospital.model.Consulta;

public interface ConsultaRepo extends JpaRepository<Consulta, Integer>{
	

	@Query("SELECT "
			+ "new br.com.meli.hospital.dto.ConsultasPorMesDTO(month(c.data), count(c.numeroProtocolo)) "
			+ "FROM Consulta c "
			+ "WHERE year(c.data) = :ano "
			+ "GROUP BY month(c.data) ")
	public List<ConsultasPorMesDTO> recuperarConsultasPorMes(@Param("ano") Integer ano);
	
}
