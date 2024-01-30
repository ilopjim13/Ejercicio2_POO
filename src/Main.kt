fun main() {
    val persona1 = Persona(67.87, 1.78)
    val persona2 = Persona("Pepe",86.13, 1.98)
    val persona3 = Persona("Jose",5.0, 1.00)


    print("Persona1 introduzca su nombre: ")
    persona1.nombre = readln()


    val persona4 = Persona("Ruperto",57.87, 1.40)
    val persona5 = Persona("Antonio",66.13, 1.88)
    val persona6 = Persona("Joselito",5.0, 1.00)
    val persona7 = Persona("Manolo",77.88, 1.68)

    val listaPersonas = listOf(persona1, persona2, persona3, persona4, persona5, persona6,persona7)

    listaPersonas.forEach {
        it.saludar()
        it.mostrarDesc()
    }


}