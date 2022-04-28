package com.smilingbitstudios.cardependencies

import javax.inject.Inject

class Tire @Inject constructor() {
    val width: Double = 0.0
    val diameter: Double = 0.0
    val ratio: Double = 0.0
    val rimSize: Double = 0.0
    val maxSpeed: Double = 0.0
    val maxPressure: Double=0.0
    val coldPressure: Double=0.0
    val maxLoad: Double = 0.0
    val temperatureGrade: Char = ' '
    val tractionGrade: Char = ' '
}
