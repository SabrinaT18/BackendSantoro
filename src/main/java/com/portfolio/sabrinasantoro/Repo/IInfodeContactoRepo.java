
package com.portfolio.sabrinasantoro.Repo;

import com.portfolio.sabrinasantoro.Model.InformaciondeContacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface IInfodeContactoRepo extends JpaRepository <InformaciondeContacto, Long>{
    
    
    
}
