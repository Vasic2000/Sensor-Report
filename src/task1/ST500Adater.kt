package tsak1

import java.time.LocalDateTime

class ST500Adapter(var st500: ST500Info) : MeteoSensor {

    override val id: Int
        get() = st500.data.identifier()
    override val temperature: Float?
        get() = st500.data.temperature().toFloat()
    override val humidity: Float?
        get() = null
    override val pressure: Float?
        get() = null
    override val dateTime: LocalDateTime?
        get() {
            return LocalDateTime.of(st500.data.year(), 1, 1, 0, 0, 0).
            plusDays(st500.data.day().toLong()-1).
            plusSeconds(st500.data.second().toLong())
        };

}