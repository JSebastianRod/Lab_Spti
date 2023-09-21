package edu.eci.cvds.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.eci.cvds.domain.Usuario;



@Repository
public interface UserRepository extends JpaRepository<Usuario, Long>{
    boolean existsById(String usuarioId);
    Usuario findById(String usuarioId);
	
}