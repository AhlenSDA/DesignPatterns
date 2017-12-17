package com.sda.webinar.designpatterns.factorymethod.reports;

public class DraftReport extends Report {

    public void printReport() {
        System.out.println("Draft report");
    }

    public DraftReport(ReportData data) {
        super.reportData = data;
    }
}
