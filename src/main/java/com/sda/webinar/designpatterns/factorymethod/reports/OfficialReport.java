package com.sda.webinar.designpatterns.factorymethod.reports;

public class OfficialReport extends Report {

    public void printReport() {
        System.out.println("Official report");
    }

    public OfficialReport(ReportData data) {
        super.reportData = data;
    }
}
