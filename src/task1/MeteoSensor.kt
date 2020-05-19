package tsak1

import java.time.LocalDateTime

interface MeteoSensor {
    // идентификатор датчика
    val id: Int

    // температура датчика
    val temperature: Float?

    // влажность
    val humidity: Float?

    // давление
    val pressure: Float?

    // время чтения данных датчика
    val dateTime: LocalDateTime?
}