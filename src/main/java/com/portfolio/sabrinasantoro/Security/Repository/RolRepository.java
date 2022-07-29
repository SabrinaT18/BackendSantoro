
package com.portfolio.sabrinasantoro.Security.Repository;

import com.portfolio.sabrinasantoro.Security.Entity.Rol;
import com.portfolio.sabrinasantoro.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
