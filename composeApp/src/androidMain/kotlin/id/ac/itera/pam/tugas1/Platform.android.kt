package id.ac.itera.pam.tugas1

import android.os.Build

actual fun getPlatformName(): String {
    return "Android ${Build.VERSION.SDK_INT} (${Build.MANUFACTURER} ${Build.MODEL})"
}
