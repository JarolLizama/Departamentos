class SistemaVentas {

    // =========================================
    // DATOS BASE
    // =========================================
    static String[] meses = {
        "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
        "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
    };

    static String[] departamentos = {"Ropa", "Deportes", "Jugueteria"};

    static int[][] ventas = new int[meses.length][departamentos.length];

    // =========================================
    // MÉTODO PARA MOSTRAR LA TABLA
    // =========================================
    public static void mostrarTabla() {
        System.out.println("\n=========== TABLA DE VENTAS ===========");
        System.out.println("Mes         | Ropa       | Deportes   | Jugueteria ");
        System.out.println("---------------------------------------------------");

        for (int i = 0; i < meses.length; i++) {
            System.out.println(
                meses[i] + " | " +
                ventas[i][0] + " | " +
                ventas[i][1] + " | " +
                ventas[i][2]
            );
        }
        System.out.println();
    }

    // =========================================
    // 1?? MÉTODO INSERTAR VENTA
    // =========================================
    public static void insertarVenta(String mes, String departamento, int monto) {
        int fila = obtenerIndice(meses, mes);
        int columna = obtenerIndice(departamentos, departamento);

        if (fila != -1 && columna != -1) {
            ventas[fila][columna] = monto;
            System.out.println("Venta insertada en " + mes + " para " + departamento + ": " + monto);
        } else {
            System.out.println("Mes o departamento invalido");
        }
    }

    // =========================================
    // 2?? MÉTODO BUSCAR VENTA
    // =========================================
    public static int buscarVenta(String mes, String departamento) {
        int fila = obtenerIndice(meses, mes);
        int columna = obtenerIndice(departamentos, departamento);

        if (fila != -1 && columna != -1) {
            System.out.println("Venta en " + mes + " para " + departamento + ": " + ventas[fila][columna]);
            return ventas[fila][columna];
        } else {
            System.out.println("Mes o departamento invalido");
            return -1;
        }
    }

    // =========================================
    // 3?? MÉTODO ELIMINAR VENTA
    // =========================================
    public static void eliminarVenta(String mes, String departamento) {
        int fila = obtenerIndice(meses, mes);
        int columna = obtenerIndice(departamentos, departamento);

        if (fila != -1 && columna != -1) {
            ventas[fila][columna] = 0;
            System.out.println("Venta eliminada en " + mes + " para " + departamento);
        } else {
            System.out.println("Mes o departamento invalido");
        }
    }

    // =========================================
    // MÉTODO AUXILIAR PARA BUSCAR ÍNDICES
    // =========================================
    public static int obtenerIndice(String[] arreglo, String valor) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i].equalsIgnoreCase(valor)) {
                return i;
            }
        }
        return -1;
    }

    // =========================================
    // MAIN (DEMOSTRACIÓN)
    // =========================================
    public static void main(String[] args) {

        System.out.println("ESTADO INICIAL DE LA TABLA");
        mostrarTabla();

        insertarVenta("Enero", "Ropa", 15000);
        insertarVenta("Marzo", "Deportes", 22000);
        insertarVenta("Diciembre", "Jugueteria", 30000);

        System.out.println("\nTABLA DESPUES DE INSERTAR");
        mostrarTabla();

        buscarVenta("Marzo", "Deportes");

        eliminarVenta("Marzo", "Deportes");

        System.out.println("\nTABLA DESPUES DE ELIMINAR");
        mostrarTabla();
    }
}
