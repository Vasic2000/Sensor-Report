package tsak1

class MeteoStore {
    // сохранение данных в базу
    fun save(meteoSensor: MeteoSensor): Boolean {
        System.out.format(
            "Saving data from sensor [%d] at %s%n temperature - %f ; humidity - %f ; pressure - %f \n\r",
            meteoSensor.id,
            meteoSensor.dateTime,
            meteoSensor.temperature,
            meteoSensor.humidity,
            meteoSensor.pressure
        )
        return true
    }
}