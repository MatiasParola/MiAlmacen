

package com.miAlmacen.web.repositorios;

import com.miAlmacen.web.entidades.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepositorio extends JpaRepository<Categoria, String>{

}
