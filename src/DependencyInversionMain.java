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
            motor = new Motor(); //TODO: que vemos aca? acoplamiento entre auto y motor.
        }

        public void acelerar(){
            this.motor.acelerar();
        }

    }

    public static class Motor{

        private void acelerar() {
            System.out.println("motor acelerando");
        }
    }

    //COMO LO SOLUCIONARIAMOS?????
}
