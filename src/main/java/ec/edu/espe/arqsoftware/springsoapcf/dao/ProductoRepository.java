package ec.edu.espe.arqsoftware.springsoapcf.dao;

import ec.edu.espe.arqsoftware.springsoapcf.ws.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, String> {
}
