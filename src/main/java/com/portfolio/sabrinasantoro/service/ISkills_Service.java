
package com.portfolio.sabrinasantoro.service;

import com.portfolio.sabrinasantoro.Model.Skills;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface ISkills_Service {
  
    public List <Skills> getSkills ();
    
    public void saveSkills (Skills Skills);
    
    public void deleteSkills (Long idS);
            
    public Skills editSkills(Skills Skills);

}
