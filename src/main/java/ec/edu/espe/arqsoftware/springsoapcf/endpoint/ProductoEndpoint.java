package ec.edu.espe.arqsoftware.springsoapcf.endpoint;

import ec.edu.espe.arqsoftware.springsoapcf.exception.CreateException;
import ec.edu.espe.arqsoftware.springsoapcf.service.ProductoService;
import ec.edu.espe.arqsoftware.springsoapcf.ws.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.Optional;

@Endpoint
@Slf4j
public class ProductoEndpoint {
    private static final String NAMESPACE_URI = "http://espe.edu.ec/arqsoftware/SpringSOAPCF/ws";
    private final ProductoService service;

    @Autowired
    public ProductoEndpoint(ProductoService service) {
        this.service = service;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "obtenerProductoPorCodigoRequest")
    @ResponsePayload
    public ObtenerProductoPorCodigoResponse obtenerProductoPorCodigo(@RequestPayload ObtenerProductoPorCodigoRequest request) throws RuntimeException{
        Optional<Producto> productoOpt = this.service.obtenerPorCodigo(request.getCodigo());
        if(productoOpt.isPresent()){
            ObtenerProductoPorCodigoResponse response = new ObtenerProductoPorCodigoResponse();
            response.setProducto(productoOpt.get());
            return response;
        } else {
            throw new RuntimeException();
        }
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "crearProductoRequest")
    @ResponsePayload
    public CrearProductoResponse crearProducto(@RequestPayload CrearProductoRequest request) throws CreateException {
        try {
            Producto productoTmp = this.service.crearProducto(request.getProducto());
            CrearProductoResponse response = new CrearProductoResponse();
            response.setProducto(productoTmp);
            return response;
        } catch (Exception ex){
            throw new CreateException("Error: "+ex.getMessage());
        }
    }
}