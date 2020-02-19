
package com.miAlmacen.web.repositorios;

import com.miAlmacen.web.entidades.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaRepositorio extends JpaRepository<Venta, String> {

}
