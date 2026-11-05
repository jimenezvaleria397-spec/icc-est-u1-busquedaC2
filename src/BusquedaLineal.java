import java.util.List;

import models.Persona;

public class BusquedaLineal {
    private List<Persona> personas;

    public BusquedaLineal(List<Persona> personas) {
        this.personas = personas;
    }
    //Metodo para buscar una persona, por nombre 
    //  retorne la persona en cas de enconttar
    //  y si no , retorna null
    public Persona findByName(String name){
        for(int i = 0; i < personas.size(); i++){  //Complejidad O(n)
            if(personas.get(i).getName().equals(name)){
                return personas.get(i);
            }
        }
        return null;
    }
    //Metodo para buscar la posicion de una persona,
    //  retorne la posisicon de lapersona en cas de encontrar
    //  y si no , retorna -1
    public int findPosByName(String name){
        for(Persona persona : personas){  //Complejidad O(n)2 porque indexOf hace otro recorrido internamente
            if(persona.getName().equals(name)){
                return personas.indexOf(persona);
            }
        }
        return -1;
    }

}
