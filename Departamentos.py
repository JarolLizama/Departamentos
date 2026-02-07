# =========================================
# DATOS BASE
# =========================================

meses = [
    "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
    "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
]

departamentos = ["Ropa", "Deportes", "Juguetería"]

ventas = [[0 for _ in range(len(departamentos))] for _ in range(len(meses))]


# =========================================
# MÉTODO PARA MOSTRAR LA TABLA
# =========================================
def mostrar_tabla():
    print("\n=========== TABLA DE VENTAS ===========")
    encabezado = f"{'Mes':<12} | {'Ropa':<10} | {'Deportes':<10} | {'Juguetería':<12}"
    print(encabezado)
    print("-" * len(encabezado))

    for i, mes in enumerate(meses):
        print(f"{mes:<12} | {ventas[i][0]:<10} | {ventas[i][1]:<10} | {ventas[i][2]:<12}")
    print()


# =========================================
# 1️⃣ MÉTODO INSERTAR VENTA
# =========================================
def insertar_venta(mes, departamento, monto):
    if mes in meses and departamento in departamentos:
        fila = meses.index(mes)
        columna = departamentos.index(departamento)
        ventas[fila][columna] = monto
        print(f"✅ Venta insertada en {mes} para {departamento}: {monto}")
    else:
        print("❌ Mes o departamento inválido")


# =========================================
# 2️⃣ MÉTODO BUSCAR VENTA
# =========================================
def buscar_venta(mes, departamento):
    if mes in meses and departamento in departamentos:
        fila = meses.index(mes)
        columna = departamentos.index(departamento)
        print(f"🔍 Venta en {mes} para {departamento}: {ventas[fila][columna]}")
        return ventas[fila][columna]
    else:
        print("❌ Mes o departamento inválido")
        return None


# =========================================
# 3️⃣ MÉTODO ELIMINAR VENTA
# =========================================
def eliminar_venta(mes, departamento):
    if mes in meses and departamento in departamentos:
        fila = meses.index(mes)
        columna = departamentos.index(departamento)
        ventas[fila][columna] = 0
        print(f"🗑 Venta eliminada en {mes} para {departamento}")
    else:
        print("❌ Mes o departamento inválido")


# =========================================
# DEMOSTRACIÓN (como pide la tabla)
# =========================================
print("📊 ESTADO INICIAL DE LA TABLA")
mostrar_tabla()

insertar_venta("Enero", "Ropa", 15000)
insertar_venta("Marzo", "Deportes", 22000)
insertar_venta("Diciembre", "Juguetería", 30000)

print("\n📊 TABLA DESPUÉS DE INSERTAR")
mostrar_tabla()

buscar_venta("Marzo", "Deportes")

eliminar_venta("Marzo", "Deportes")

print("\n📊 TABLA DESPUÉS DE ELIMINAR")
mostrar_tabla()
