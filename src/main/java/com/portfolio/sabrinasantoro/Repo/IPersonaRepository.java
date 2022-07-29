
package com.portfolio.sabrinasantoro.Repo;

import com.portfolio.sabrinasantoro.Model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IPersonaRepository extends JpaRepository <Persona,Long> {

 }
