package task2

fun main() {
    var reportType : IReport = ScreenReport() //    ScreenReport, FileReport, ScreenReport

    val report = Report(reportType)
    report.calculate()
    report.output()
}
