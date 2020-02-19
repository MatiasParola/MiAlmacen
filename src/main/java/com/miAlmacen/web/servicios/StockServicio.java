

package com.miAlmacen.web.servicios;

import com.miAlmacen.web.repositorios.StockRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockServicio {
    
    @Autowired
    StockRepositorio stockRepositorio;
    
   
}
