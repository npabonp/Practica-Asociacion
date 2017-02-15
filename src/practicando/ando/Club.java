
package practicando.ando;

public class Club {
    private String nombre;
    public Persona gerente;
                
    public Club(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
    public void imprimirGerente(){
        System.out.println("El gerente se llama "+this.gerente.getNombre());
        System.out.println("El gerente tiene "+this.gerente.getEdad()+" años");
    }
    
}
