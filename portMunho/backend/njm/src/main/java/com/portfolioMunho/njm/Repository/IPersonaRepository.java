
package com.portfolioMunho.njm.Repository;

import com.portfolioMunho.njm.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface IPersonaRepository extends JpaRepository<Persona,Long> {
    
}
