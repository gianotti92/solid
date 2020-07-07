/* Esta propiedad propone colocar dentro de un objeto, algun otro que
 pueda cambiar su comportamiento, sin generar acoplamiento entre ellos


 la inyeccion de dependencia (como la de spring) es una implementacion de este principio

*/

public class DependencyInversionMain {

    public static void main(String[] args) {

    }

    public static class Auto{
        Motor motor;

        public Auto(){
            motor = new Motor(); //TODO: que vemos aca? acoplamiento, no se cumple open/close
        }

    }

    public static class Motor{

    }

    //COMO LO SOLUCIONARIAMOS?????
}
