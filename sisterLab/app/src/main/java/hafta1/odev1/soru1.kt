package hafta1.odev1

fun main() {
    try {
        print("Yaşınızı giriniz: ")
        val age = readLine()?.toInt()
        if (age != null) {
            if (age >= 18) {
                println("Oy kullanabilirsiniz!")
            } else {
                println("Oy kullanamazsınız.")
            }
        } else {
            println("Geçerli bir yaş girmediniz.")
        }
    } catch (ex: NumberFormatException) {
        println("Sayı giriniz.")
    }
}