package id.ac.itera.pam.tugas1

import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Tugas Praktikum 1 - Ahmad Mulia Saputra (123140168)",
        state = rememberWindowState(width = 450.dp, height = 650.dp),
    ) {
        App()
    }
}
