/* Lo que nos quiere decir esta propiedad, es que las clases que heredan o implementan un comportamiento, podrían sustituirse
*  y la funcionalidad no deberia verse afectada
*  */

public class LiskovSustitucionMain {

    public static void main(String[] args) {

    }



    public static interface Ave{

        void volar();
        void cantar();

    }


    public class Colibri implements Ave{

        @Override
        public void volar() {
            System.out.println("Colibri volando");
        }

        @Override
        public void cantar() {
            System.out.println("Colibri colibri");
        }
    }

    //TODO: que pasa si creo una clase pinguino? si tiro una excepcion en volar? estaríamos rompiendo con la susticion.

}
