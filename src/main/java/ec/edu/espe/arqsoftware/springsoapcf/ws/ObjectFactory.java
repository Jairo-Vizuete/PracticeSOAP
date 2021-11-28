//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.11.26 a las 10:02:56 PM COT 
//


package ec.edu.espe.arqsoftware.springsoapcf.ws;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ec.edu.espe.arqsoftware.springsoapcf.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ec.edu.espe.arqsoftware.springsoapcf.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObtenerProductoPorCodigoRequest }
     * 
     */
    public ObtenerProductoPorCodigoRequest createObtenerProductoPorCodigoRequest() {
        return new ObtenerProductoPorCodigoRequest();
    }

    /**
     * Create an instance of {@link ObtenerProductoPorCodigoResponse }
     * 
     */
    public ObtenerProductoPorCodigoResponse createObtenerProductoPorCodigoResponse() {
        return new ObtenerProductoPorCodigoResponse();
    }

    /**
     * Create an instance of {@link Producto }
     * 
     */
    public Producto createProducto() {
        return new Producto();
    }

    /**
     * Create an instance of {@link CrearProductoRequest }
     * 
     */
    public CrearProductoRequest createCrearProductoRequest() {
        return new CrearProductoRequest();
    }

    /**
     * Create an instance of {@link CrearProductoResponse }
     * 
     */
    public CrearProductoResponse createCrearProductoResponse() {
        return new CrearProductoResponse();
    }

}
