package tsak1

interface SensorTemperature {
    fun identifier(): Int // идентификатор датчика
    fun temperature(): Double // температура датчика
    fun year(): Int // Год
    fun day(): Int // День года
    fun second(): Int // Секунда дня
}