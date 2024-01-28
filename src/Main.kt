fun main() {
    val persona1 = Personas(67.87, 1.78)
    val persona2 = Personas("Pepe",86.13, 1.98)
    val persona3 = Personas("Jose",5.0, 1.00)


    print("Persona1 introduzca su nombre: ")
    persona1.nombre = readln()


    val persona4 = Personas("Ruperto",57.87, 1.40)
    val persona5 = Personas("Antonio",66.13, 1.88)
    val persona6 = Personas("Joselito",5.0, 1.00)
    val persona7 = Personas("Manolo",77.88, 1.68)


    persona1.saludar()
    persona1.mostrarDesc()

    persona2.saludar()
    persona2.mostrarDesc()

    persona3.saludar()
    persona3.mostrarDesc()

    persona4.saludar()
    persona4.mostrarDesc()

    persona5.saludar()
    persona5.mostrarDesc()

    persona6.saludar()
    persona6.mostrarDesc()

    persona7.saludar()
    persona7.mostrarDesc()


}