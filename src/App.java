import java.util.List;
import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        List<Persona> personas = List.of(
            new Persona("Juan", 25, "M"),
            new Persona("Maria", 30, "F"),
            new Persona("Pedro", 20, "M"),
            new Persona("Ana", 28, "F"));
            //Busque una persona con nomnbre Maria y reorne la persona
            //si lo encuentra.
            //2. Busque una pesona con nombre Diego y reorne la persona
            //3. Busque uan persona con nombren Ana y retorne la posicion de la persona
            BusquedaLineal busqueda = new BusquedaLineal(personas);
            Persona personaEncontrada = busqueda.findByName("Maria");
            if(personaEncontrada != null){
                System.out.println("Persona encontrada: " + personaEncontrada);
            }else{
                System.out.println("Persona no encontrada");

            }
            Persona personaEncontrada2 = busqueda.findByName("Diego");
            if(personaEncontrada2 != null){
                System.out.println("Persona encontrada: " + personaEncontrada2);
            }else{
                System.out.println("Persona no encontrada");
            }
            int posicion = busqueda.findPosByName("Ana");
            if(posicion != -1){
                System.out.println("Posicion de la persona: " + posicion);
            }else{
                System.out.println("Persona no encontrada");    
            }
            //Busqueda Binaria
            BusquedaBinaria busquedaB = new BusquedaBinaria(personas);
            System.out.println("===== busqueda Binaria =====");
            int resultado = busquedaB.findByName2("Ana");
            if (resultado == -1)
                System.out.println("Persona no Encotrada");
            else{
                System.out.println("La posicion de ana es " + resultado);
            }
            int res= busquedaB.findByName2("Pedro");
            //Operador Ternario
            System.out.println(res >= 0 ? "La posicion de ana es " + res: "No se encontro nada :( ");
            System.out.println(" === EDAD ENCONTRADA === ");
            //Buscar una persona con edad 25 y mostar en que posicion esta
            
            int res2= busquedaB.findByAge(25);
            if(res2 == -1){
                System.out.println("edad no Encontrada");
            }else {
                System.out.println("Se encontro una persona 25 en la pos " + res2 );
        }
    }
}
