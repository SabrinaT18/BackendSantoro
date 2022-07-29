
package com.portfolio.sabrinasantoro.Repo;

import com.portfolio.sabrinasantoro.Model.Encabezado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository 
public interface IEncabezadoRepo extends JpaRepository <Encabezado, Long> {
}
