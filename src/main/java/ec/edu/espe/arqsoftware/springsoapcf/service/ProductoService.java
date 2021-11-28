package ec.edu.espe.arqsoftware.springsoapcf.service;

import ec.edu.espe.arqsoftware.springsoapcf.dao.ProductoRepository;
import ec.edu.espe.arqsoftware.springsoapcf.exception.CreateException;
import ec.edu.espe.arqsoftware.springsoapcf.ws.Producto;
import javassist.tools.reflect.CannotCreateException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Slf4j
public class ProductoService {
    private final ProductoRepository repo;

    public ProductoService(ProductoRepository repo) {
        this.repo = repo;
    }

    public Optional<Producto> obtenerPorCodigo(String codigo){
        return this.repo.findById(codigo);
    }

    @Transactional
    public Producto crearProducto(Producto producto){
        Optional<Producto> productoOpt = this.obtenerPorCodigo(producto.getCodigo());
        if(!productoOpt.isPresent()){
            return this.repo.save(producto);
        } else {
            StringBuilder sbMsg = new StringBuilder("THE PRODUCT WITH CODE: ");
            sbMsg.append(producto.getCodigo());
            sbMsg.append(" IS ALREADY IN THE DATABASE");
            throw new CreateException(sbMsg.toString());
        }
    }
}
