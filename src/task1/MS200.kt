package tsak1

import java.time.LocalDateTime

class MS200(override var id: Int) : MeteoSensor {

    override val temperature: Float
        get() = 20.toFloat()

    override val humidity: Float
        get() = 60.toFloat()

    override val pressure: Float
        get() = 752.4.toFloat()

    override val dateTime: LocalDateTime
        get() = LocalDateTime.now()

}