
package com.miAlmacen.web.repositorios;

import com.miAlmacen.web.entidades.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepositorio extends JpaRepository<Stock, String> {

   
}
