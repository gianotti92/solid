/* Lo podemos definir como la dependencia que exite entre los objetos */
public class AcoplamientoMain {

    public static void main(String[] args) {

    }



    public static class Auto {
        Motor motor;

        private Auto() {
            this.motor = new Motor(); //<- aca vemos como la clase auto esta acoplada al motor. Si yo quiero cambiar
                                           // el motor del auto deberia modificar el constructor del auto. Estaría rompiendo open close.
                                            // podemos decir tambien que el auto no funciona sin este motor
        }
    }

    public static class Motor{


    }

}
