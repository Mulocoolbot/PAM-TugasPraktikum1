package id.ac.itera.pam.tugas1

actual fun getPlatformName(): String {
    val osName = System.getProperty("os.name") ?: "Desktop"
    val javaVersion = System.getProperty("java.version") ?: "Unknown"
    return "Desktop JVM ($osName, Java $javaVersion)"
}
