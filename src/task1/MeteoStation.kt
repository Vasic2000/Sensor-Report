package tsak1

fun main() {
        val meteoDb = MeteoStore()
        val ms200_1: MeteoSensor = MS200(1)
        meteoDb.save(ms200_1)

        // Здесь надо вызвать метод getData у класса Tsak1.ST500Info. Полученные данные отправить в метод save объекта meteoDb
        val st500_1: MeteoSensor = ST500Adapter(ST500Info())
        meteoDb.save(st500_1)
    }
