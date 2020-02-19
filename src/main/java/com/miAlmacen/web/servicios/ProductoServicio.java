package com.miAlmacen.web.servicios;

import com.miAlmacen.web.entidades.Categoria;
import com.miAlmacen.web.entidades.Producto;
import com.miAlmacen.web.repositorios.CategoriaRepositorio;
import com.miAlmacen.web.repositorios.ProductoRepositorio;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author maxi
 */
@Service
public class ProductoServicio {
    @Autowired
    ProductoRepositorio productoRepositorio;
    @Autowired
    CategoriaRepositorio categoriaRepositorio;
    
    public String carga(String nombre, Double precio, Categoria categoria){
        //Se utilizó la clase Doble para verificar la nulidad a la hora de cargar el formulario.
        //Se utilizó el constructur para dar la vida inicial a un objeto en vez de los setters.
        //Y se utilizó una doble validación, el primero verifica la nulidad de los campos a ingresar en el formulario
        // y el segundo las condiciones extras para mayor orden.
        String mensajeError=datosOk(nombre, precio, categoria);
        if (mensajeError==null) {
            Producto producto=new Producto(nombre, precio, categoria);
            productoRepositorio.save(producto);           
        }
        return mensajeError;
    }
    
    
    public String modificar(String id, String nombre, Double precio, Categoria categoria){
        String mensajeError=datosOk(nombre, precio, categoria);
        if (mensajeError==null) {
            Optional <Producto> respuesta=productoRepositorio.findById(id);
            if (respuesta.isPresent()) {
                Producto producto=respuesta.get();
                producto.setNombreProducto(nombre);
                producto.setPrecioProducto(precio);
                producto.setCategoria(categoria);
                productoRepositorio.save(producto);
            }
        }
        return mensajeError;
    }
    
    public String eliminar(String id){
        Optional <Producto> respuesta=productoRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Producto producto=respuesta.get();
            productoRepositorio.delete(producto);
            return "El producto se ha eliminado correctamente";
        }
        return "No se ha encontrado el producto solicitado";
    }
    
    public String habilitar(String id){
        Optional <Producto> respuesta=productoRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Producto producto=respuesta.get();
            producto.setDisponibilidadProducto(true);
            productoRepositorio.save(producto);
            return "Se ha habilitado el producto";
        }
        return "No se ha encontrado el producto solicitado";
    }
    
    public String deshabilitar(String id){
         Optional <Producto> respuesta=productoRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Producto producto=respuesta.get();
            producto.setDisponibilidadProducto(false);
            productoRepositorio.save(producto);
            return "Se ha deshabilitado el producto";
        }
        return "No se ha encontrado el producto solicitado";
    }
    
    
    
    public String datosOk(String nombre, Double precio, Categoria categoria){
        String mensaje=datosNull(nombre, precio, categoria);
        if (mensaje==null) {
            if (precio<0) {
                return "El precio no puede ser un valor negativo";
            }

        }
        return null;
    }
    
    public String datosNull(String nombre, Double precio, Categoria categoria){
        if (nombre==null || nombre.isEmpty()) {
            return "El campo nombre no puede estar vacio";
        }
        if (precio==null) {
            return "El campo precio no puede estar vacio";
        }        
        if (categoria==null) {
            return "La categoria no se encontro";
        }
        return null;
    }
}