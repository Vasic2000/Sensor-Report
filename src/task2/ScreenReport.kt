package task2

internal class ScreenReport  : IReport {
    override fun output(items: List<ReportItem>) {
        println("Output to screen")
        for (item in items) {
            System.out.format("screen %s - %f \n\r", item.description, item.amount)
        }
    }
}