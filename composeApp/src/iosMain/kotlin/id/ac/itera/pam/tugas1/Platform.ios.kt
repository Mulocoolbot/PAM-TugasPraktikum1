package id.ac.itera.pam.tugas1

import platform.UIKit.UIDevice

actual fun getPlatformName(): String {
    return "${UIDevice.currentDevice.systemName()} ${UIDevice.currentDevice.systemVersion}"
}
