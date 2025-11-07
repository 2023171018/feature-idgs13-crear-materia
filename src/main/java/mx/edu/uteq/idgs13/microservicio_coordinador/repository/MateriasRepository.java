package mx.edu.uteq.idgs13.microservicio_coordinador.repository;

import mx.edu.uteq.idgs13.microservicio_coordinador.entity.MateriasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MateriasRepository extends JpaRepository<MateriasEntity, Long> {
}