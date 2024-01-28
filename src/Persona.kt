class Personas(val peso: Double, val altura: Double) {

    var nombre:String = ""

    var imc: Double
    init {
        this.imc = peso / (altura * altura)
    }

    constructor(nombre:String, peso:Double, altura:Double) : this(peso, altura) {
        this.nombre = nombre
    }


    fun saludar() {
        println("Hola buenas noches, mi nombre es ${this.nombre}")
    }

    private fun obtenerImc():Double {
        return this.peso / (this.altura * this.altura)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Personas) return false

        if (this.nombre != other.nombre) return false
        if (this.altura != other.altura) return false
        if (this.peso != other.peso) return false
        return true
    }

    fun mostrarDesc() {
        println("${this.nombre} con una altura de ${this.altura}m y un peso de ${this.peso}Kg tiene un IMC de ${String.format("%.2f",this.imc)} (${obtenerImcDesc()})")
    }

    private fun obtenerImcDesc() = when {
        this.imc < 18.5 -> "peso insuficiente"
        this.imc in 18.5..24.9 -> "peso saludable"
        this.imc in 25.0..29.9 -> "sobrepeso"
        else -> "obesidad"
    }
}