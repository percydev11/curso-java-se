public class LibroCalificaciones {

    private String nombreDelCurso;
    private int[] calificaciones;

    public LibroCalificaciones(String nombreDelCurso, int[] calificaciones) {
        this.nombreDelCurso = nombreDelCurso;
        this.calificaciones = calificaciones;
    }


    public void setNombreDelCurso(String nombreDelCurso) {
        this.nombreDelCurso = nombreDelCurso;

    }

    public String getNombreDelCurso() {
        return nombreDelCurso;
    }

    //Realiza varias operaciones sobre los datos
    public void procesarCalificaciones() {

        imprimirCalificaciones();

        System.out.printf("\nEl promedio de la clase es %.2f%n", obtenerPromedio());

        System.out.printf("La calificación más baja es %d%nLa calificación más alta es %d%n%n", obtenerMinima(), obtenerMaxima());

        imprimirGraficoBarras();

    }

    //Imprime el contenido del arreglo de calificaciones
    private void imprimirCalificaciones() {

        System.out.println("Las calificaciones son:");

        //Imprime la calificación de cada estudiante
        for (int estudiante = 0; estudiante < calificaciones.length; estudiante++) {
            System.out.printf("Estudiante %2d: %3d%n", estudiante + 1, calificaciones[estudiante]);

        }
    }

    //Imprime gráfico de barras que muestra la distribucion de las calificaciones
    public void imprimirGraficoBarras() {
        System.out.println("Distribución de calificaciones:");

        int[] frecuencia = new int[11];

        for (int calificacion : calificaciones)
            ++frecuencia[calificacion / 10];

        for (int i = 0; i < frecuencia.length; i++) {

            if (i == 10)
                System.out.printf("%5d: ", 100);
            else
                System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);

            for (int j = 0; j < frecuencia[i]; j++)
                System.out.println("*");

            System.out.println();

        }
    }

    //Determina la califación promedio de la prueba
    private double obtenerPromedio() {
        int total = 0;

        for (int calificacion : calificaciones) {
            total += calificacion;

        }

        return (double) total / calificaciones.length;
    }

    //Bucas las calificacióm más alta
    private int obtenerMaxima() {

        int califAlta = calificaciones[0];

        for (int calificacion : calificaciones) {

            if (calificacion > califAlta)
                califAlta = calificacion;

        }
        return califAlta;
    }

    //Busca la calificación más baja
    private int obtenerMinima() {

        //Asume que calificaciones[0] es la más baja
        int califBaja = calificaciones[0];

        for (int calificacion : calificaciones) {

            if (calificacion < califBaja)
                califBaja = calificacion;

        }
        return califBaja;
    }

}
