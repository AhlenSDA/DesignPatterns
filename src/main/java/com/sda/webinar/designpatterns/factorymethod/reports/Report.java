package com.sda.webinar.designpatterns.factorymethod.reports;

public abstract class Report {

    String header;
    String footer;
    String index;
    String tableOfContent;
    Page[] pages;

    ReportData reportData;

    public abstract void printReport();

}
