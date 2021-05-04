public class PruebaLibroCalificaciones {
    public static void main(String[] args) {

        //Arreglo de calificaciones estudiantes
        int[] arregloCalif = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };

        LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones("CS101 Introducción a Java", arregloCalif);

        System.out.printf("Bienvenido al libro de calificaciones para %n%s%n%n" , miLibroCalificaciones.getNombreDelCurso());

        miLibroCalificaciones.procesarCalificaciones();
    }
}
