
package com.portfolio.sabrinasantoro.Repo;

import com.portfolio.sabrinasantoro.Model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEduRepo extends JpaRepository <Educacion, Long>{
    
}
