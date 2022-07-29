
package com.portfolio.sabrinasantoro.service;

import com.portfolio.sabrinasantoro.Repo.ISkillsRepo;
import com.portfolio.sabrinasantoro.Model.Skills;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ImpSkillsService implements ISkills_Service {

  public ISkillsRepo ISkillsRepo;
  
    @Override
    public List<Skills> getSkills() {
         List<Skills> skills = ISkillsRepo.findAll();
    return skills;
    }

    @Override
    public void saveSkills(Skills Skills) {
     ISkillsRepo.save(Skills);
    }

    @Override
    public void deleteSkills(Long id) {
    ISkillsRepo.deleteById(id); 
        
    }

    @Override
    public Skills findSkills(Long id) {
    return ISkillsRepo.findById(id).orElse(null);
    }
 
    
}
