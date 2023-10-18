package M3ActNF1GalinsogaAdrian

import java.util.Scanner
import kotlin.math.sqrt

fun main() {
    val scanner = Scanner(System.`in`)
    var opcio: Int
    var costat: Double
    var costat2: Double
    var costat3: Double
    var ladosValidos = false


    do {
        println("Menú")
        println("1. Longitut triangle")
        println("2. Comprovar si es triangle rectangle")
        println("3. Classificar segons els seus costats")
        println("4. Calcular perimetre area")
        println("5. Sortir: ")
        println("Introdueix una opció: ")

        do {
            if (!scanner.hasNextInt()) {
                println("Introdueix una opció vàlida:")
                scanner.next()
            }
        } while (!scanner.hasNextInt())
        opcio = scanner.nextInt()
        when (opcio) {
            1 -> println("introdueix el costats del triangles")
            {
                println("costat 1")
                var esValid

                        : Boolean
                do {
                    esValid = scanner.hasNextDouble()
                    if (esValid) {
                        costat = scanner.nextDouble()
                        if (costat <= 0) esValid = false
                    } else scanner.next()

                    if (!esValid) {
                        println("Introdueix un número vàlid:")
                        println("Torna a provar")
                    }

                } while (!scanner.hasNextInt())
                costat = scanner.nextInt()

                do {
                    esValid = scanner.hasNextDouble()
                    if (esValid) {
                        costat2 = scanner.nextDouble()
                        if (costat2 <= 0) esValid = false
                    } else scanner.next()

                    if (!esValid) {
                        println("Introdueix un número vàlid:")
                        println("Torna a provar")
                    } while (!scanner.hasNextInt())
                        costat = scanner.nextInt()
                }

                do {
                    esValid = scanner.hasNextDouble()
                    if (esValid) {
                        costat3 = scanner.nextDouble()
                        if (costat3 <= 0) esValid = false
                    } else scanner.next()

                    if (!esValid) {
                        println("Introdueix un número vàlid:")
                        println("Torna a provar")
                    }

                } while (!scanner.hasNextInt())
                costat = scanner.nextInt()



                2 ->
                {
                    if (ladosValidos) {
                        {
                            var cateto1: Double
                            var cateto2: Double
                            var hipotenusa: Double

                            if (costat > costat2 && costat > costat3) {
                                hipotenusa = costat
                                cateto1 = costat2
                                cateto2 = costat3

                            } else if (costat > costat2 && costat > costat3) {
                                hipotenusa = costat2
                                cateto1 = costat
                                cateto2 = costat3
                            } else {
                                hipotenusa = costat3
                                cateto1 = costat
                                cateto2 = costat2
                            }
                            if (cateto1 * cateto1) +(cateto2 * cateto2) == hipotenusa * hipotenusa) {
                            println("Es triangle")
                            println("La $hipotenusa i els catets son $cateto1 i $cateto2")
                        }
                            else ("No es triangle rectangle")
                        }

                    } else println("No es triangle")

                }

            }

            3 -> {
                if (costat == costat2 && costat2 == costat3) {
                    println("Es triangle")
                } else if (costat == costat2 || costat2 == costat3 || costat == costat3) {
                    println("Es isosceles")
                } else {
                    println("Es escaleno")
                }

            }

            4 -> {
                if (ladosValidos) {
                    var perimetre = costat + costat2 + costat3
                    var semiperimetre = perimetre / 2
                    var area =
                        sqrt(semiperimetre * (semiperimetre - costat) * (semiperimetre - costat2) * (semiperimetre - costat3))
                    println("El area es $area i el perimetre es $perimetre")

                } else {
                    println("No es triangle valid")
                }

                5 -> {
                    println("Adeu")
                }

                else -> println("Opció incorrecta")
            }
        }

    }