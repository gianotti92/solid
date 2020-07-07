/* Esta propiedad nos dice que si tenemos un interfaz con muchos comportamiento, deberiamos divirla en interfaces con
* con comportamientos mas específicos
*
*
* mediante esta propiedad, fomentamos single responsabiliti, aumentamos la cohesion, podriamos hacer que se cumpla liskov
* */
public class InterfaceSegregationMain {

    public static void main(String[] args) {

    }

      public interface Imprimible{

        void imprimir();
        void scannear();
        void fotocopiar();
        void encenderWifi();
    }


    public static class ImpresoraComun implements Imprimible{

        @Override
        public void imprimir() {

        }

        @Override
        public void scannear() {
            throw new RuntimeException(); //TODO: que no estamos cumpliendo aca?
        }

        @Override
        public void fotocopiar() {

        }

        @Override
        public void encenderWifi() {

        }
    }

    public static class ImpresoraMultifuncion implements Imprimible{

        @Override
        public void imprimir() {

        }

        @Override
        public void scannear() {

        }

        @Override
        public void fotocopiar() {

        }

        @Override
        public void encenderWifi() {

        }
    }

    //TODO: como lo deberiamos solucionar?


}
