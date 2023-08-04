package hafta1.odev2

fun main() {
    val predefinedUsername = "kullanici"
    val predefinedPassword = "Sifre123" // Örnek olarak şifre belirliyorum
    print("Kullanıcı adı: ")
    val usernameInput = readLine()?.toLowerCase() ?: ""
    print("Şifre: ")
    val passwordInput = readLine() ?: ""
    if (usernameInput == predefinedUsername && passwordInput == predefinedPassword) {
        println("Hoş geldiniz, $predefinedUsername!")
    } else {
        println("Kullanıcı adı veya şifre hatalı!")
    }
}
