package com.portfolio.sabrinasantoro.Security.service;

import com.portfolio.sabrinasantoro.Security.Entity.Rol;
import com.portfolio.sabrinasantoro.Security.Enums.RolNombre;
import com.portfolio.sabrinasantoro.Security.Repository.RolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {

    @Autowired
    RolRepository rolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre) {
        return rolRepository.findByRolNombre(rolNombre);
    }

    public void save(Rol rol) {
        rolRepository.save(rol);
    }

}
