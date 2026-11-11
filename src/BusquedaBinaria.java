import java.util.ArrayList;
import java.util.List;
import models.Persona;

public class BusquedaBinaria{

    private List<Persona> personas;
    
    public BusquedaBinaria(List<Persona> personas){
        this.personas= new ArrayList<>(personas);
    }
    public int findByName2(String name){
        //Debe estar primero ordenado por el nombre
        //Linea que ordena mi arreglo antes de la busqueda
        personas.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));

        int lo= 0;
        int hi = personas.size()-1;
        //Definir el buque con su condicion
        while(lo <= hi){
            //calcular mid
            int mid = (lo + hi) /2  ;
            //Pregundo si es el mid que estoy buscando
            if(personas.get(mid).getName().equals(name)){
                return mid;
            }
            //Actualizar limites
            //verificar si es mayor o menor y escoger un lado
            if(personas.get(mid).getName().compareTo(name) > 0){
                //Actualizo el limite XXXX (alto)
                lo=  mid +1;

            }else{ //Actualizo el limite YYYY (bajo)
                hi = mid -1;
            }
        }
        return -1;
    }
    public int findByAge(int age){
        int lo= 0;
        int hi = personas.size() -1;
        while(lo <= hi){
            int mid = (lo +hi) /2;
            if(personas.get(mid).getAge() == age)
                return mid;
            if(personas.get(mid).getAge()< age)
                lo = mid +1;
            else
                hi = mid -1;
        }
        return -1;
    }
    public int findByPerson(Persona p){
        

        return -1;
    }
}