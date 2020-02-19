

package com.miAlmacen.servicios;

import com.miAlmacen.repositorios.StockRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockServicio {
    
    @Autowired
    StockRepositorio stockRepositorio;
    
   
}
