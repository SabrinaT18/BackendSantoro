
package com.portfolio.sabrinasantoro.Repo;

import com.portfolio.sabrinasantoro.Model.Acercade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAcercadeRepo extends JpaRepository <Acercade, Long>{  
    
} 

