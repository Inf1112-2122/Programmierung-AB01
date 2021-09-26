import de.github.dudrie.hamster.imperative.de.*

fun main() {
    // Starte das Spiel (für die Aufgabe)
    starteGrossesFeldSpiel()

    // Implementiere die Lösung
    // standardLoesung()
    optimierteLoesung()

    // Stoppe das Spiel
    stoppeSpiel()
}

fun dreheNachRechts() {
    dreheNachLinks()
    dreheNachLinks()
    dreheNachLinks()
}

fun laufeZwei() {
    laufe()
    laufe()
}

fun standardLoesung() {
    laufeZwei()
    dreheNachLinks()
    laufeZwei()
    dreheNachLinks()
    laufeZwei()
    sammleKornAuf()

    dreheNachRechts()
    laufeZwei()
    laufeZwei()
    laufe()
    dreheNachRechts()
    laufe()
    sammleKornAuf()

    laufeZwei()
    laufe()
    dreheNachRechts()
    laufeZwei()
    sammleKornAuf()
    sammleKornAuf()

    laufeZwei()
    laufe()
    dreheNachLinks()
    laufeZwei()
    laufe()
    sammleKornAuf()
    sammleKornAuf()

    dreheNachRechts()
    laufeZwei()
    legeKornAb()
    legeKornAb()
    legeKornAb()
    legeKornAb()
    legeKornAb()
    legeKornAb()
}

fun optimierteLoesung() {
    laufeZwei()
    laufeZwei()
    dreheNachLinks()
    laufeZwei()
    laufeZwei()
    laufe()
    sammleKornAuf()
    sammleKornAuf()

    laufeZwei()
    dreheNachLinks()
    laufeZwei()
    laufe()
    sammleKornAuf()

    laufe()
    dreheNachLinks()
    laufeZwei()
    laufeZwei()
    laufe()
    sammleKornAuf()

    dreheNachLinks()
    laufeZwei()
    laufeZwei()
    laufeZwei()
    laufe()
    sammleKornAuf()
    sammleKornAuf()

    dreheNachRechts()
    laufeZwei()
    legeKornAb()
    legeKornAb()
    legeKornAb()
    legeKornAb()
    legeKornAb()
    legeKornAb()
}
