fun main() {
    var puntuacion = 0

    println("Bienvenido al Test de nuestro proyecto, DragonStats")
    println("En esta prueba, se evaluará tu conocimiento de nuestro proyecto.")
    println("Por favor, responde las siguientes preguntas con el número de opción de tu respuesta.")
    println("Muy bien, comencemos con la primera pregunta.")

    println("A. ¿Qué es DragonStats?")
    println("1) Un juego de rol")
    println("2) Una herramienta de control de partidos")
    println("3) Una plataforma de análisis de datos")
    println("4) Ninguna de las anteriores")
    val respuesta1 = readLine()
    when (respuesta1) {
        "1" -> println("Incorrecto. DragonStats no es un juego de rol.")
        "2" -> {
            println("Correcto. DragonStats es una herramienta de control de partidos.")
            puntuacion++
        }
        "3" -> println("Incorrecto. DragonStats no es una plataforma de análisis de datos.")
        "4" -> println("Incorrecto. DragonStats es una herramienta de control de partidos.")
        else -> println("Respuesta no válida. Por favor, elige una opción del 1 al 4.")
    }

    println("B. ¿Cuáles son los deportes que se pueden analizar con DragonStats?")
    println("1) Fútbol")
    println("2) Baloncesto")
    println("3) Voleibol")
    println("4) Todos los anteriores")
    val respuesta2 = readLine()
    when (respuesta2) {
        "1" -> {
            println("Correcto. El deporte principal que se puede analizar con DragonStats es el fútbol de momento.")
            puntuacion++
        }
        "2" -> println("Incorrecto. DragonStats no se utiliza para analizar baloncesto aún.")
        "3" -> println("Incorrecto. DragonStats no se utiliza para analizar voleibol aún.")
        "4" -> println("Incorrecto. DragonStats busca analizar los deportes practicados en la UVG, pero actualmente se centra en el fútbol.")
        else -> println("Respuesta no válida. Por favor, elige una opción del 1 al 4.")
    }

    println("C. ¿Qué lenguaje de programación se usará para el proyecto?")
    println("1) Java")
    println("2) JavaScript")
    println("3) Python")
    println("4) Kotlin")
    val respuesta3 = readLine()
    when (respuesta3) {
        "1" -> println("Incorrecto. DragonStats no se desarrollará en Java.")
        "2" -> println("Incorrecto. DragonStats no se desarrollará en JavaScript.")
        "3" -> println("Incorrecto. DragonStats no se desarrollará en Python.")
        "4" -> {
            println("Correcto. DragonStats se desarrollará en Kotlin.")
            puntuacion++
        }
        else -> println("Respuesta no válida. Por favor, elige una opción del 1 al 4.")
    }

    println("D. ¿Qué tipo de desarrollo tendrá DragonStats?")
    println("1) Desarrollo cross-platform")
    println("2) Desarrollo nativo para iOS")
    println("3) Desarrollo nativo para Android")
    println("4) Desarrollo web")
    val respuesta4 = readLine()
    when (respuesta4) {
        "1" -> println("Incorrecto. DragonStats no es un desarrollo cross-platform.")
        "2" -> println("Incorrecto. DragonStats no es un desarrollo nativo para iOS.")
        "3" -> {
            println("Correcto. DragonStats tendrá un desarrollo nativo para Android.")
            puntuacion++
        }
        "4" -> println("Incorrecto. DragonStats no es un desarrollo web.")
        else -> println("Respuesta no válida. Por favor, elige una opción del 1 al 4.")
    }

    println("E. ¿Qué funcionalidades tendrá DragonStats?")
    println("1) Clasificación de la liga")
    println("2) Estadísticas de jugadores")
    println("3) Estadísticas de partidos")
    println("4) Todos los anteriores")
    val respuesta5 = readLine()
    when (respuesta5) {
        "1" -> println("Incorrecto. Aunque cuenta con clasificación de liga se utiliza, no es la única funcionalidad.")
        "2" -> println("Incorrecto. Aunque cuenta con estadísticas de jugadores se utiliza, no es la única funcionalidad.")
        "3" -> println("Incorrecto. Aunque cuenta con estadísticas de partidos se utiliza, no es la única funcionalidad.")
        "4" -> {
            println("Correcto. DragonStats tiene todas estas funcionalidades.")
            puntuacion++
        }
        else -> println("Respuesta no válida. Por favor, elige una opción del 1 al 4.")
    }

    println("Gracias por participar en el Test de DragonStats.")
    println("Tu puntuación final es: $puntuacion de 5")
}