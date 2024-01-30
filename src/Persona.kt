/**
 * Clase persona
 * @param peso :Double peso de la persona
 * @param altura :Double altura de la persona
 */
class Persona(peso: Double, altura: Double) {

    var peso = peso
        set(value) {
            require(value > 0) { "El peso no puede ser negativo" }
            field = value
        }
    var altura: Double = altura

    var nombre:String? = "persona"
        set(value) {
            require(!value.isNullOrBlank()) { "EL nombre no puede ser nulo ni vacío." }
            field = value
        }

    val imc: Double
        get() = peso / altura

    constructor(nombre:String, peso:Double, altura:Double) : this(peso, altura) {
        this.nombre = nombre
    }

    /**
     * Realiza la accion de saludar, y dice su nombre
     */
    fun saludar() {
        println("Hola buenas noches, mi nombre es ${this.nombre}")
    }

    /**
     * Devuelve true o false si supera la media de altura
     */
    fun alturaEncimaMedia() = if (this.altura >= 1.75) true else false

    /**
     * Devuelve true o false si supera la media de peso
     */
    fun pesoEncimaMedia() = if (this.peso >= 70) true else false


    /**
     * Compara si las dos personas son iguales o no
     */
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Persona) return false

        if (this.nombre != other.nombre) return false
        if (this.altura != other.altura) return false
        if (this.peso != other.peso) return false
        return true
    }

    /**
     * Muestra la informacion de la persona con su altura, su pero y su imc.
     */
    fun mostrarDesc() {
        println("${this.nombre} con una altura de ${this.altura}m (${comprobarMediaA()}) y un peso de ${this.peso}Kg (${comprobarMediaP()}) tiene un IMC de ${String.format("%.2f",this.imc)} (${obtenerImcDesc()})")
    }

    /**
     * Comprueba el peso de la persona y retorna un String con la frase correspondiente
     * @return String frase indicativa correspondiente a un imc o a otro.
     */
    private fun obtenerImcDesc() = when {
        this.imc < 18.5 -> "peso insuficiente"
        this.imc in 18.5..24.9 -> "peso saludable"
        this.imc in 25.0..29.9 -> "sobrepeso"
        else -> "obesidad"
    }

    /**
     * Comprueba si supera la altura media y devuelve si esta por encima de la media o no
     * @return String devuleve si esta por encima de la media o no.
     */
    fun comprobarMediaA() = if (alturaEncimaMedia()) "Por encima de la media" else "Por debajo de la media"

    /**
     * Comprueba si supera el peso medio y devuelve si esta por encima de la media o no
     * @return String devuleve si esta por encima de la media o no.
     */
    fun comprobarMediaP() = if (pesoEncimaMedia()) "Por encima de la media" else "Por debajo de la media"

}