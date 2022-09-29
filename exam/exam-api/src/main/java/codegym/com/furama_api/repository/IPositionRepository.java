package codegym.com.furama_api.repository;

import codegym.com.furama_api.model.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPositionRepository extends JpaRepository<Position, Integer> {
}
