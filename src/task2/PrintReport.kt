package task2

internal class PrintReport : IReport{
    override fun output(items: List<ReportItem>) {
        println("Output to printer")
        for (item in items) {
            System.out.format("printer %s - %f \n\r", item.description, item.amount)
        }
    }
}