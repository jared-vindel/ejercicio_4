package unah.edu.ejercicio_4.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import unah.edu.ejercicio_4.Entities.Abonado;

@Repository
public interface AbonadoRepository extends JpaRepository<Abonado, String> {

}
