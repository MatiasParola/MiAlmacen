

package com.miAlmacen.servicios;

import com.miAlmacen.repositorios.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServicio {

    @Autowired
    ProductoRepositorio productoRepositorio;
    
    
    public void cargaProducto (String nombre,Float precio){
        
        
    }
    
    
}
