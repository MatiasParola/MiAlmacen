
package com.miAlmacen.repositorios;

import com.miAlmacen.entidades.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepositorio extends JpaRepository<Stock, String> {

   
}
