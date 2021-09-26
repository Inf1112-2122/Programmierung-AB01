import de.github.dudrie.hamster.imperative.de.*

fun main() {
    // Starte das Spiel (für die Aufgabe)
    starteHausDesNikolausSpiel()
    setzeSpielGeschwindigkeit(10f)

    // Implementiere die Lösung
    legeAbUndLaufeVier()

    dreheNachRechts()
    legeUndLaufeNachRechtsUnten()
    legeUndLaufeNachRechtsUnten()
    legeUndLaufeNachRechtsUnten()
    legeUndLaufeNachRechtsUnten()

    dreheNachLinks()
    legeAbUndLaufeVier()

    dreheNachLinks()
    legeAbUndLaufeVier()

    dreheUm()
    laufeNachRechtsOben()
    legeUndLaufeNachRechtsOben()

    legeUndLaufeNachRechtsUnten()
    legeUndLaufeNachRechtsUnten()

    dreheUm()
    laufeNachLinksUnten()
    legeUndLaufeNachLinksUnten()
    laufeNachLinksUnten()
    legeUndLaufeNachLinksUnten()

    dreheUm()
    laufe()
    legeAbUndLaufe()
    legeAbUndLaufe()
    legeAbUndLaufe()

    // Stoppe das Spiel
    stoppeSpiel()
}

fun legeAbUndLaufe() {
    legeKornAb()
    laufe()
}

fun legeAbUndLaufeVier() {
    legeAbUndLaufe()
    legeAbUndLaufe()
    legeAbUndLaufe()
    legeAbUndLaufe()
}

fun laufeNachRechtsUnten() {
    laufe()
    dreheNachRechts()
    laufe()
    dreheNachLinks()
}

fun legeUndLaufeNachRechtsUnten() {
    legeKornAb()
    laufeNachRechtsUnten()
}

fun laufeNachRechtsOben() {
    laufe()
    dreheNachLinks()
    laufe()
    dreheNachRechts()
}

fun legeUndLaufeNachRechtsOben() {
    legeKornAb()
    laufeNachRechtsOben()
}

fun laufeNachLinksUnten() {
    laufe()
    dreheNachLinks()
    laufe()
    dreheNachRechts()
}

fun legeUndLaufeNachLinksUnten() {
    legeKornAb()
    laufeNachLinksUnten()
}

fun dreheUm() {
    dreheNachLinks()
    dreheNachLinks()
}
