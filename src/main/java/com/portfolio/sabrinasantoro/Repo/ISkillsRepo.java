
package com.portfolio.sabrinasantoro.Repo;

import com.portfolio.sabrinasantoro.Model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface ISkillsRepo extends JpaRepository <Skills, Long>{
    
    
}
