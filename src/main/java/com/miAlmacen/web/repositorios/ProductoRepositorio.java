

package com.miAlmacen.web.repositorios;

import com.miAlmacen.web.entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepositorio extends JpaRepository<Producto, String> {
    
    

}
