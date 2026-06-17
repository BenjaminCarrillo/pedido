package ecomarket.pedido_ms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ecomarket.pedido_ms.model.Direccion;

@Repository
public interface DireccionRepository extends JpaRepository<Direccion, Long> {

}
