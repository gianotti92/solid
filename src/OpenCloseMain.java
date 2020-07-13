/* Este principio lo que nos dice es que la clase debe estar
cerrada para modificar pero abierta extender*/

public class OpenCloseMain {

    public static void main(String[] args) {

    }

    public static class PersonaRepository{

        public void guardar(Persona persona){

            if(persona.getEsMysql()){
                System.out.println("Guardando en Mysq = nombre:" + persona.getNombre());
            }else{
                System.out.println("Guardando en H2 = nombre:" + persona.getNombre());
            }
            //TODO: y sigo agregando distintas formas de guardar.. (estoy modificando la clase Persona Repository)
        }
    }


    public static class Persona{

        String nombre;
        String apellido;
        Boolean esMysql;

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

        private Boolean getEsMysql() {
            return esMysql;
        }

        private void setEsMysql(Boolean esMysql) {
            this.esMysql = esMysql;
        }
    }


    //COMO SE RESOLVERIA?

}
