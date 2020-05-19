package task2

internal class FileReport {
    fun output(items: List<ReportItem>) {
        println("Output to file")
        for (item in items) {
            System.out.format("file %s - %f \n\r", item.description, item.amount)
        }
    }
}