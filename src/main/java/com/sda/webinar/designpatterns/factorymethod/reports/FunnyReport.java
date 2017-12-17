package com.sda.webinar.designpatterns.factorymethod.reports;

public class FunnyReport extends Report {

    public void printReport() {
        System.out.println("Funny report");
    }

    public FunnyReport (ReportData data){
        super.reportData = data;
    }
}
