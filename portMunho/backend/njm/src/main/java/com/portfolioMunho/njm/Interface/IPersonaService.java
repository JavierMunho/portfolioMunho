
package com.portfolioMunho.njm.Interface;

import com.portfolioMunho.njm.Entity.Persona;
import java.util.List;


public interface IPersonaService {
   //buscar 
    public  List <Persona> getPersona();
    //guardar
    public void savePersona(Persona persona);
    //eliminar
    public void deletePersona(Long id);
    //buscar
    public Persona findPersona(Long id);
    
}
