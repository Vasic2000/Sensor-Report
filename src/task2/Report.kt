package task2

import java.util.*

internal class Report {
    private var items // Отчетные данные
            : MutableList<ReportItem>? = null

    // расчет отчетных данных
    fun calculate() {
        items = ArrayList<ReportItem>()
        items!!.add(ReportItem("First", 5.toFloat()))
        items!!.add(ReportItem("Second", 6.toFloat()))
    }

    fun output() {
        val reportPrint = PrintReport()
        items?.let {
            reportPrint.output(it)
        }
    }
}