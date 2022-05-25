public class Main {
    public static void main(String[] args) {

     Persona persona= new Persona();
     persona.setEdad(30);
     persona.setNombre("Limbert");
     persona.setTelefono(78782351);

     System.out.println("El nombre de la persona es: "+persona.getNombre()+", su edad es: "+persona.getEdad()+" años y su número de teléfono es: "+persona.getTelefono());
    }
}
class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}