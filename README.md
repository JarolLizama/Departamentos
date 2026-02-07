Este programa consiste en un sistema básico de registro y control de ventas anuales para una tienda que tiene tres departamentos: Ropa, Deportes y Juguetería. Utiliza una matriz (lista bidimensional) para almacenar las ventas de cada departamento en cada mes del año.

Las filas de la matriz representan los meses (de enero a diciembre) y las columnas representan los departamentos. Cada valor guardado en la matriz corresponde al monto de ventas de un departamento en un mes específico.

Primero, el programa realiza una captura inicial de datos. Recorre todos los meses del año y, para cada mes, solicita al usuario que ingrese las ventas de los tres departamentos. Esos tres valores se guardan en una lista que representa una fila de la matriz, y esa fila se agrega a la lista principal llamada “ventas”. Al final, se obtiene una matriz de 12 filas (meses) por 3 columnas (departamentos).

Después de capturar los datos, el programa utiliza distintos métodos y operaciones para administrar la información.

El método mostrar_tabla() sirve para mostrar todas las ventas en forma de tabla. Primero imprime los encabezados (Mes, Ropa, Deportes y Juguetería). Luego recorre la lista de meses usando un índice y, para cada mes, muestra los valores almacenados en la matriz en las posiciones correspondientes. Este método se utiliza para ver el estado completo de las ventas, tanto al inicio como al final del programa.

El programa también permite modificar una venta. Para ello, el usuario introduce el número de mes (del 1 al 12) y el número de departamento (1 para Ropa, 2 para Deportes, 3 para Juguetería). El programa valida que esos números estén dentro de los rangos correctos y luego accede directamente a la posición correspondiente en la matriz para reemplazar el valor anterior por un nuevo monto ingresado por el usuario.

Otra parte del programa permite buscar las ventas de un mes en particular. El usuario escribe el nombre del mes, el programa lo busca dentro de la lista de meses y obtiene su posición. Con ese índice, accede a la fila correspondiente en la matriz y muestra las ventas de los tres departamentos para ese mes.

Además, existe el método eliminar_venta(), que permite “eliminar” una venta específica. El usuario indica el mes y el departamento, y si los datos son válidos, el programa no borra el registro como tal, sino que reemplaza el valor de esa venta por 0. De esta forma, se simula que la venta fue eliminada, pero la estructura de la matriz se mantiene intacta.
