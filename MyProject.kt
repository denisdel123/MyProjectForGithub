package MyProjectForGithub

import java.util.*
import kotlin.math.round

fun main() {
    val input = Scanner(System.`in`)
    print("Enter your name: ")
    val name = input.next()
    println("Hello $name")
    val i = 1
    while (i == 1) {
        val info = "1 - математические работы\n2 - регистрация\n3 - работа с фибоначчи\n4 - работа с массивами\n0 - закончить работу"
        print("$info\nEnter a number: ")
        val number = input.nextInt()

        if (number == 1) {
                val info1 =
                    "1 - digit output\n2 - calculator\n3 - comparison Of numbers\n4 - bank interest\n5 - currency exchange\n" +
                            "6 - counting seconds\n7 - population count\n8 - population count method2\n9 - contribution\n10 - cash settlement\n" +
                            "11 - table method2\n12 - infinite multiplication\n13 - tetration of numbers\n14 - pyramid\n0 - Exit"
                print("$info1\nвведите № математической работы: ")
                val number1 = input.nextInt()
                if (number1 == 1) {
                    digit_output()
                } else if (number1 == 2) {
                    calculator()
                } else if (number1 == 3) {
                    comparison_Of_numbers()
                } else if (number1 == 4) {
                    bank_interest()
                } else if (number1 == 5) {
                    currency_exchange()
                } else if (number1 == 6) {
                    counting_seconds()
                } else if (number1 == 7) {
                    population_count()
                } else if (number1 == 8) {
                    population_count_method2()
                } else if (number1 == 9) {
                    contribution()
                } else if (number1 == 10) {
                    cash_settlement()
                } else if (number1 == 11) {
                    table_method2()
                } else if (number1 == 12) {
                    infinite_multiplication()
                } else if (number1 == 13) {
                    tetration_of_numbers()
                } else if (number1 == 14) {
                    pyramid()
                } else if (number == 0) {
                    println("Goodbye $name")
                    break
                }
                else {
                    println("no such function")
                }
        }

        if (number == 2){
            val info2 = "1 - User registrion\n0 - Exit"
            print("$info2\nвведите № для работы с регистрацией: ")
            val number2 = input.nextInt()
             if (number2 == 1) {
                User_registrion()
            }
             else {
                 println("no such function")
             }
        }


        if (number == 3){
            val info3 = "1 - fibonacci\n2 - array Fibonacci\n0 - Exit"
            print("$info3\nвведите № для работы с фибоначчи: ")
            val number3 = input.nextInt()
             if (number3 == 1) {
                fibonacci()
            }
             else if (number3 == 2) {
                 array_Fibonacci()
             }
             else {
                 println("no such function")
             }
        }


        if (number == 4){
            val info4 = "1 - even numbers output\n2 - comparison of array\n3 - array Fibonacci\n4 - conditionally displaying elements\n" +
                    "5 - displaying common items\n6 - display max and min value\n7 - palindrome check\n8 - union of array\n9 - output numbers\n" +
                    "10 - comparing and displaying items\n11 - revealing the number\n0 - Exit"
            print("$info4\nвведите № для работы с массивами: ")
            val number4 = input.nextInt()
             if (number4 == 1) {
                even_numbers_output()
            }
            else if (number4 == 2) {
                comparison_of_array()
            }
            else if (number4 == 3) {
                array_Fibonacci()
            }
            else if (number4 == 4) {
                conditionally_displaying_elements()
            }
            else if (number4 == 5) {
                displaying_common_items()
            }
            else if (number4 == 6) {
                display_max_and_min_value()
            }
            else if (number4 == 7) {
                palindrome_check()
            }
            else if (number4 == 8) {
                union_of_array()
            }
            else if (number4 == 9) {
                output_numbers()
            }
            else if (number4 == 10) {
                comparing_and_displaying_items()
            }
            else if (number4 == 11) {
                revealing_the_number()
            }
             else {
                 println("no such function")
             }
        }


        else if (number == 0) {
            println("Goodbye $name")
            break
        }
        else {
            println("no such function")
        }


    }
}
fun digit_output() {
    val i = 1
    while (i == 1) {
        val work1 = Scanner(System.`in`)
        println("1 - Start 0 - Exit")
        val result = work1.nextInt()
        if (result == 1) {
            val number: Byte = 20
            val number1: Short = 30000
            val number2: Int = -2000000000
            val number3: Long = 9000000000000000000
            val number4: Float = 98.55F
            val number5: Double = 1000.250
            val number6 = true
            val number7 = false
            val number8: Char = 'A'
            val number9: String = "Hello Denis" // это номер 9 приветствие
            println("$number $number1 $number2 $number3 $number4 $number5 $number6 $number7 $number8 $number9")
        }
        else if (result == 0) {
            break
        }
    }
}
fun User_registrion(){
    val i = 1
    while (i == 1) {
        val work2 = Scanner(System.`in`)
        println("1- Start 0 - Exit")
        val result = work2.nextInt()
        if (result == 1) {
            print("input your name: ")
            val name = readLine()
            print("input your surname: ")
            val surname = readLine()
            print("input your patronymic: ")
            val patronymic = readLine()
            print("input your age: ")
            val age = readLine()
            print("input your mail: ")
            val mail = readLine()
            println("name: $name surname: $surname patronymic: $patronymic age: $age mail: $mail")
        }
        else if (result == 0){
            break
        }
    }
}
fun calculator(){
    val number = Scanner(System.`in`)
    val i = 1
    while (i == 1) {
        println("1 - Start 0 - Exit")
        val exit = number.nextInt()
        if (exit == 1) {
            print("input first number: ")
            val number1 = number.nextInt()
            print("input second number: ")
            val number2 = number.nextInt()
            print("input arithmetic operation: ")
            val arithmetic = number.next()
            if (arithmetic == "-") {
                val result = number1 - number2
                println("result: $result")
            } else if (arithmetic == "+") {
                val result = number1 + number2
                println("result: $result")
            } else if (arithmetic == "*") {
                val result = number1 * number2
                println("result: $result")
            } else if (arithmetic == "/") {
                val result = number1 / number2
                println("result: $result")
            } else if (arithmetic == "%") {
                val result = number1 % number2
                println("result: $result")
            }
        } else if (exit == 0) {
            break
        }
    }
}
fun comparison_Of_numbers(){
    val i =1
    while (i == 1) {
        val number = Scanner(System.`in`)
        println("1 - Start 0 - Exit")
        val result = number.nextInt()
        if (result == 1) {
            print("input first number: ")
            val number1 = number.nextInt()
            print("input second number: ")
            val number2 = number.nextInt()
            if (number1 == number2) {
                println("=")
            } else if (number1 <= number2) {
                println("<")
            } else if (number1 >= number2) {
                println(">")
            } else {
                println("no number")
            }
        }
        else if (result == 0){
            break
        }
    }
}
fun bank_interest(){
    val i = 1
    while (i == 1) {
        val bank = Scanner(System.`in`)
        println("1 - Start 0 - Exit")
        val result1 = bank.nextInt()
        if (result1 == 1) {
            print("введите сумму зачисления: ")
            var number1 = bank.nextDouble()
            if (number1 <= 100) {
                val result = round(number1 * 0.05)
                number1 += result
                println("result: $number1")
            } else if (number1 >= 101 && number1 <= 200) {
                val result = round(number1 * 0.07)
                number1 += result
                println("result: $number1")
            } else if (number1 >= 201) {
                val result = round(number1 * 0.10)
                number1 += result
                println("result: $number1")
            }
        }
        else if (result1 == 0){
            break
        }
    }
}
fun currency_exchange(){
    val i = 1
    while (i == 1) {
        val exchanger = Scanner(System.`in`)
        println("1 - Start 0 - Exit")
        val work = exchanger.nextInt()
        if (work == 1) {
            print("введите сумму перевода рублей: ")
            val number = exchanger.nextInt()
            print("введите код валюты: ")
            val number1 = exchanger.nextInt()
            if (number1 == 400) {
                val result = number / 75
                val result1 = result % 10
                if (result >= 11 && result <= 14) {
                    println("$result долларов")
                } else if (result1 == 1) {
                    println("$result доллар")
                } else if (result1 >= 2 && result1 <= 4) {
                    println("$result доллара")
                } else if (result1 >= 5 && result1 <= 9 || result1 == 0) {
                    println("$result доларов")
                }
            } else if (number1 == 401) {
                val result = number / 81
                println("$result евро")
            } else if (number1 == 402) {
                val result = number / 97
                val result1 = result % 10
                if (result >= 11 && result <= 14) {
                    println("$result стерлингов")
                } else if (result1 == 1) {
                    println("$result стерлинг")
                } else if (result1 >= 2 && result <= 4) {
                    println("$result стерлинга")
                } else if (result1 >= 5 && result1 <= 9 || result1 == 0) {
                    println("$result стерлингов")
                }
            } else if (number1 == 403) {
                val result = number / 64
                val result1 = result % 10
                if (result1 >= 2 && result1 <= 4) {
                    println("$result йена")
                } else if (result1 >= 5 || result1 <= 1) {
                    println("$result йен")
                }
            } else if (number1 == 404) {
                val result = number / 77
                val result1 = result % 10
                if (result1 >= 2 && result1 <= 4) {
                    println("$result франка")
                } else if (result1 == 1) {
                    println("$result франк")
                } else if (result1 >= 5 && result1 <= 9 || result1 == 0) {
                    println("$result франков")
                }
            } else if (number1 == 405) {
                val result = number / 11
                val result1 = result % 10
                if (result1 >= 2 && result1 <= 4) {
                    println("$result юаней")
                } else if (result1 <= 1 && result1 >= 5) {
                    println("$result юань")
                }
            } else {
                println("не известный курс валюты")
            }
        }
        else if (work == 0){
            break
        }
    }
}
fun counting_seconds(){
    val i = 1
    while (i == 1) {
        val time = Scanner(System.`in`)
        println("1 - Start 0 - Exit")
        val work = time.nextInt()
        if (work == 1) {
            print("введите секунды: ")
            val second = time.nextInt()
            val year = second / 86400 / 30 / 12
            val module_year = second % (86400 * 30 * 12)
            val month = module_year / 86400 / 30
            val modulr_month = module_year % (86400 * 30)
            val day = modulr_month / 86400
            val module_day = modulr_month % 86400
            val hour = module_day / 3600
            val module_hour = module_day % 3600
            val minutes = module_hour / 60
            val seconds = module_hour % 60
            if (year >= 11 && year <= 14) {
                println("$year лет")
            } else if (year % 10 == 1) {
                println("$year год")
            } else if (year % 10 >= 2 && year % 10 <= 4) {
                println("$year года")
            } else if (year % 10 >= 5 && year % 10 <= 9 || year % 10 == 0) {
                println("$year лет")
            }
            if (month >= 11 && month <= 14) {
                println("$month месяцев")
            } else if (month % 10 == 1) {
                println("$month месяц")
            } else if (month % 10 >= 2 && month % 10 <= 4) {
                println("$month месяца")
            } else if (month % 10 >= 5 && month % 10 <= 9 || month % 10 == 0) {
                println("$month месяцев")
            }
            if (day >= 11 && day <= 14) {
                println("$day дней")
            } else if (day % 10 == 1) {
                println("$day день")
            } else if (day % 10 >= 2 && day % 10 <= 4) {
                println("$day дня")
            } else if (day % 10 >= 5 && day % 10 <= 9 || day % 10 == 0) {
                println("$day дней")
            }
            if (hour >= 11 && hour <= 14) {
                println("$hour часов")
            } else if (hour % 10 == 1) {
                println("$hour час")
            } else if (hour % 10 >= 2 && hour % 10 <= 4) {
                println("$hour часа")
            } else if (hour % 10 >= 5 && hour % 10 <= 9 || hour % 10 == 0) {
                println("$hour часов")
            }
            if (minutes >= 11 && minutes <= 14) {
                println("$minutes минут")
            } else if (minutes % 10 == 1) {
                println("$minutes минута")
            } else if (minutes % 10 >= 2 && minutes % 10 <= 4) {
                println("$minutes минуты")
            } else if (minutes % 10 >= 5 && minutes % 10 <= 9 || minutes % 10 == 0) {
                println("$minutes минут")
            }
            if (seconds >= 11 && seconds <= 14) {
                println("$seconds секунд")
            } else if (seconds % 10 == 1) {
                println("$seconds секунда")
            } else if (seconds % 10 >= 2 && seconds % 10 <= 4) {
                println("$seconds секунды")
            } else if (seconds % 10 >= 5 && seconds % 10 <= 9 || seconds % 10 == 0) {
                println("$seconds секунд")
            }
        }
        else if (work == 0){
            break
        }
    }
}
fun population_count(){
    val i = 1
    while (i == 1) {
        val work4 = Scanner(System.`in`)
        println("1 - Start 0 - Exit")
        val work = work4.nextInt()
        if (work == 1) {
            var person = 10000000
            for (i in 1..10) {
                val life = person / 1000 * 14
                val death = person / 1000 * 8
                person += life - death
            }
            println("$person")
        }
        else if (work == 0){
            break
        }
    }
}
fun population_count_method2(){
    val i = 1
    while (i == 1) {
        val work5 = Scanner(System.`in`)
        println("1 - Start 0 - Exit")
        val work = work5.nextInt()
        if (work == 1) {
            var people = 10000000
            var life = 14
            var death = 8
            for (i in 1..10) {
                var resultL = people / 1000 * life
                var resultD = people / 1000 * death
                people += resultL - resultD
                life--
                death--
                if (life == 6) {
                    life = 7
                }
                if (death == 5) {
                    death = 6
                }
                while (i == 10) {
                    println("$people")
                    break
                }
            }
        }
        else if (work == 0){
            break
        }
    }
}
fun contribution(){
    val i = 1
    while (i == 1) {
        val input = Scanner(System.`in`)
        println("1 - Start 0 - Exit")
        val work = input.nextInt()
        if (work == 1) {
            print("введите сумму вклада: ")
            var number = input.nextFloat()
            print("введите колличество месяцев: ")
            val number1 = input.nextInt()
            for (i in 1..number1) {
                number += (number * 0.07F)
            }
            println("$number")
        }
        else if (work == 0){
            break
        }
    }
}
fun cash_settlement() {
    val i = 1
    while (i == 1) {
        val input = Scanner(System.`in`)
        println("1 - Start 0 - Exit")
        val work = input.nextInt()
        if (work == 1) {
            print("веведите сумму вклада: ")
            var number = input.nextFloat()
            print("введите колличество месяцев: ")
            var number1 = input.nextInt()
            while (number1 >= 1) {
                number += number * 0.07F
                number1--
            }
            println("$number")
        }
    }

}

fun table_method2(){
    val z = 1
    while (z == 1){
        val work6 = Scanner(System.`in`)
        println("1 - Start 0 - Exit")
        val work = work6.nextInt()
        if (work == 1){
    var i = 1
    while (i < 10){
        var x = 1
        while (x < 10){
            print("${ i * x } \t")
            x++
        }
        println()
        i++
    }
        }
        else if (work == 0){
            break
        }
    }
}
fun infinite_multiplication(){
    val i = 1
    while (i == 1){
        val input = Scanner(System.`in`)
        println("1- Start 0 - Exit")
        val number = input.nextInt()
        if (number == 1) {
            print("введите первое число: ")
            val number1 = input.nextInt()
            print("введите второе число: ")
            val number2 = input.nextInt()
            val result = number1 * number2
            println("Ответ $result")
        }
        else if (number == 0){
            break
        }
    }
}
fun tetration_of_numbers(){
    val f = 1
    while (f == 1) {
        val input = Scanner(System.`in`)
        println("1 - Start 0 - Exit")
        val work = input.nextInt()
        if (work == 1) {
            print("введите число: ")
            var number = input.nextInt()
            print("введите степень: ")
            val number1 = input.nextInt()
            for (i in 1..4) {
                var z = number1 - 1
                while (z >= 1) {
                    number *= number
                    z--
//            if (i == 4){
                    println("$number")
//           }
                }
                println("$i")
            }
        }
        else if (work == 0){
            break
        }
    }
}
fun pyramid(){
    val f = 1
    while (f == 1) {
        val input = Scanner(System.`in`)
        println("1 - Start 0 - Exit")
        val work = input.nextInt()
        if (work == 1) {
            print("введите число: ")
            val number = input.nextInt()
            var count = number
            var i = 1
            while (i <= number) {
                for (i1 in 1..count) {
                    print(" ")
                }
                for (z in 1..i) {
                    print("$i ")
                }
                println()
                i++
                count--
            }
        }
        else if (work == 0){
            break
        }
    }
}
fun fibonacci(){
    val f = 1
    while (f == 1) {
        val input = Scanner(System.`in`)
        println("1 - Start 0 - Exit")
        val work = input.nextInt()
        if (work == 1) {
            print("введите число: ")
            val number = input.nextInt()
            var number1 = 1
            var number2 = 0
            print("0 ")
            var i = number - 1
            while (i >= 1) {
                number1 += number2
                print("$number1 ")
                i--
                if (i == 0) {
                    break
                }
                number2 += number1
                print("$number2 ")
                i--
            }
        }
        else if (work == 0){
            break
        }
    }
}
fun even_numbers_output(){
    val f = 1
    while (f == 1) {
        val input = Scanner(System.`in`)
        println("1 - Start 0 - Exit")
        val work = input.nextInt()
        if (work == 1) {
            print("введите размер массива: ")
            val lengthArray = input.nextInt()
            val massiv = Array(lengthArray, { 0 })
            for (x in 0..lengthArray - 1) {
                print("введите число $x: ")
                val array1 = input.nextInt()
                massiv[x] = array1
            }
            for (result in massiv) {
                print("$result \t")
            }
            println()
            for (result in massiv) {
                if (result % 2 == 1) {
                    print("0 \t")
                } else if (result % 2 == 0) {
                    print("$result \t")
                }
            }
        }
        else if (work == 0){
            break
        }
    }
}
fun comparison_of_array(){
    val f = 1
    while (f == 1){
    val input = Scanner(System.`in`)
        println("1 - Start 0 - Exit")
        val work = input.nextInt()
        if (work == 1){
    var caunt = 0
    var caunt1 = 0
    print("введите размер 1 массива: ")
    val lengthArray = input.nextInt()
    val massiv = Array(lengthArray,{0})
    for(x in 0..lengthArray-1){
        print("введите число $x: ")
        val array1 = input.nextInt()
        massiv[x] = array1
    }
    print("введите размер 2 массива: ")
    val lengthArray1 = input.nextInt()
    val massiv1 = Array(lengthArray1,{0})
    for(x in 0..lengthArray1-1){
        print("введите число $x: ")
        val array1 = input.nextInt()
        massiv1[x] = array1
    }
    for (x in massiv) {
        caunt+=x
    }
    caunt /= 5
    print("$caunt massiv")
    println()
    for (z in massiv1){
        caunt1+=z
    }
    caunt1 /= 5
    println("$caunt1 massiv1")
    if (caunt > caunt1){
        println("massiv больше")
    }
    else if (caunt < caunt1){
        println("massiv1 больше")
    }
    else if (caunt == caunt1){
        println("они равны")
    }
        }
        else if (work == 0){
            break
        }
    }
}
fun array_Fibonacci(){
    val f = 1
    while (f == 1) {
        val input = Scanner(System.`in`)
        println("1 - Start 0 - Exit")
        val work = input.nextInt()
        if (work == 1) {
            print("введите размер массива: ")
            val lengthArray = input.nextInt()
            val massiv = Array(lengthArray, { 0 })
            for (x in 0..lengthArray - 1) {
            }
            var number1 = 1
            var number2 = 0
            var i = lengthArray - 1
            var z = 1
            while (i >= 1) {
                number1 += number2
                massiv[z] = number1
                i--
                z++
                if (i == 0) {
                    break
                }
                number2 += number1
                massiv[z] = number2
                i--
                z++
            }
            for (j in massiv) {
                print("$j  ")

            }
        }
        else if (work == 0){
            break
        }
    }
}
fun conditionally_displaying_elements(){
    val f = 1
    while (f == 1){
    val input = Scanner(System.`in`)
        println("1 - Start 0 - Exit")
        val work = input.nextInt()
        if (work == 1){
    print("введите размер массива: ")
    val lengthArray = input.nextInt()
    val massiv = Array(lengthArray,{0})
    for(x in 0..lengthArray-1){
        print("введите число $x: ")
        val array1 = input.nextInt()
        massiv[x] = array1
    }
    for (z in massiv){
        if (z < 5){
            print("$z \t")
        }
    }
    println()
        }
        else if (work == 0){
            break
        }
    }
    }
fun displaying_common_items(){
    val f = 1
    while (f == 1) {
        val input = Scanner(System.`in`)
        println("1 - Start 0 - Exit")
        val work = input.nextInt()
        if (work == 1) {
            print("введите размер 1 массива: ")
            val lengthArray = input.nextInt()
            val massiv = Array(lengthArray, { 0 })
            for (x in 0..lengthArray - 1) {
                print("введите число $x: ")
                val array1 = input.nextInt()
                massiv[x] = array1
            }
            print("введите размер 2 массива: ")
            val lengthArray1 = input.nextInt()
            val massiv1 = Array(lengthArray1, { 0 })
            for (x in 0..lengthArray1 - 1) {
                print("введите число $x: ")
                val array1 = input.nextInt()
                massiv1[x] = array1
            }

            for (i in massiv) {
                for (z in massiv1) {
                    if (i == z) {
                        print("$i \t")
                    }
                }
            }
            println()
        }
        else if (work == 0){
            break
        }
    }
}
fun display_max_and_min_value(){
    val f = 1
    while (f == 1){
    val input = Scanner(System.`in`)
        println("1 - Start 0 - Exit")
        val work = input.nextInt()
        if (work == 1){
    print("введите размер массива: ")
    val lengthArray = input.nextInt()
    val massiv = Array(lengthArray,{0})
    for(x in 0..lengthArray-1){
        print("введите число $x: ")
        val array1 = input.nextInt()
        massiv[x] = array1
    }
    for (i in massiv){
        var length = massiv.size - 1
        for(g in massiv){
            if (i > g){
                if (length == 1){
                    print("$i ")
                }
                length--
            }
        }
    }
    println()
        }
        else if (work == 0){
            break
        }
    }
}
fun palindrome_check(){
    val f = 1
    while (f == 1){
    val input = Scanner(System.`in`)
        println("1 - Start 0 - Exit")
        val work = input.nextInt()
        if (work == 1){
    print("введите размер массива: ")
    val lengthArray = input.nextInt()
    val massiv = Array(lengthArray,{0})
    for(x in 0..lengthArray-1){
        print("введите число $x: ")
        val array1 = input.nextInt()
        massiv[x] = array1
    }
    var length = 0
    var lengthREsult = lengthArray
    var field = true
    for (x in massiv){
        var count = 0
        if (field == false){
            break
        }
        for ( j in massiv){
            count++
            if(count == lengthREsult){
                if (x == j){
                    length+=1
                    if (length == lengthArray){
                        print("palindrom")
                    }
                }
                else if (x > j || x < j){
                        field = false
                    print("niht polindrom")
                    break
                }
            }
        }
        lengthREsult--
    }
        }
        else if (work == 0){
            break
        }
    }
}
fun union_of_array(){
    val f = 1
    while (f == 1) {
        val input = Scanner(System.`in`)
        println("1 - Start 0 - Exit")
        val work = input.nextInt()
        if (work == 1) {
            print("введите размер 1 массива: ")
            val lengthArray = input.nextInt()
            val massiv = Array(lengthArray, { 0 })
            for (x in 0..lengthArray - 1) {
                print("введите число $x: ")
                val array1 = input.nextInt()
                massiv[x] = array1
            }

            print("введите размер 2 массива: ")
            val lengthArray1 = input.nextInt()
            val massiv1 = Array(lengthArray1, { 0 })
            for (x in 0..lengthArray1 - 1) {
                print("введите число $x: ")
                val array1 = input.nextInt()
                massiv1[x] = array1
            }

            var count = 0
            val numbers = Array(lengthArray1 + lengthArray, { 0 })
            for (x in massiv) {
                numbers[count] = x
                count += 1
            }

            for (z in massiv1) {
                numbers[count] = z
                count += 1
            }

            for (a in numbers) {
                print("$a   ")
            }
        }
        else if (work == 0){
            break
        }
    }
}

fun output_numbers(){
    val f = 1
    while (f == 1) {
        val input = Scanner(System.`in`)
        println("1 - Start 0 - Exit")
        val work = input.nextInt()
        if (work == 1) {
            print("введите размер массива: ")
            val lengthArray = input.nextInt()
            val massiv = Array(lengthArray, { 0 })
            for (x in 0..lengthArray - 1) {
                print("введите число $x: ")
                val array1 = input.nextInt()
                massiv[x] = array1
            }

            for (z in massiv) {
                if (z == 237) {
                    break
                } else if (z % 2 == 0) {
                    print("$z \t")
                }
            }
            println()
        }
        else if (work == 0){
            break
        }
    }
}
fun comparing_and_displaying_items(){
    val f = 1
    while (f == 1) {
        val input = Scanner(System.`in`)
        println("1 - Start 0 - Exit")
        val work = input.nextInt()
        if (work == 1) {
            print("введите размер массива: ")
            val lengthArray = input.nextInt()
            val massiv = Array(lengthArray, { 0 })
            for (x in 0..lengthArray - 1) {
                print("введите число $x: ")
                val array1 = input.nextInt()
                massiv[x] = array1
            }
            print("введите размер массива: ")
            val lengthArray1 = input.nextInt()
            val massiv1 = Array(lengthArray1, { 0 })
            for (x in 0..lengthArray1 - 1) {
                print("введите число $x: ")
                val array1 = input.nextInt()
                massiv1[x] = array1
            }
            for (m in massiv) {
                var d = lengthArray
                for (m1 in massiv1) {
                    if (m == m1) {
                        break
                    }
                    if (d == 1) {
                        print("$m ")
                    }
                    d--
                }

            }
            println()
        }
        else if (work == 0){
            break
        }
    }
}
fun revealing_the_number(){
    val f = 1
    while (f == 1) {
        val input = Scanner(System.`in`)
        println("1 - Start 0 - Exit")
        val work = input.nextInt()
        if (work == 1) {
            print("введите размер массива: ")
            val lengthArray = input.nextInt()
            val massiv = Array(lengthArray, { 0 })
            for (x in 0..lengthArray - 1) {
                print("введите число $x: ")
                val array1 = input.nextInt()
                massiv[x] = array1
            }
            var d = 0
            var x = massiv.size
            for (m in massiv) {
                if (m == 4) {
                    d++
                }
                if (x == 1) {
                    print("$d")
                }
                x--
            }
            println()
        }
        else if (work == 0){
            break
        }
    }
}
