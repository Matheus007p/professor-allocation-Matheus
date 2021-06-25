package com.project.professor.allocation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.professor.allocation.entity.Departament;

@Repository
public interface DepartamentRepository extends JpaRepository<Departament, Long> {

	// Buscar todos os departamentos que o nome contenha "mento"

		// SELECT * FROM Department WHERE name LIKE "% mento%"/

		// BD:
		// Departamento de Física
		// Departamento de Química
		// português

		// Resultado:
		// Departamento de Física
		// Departamento de Química
	
	List<Departament> findByNameContaining(String partName);
}