/* Este principio lo que nos dice es que la clase debe estar
cerrada para modificar pero abierta extender*/

public class OpenCloseMain {

    public static void main(String[] args) {

    }

    public static class Documento{
        private static String contenido;
        private static Impresora impresora;

        public static void agregarContenido(String datos){ //aca vemos que tambien hay acoplamiento.
            contenido = datos;
        }

        public static void imprimir(){
            impresora = new Impresora();
            impresora.imprimir(contenido);
        }
    }


    public static class Impresora{
        public static void imprimir(String contenido){
            System.out.println("Impresora imprmiendo" + contenido);
        }

    }


    //COMO SE RESOLVERIA?

}
