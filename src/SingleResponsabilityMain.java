/* Esta propiedad nos quiere decir que cada clase debe tener una responsabilidad unica y no excederse.
que pasa si nos excedemos? podemos aumentar el acoplamiento, que luego nos hace mas dificil solucionar problemas puntuales
*
 */
public class SingleResponsabilityMain {

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setApellido("gian");
        persona.setNombre("Lucas");

        persona.guardarPersonaEnDb(); //TODO: que no se esta cumpliendo? como lo solucionaríamos?
    }

    public static class Persona {

        String nombre;
        String apellido;
        Boolean esSQL;

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public Boolean getEsSQL() {
            return esSQL;
        }

        public void setEsSQL(Boolean esSQL) {
            this.esSQL = esSQL;
        }

        public void guardarPersonaEnDb() {
            if (esSQL) {
                System.out.println(String.format("guardando Persona en base relacional : nombre: %s, apellido: %s", nombre, apellido));
            } else {
                System.out.println(String.format("guardando Persona en otro tipo de repositorio: nombre: %s, apellido: %s", nombre, apellido));
            }
        }
    }
}
