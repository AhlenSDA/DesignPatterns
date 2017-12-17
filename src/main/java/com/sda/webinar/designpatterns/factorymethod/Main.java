package com.sda.webinar.designpatterns.factorymethod;

import com.sda.webinar.designpatterns.factorymethod.creators.DraftReportCreator;
import com.sda.webinar.designpatterns.factorymethod.creators.FunnyReportCreator;
import com.sda.webinar.designpatterns.factorymethod.creators.OfficialReportCreator;
import com.sda.webinar.designpatterns.factorymethod.creators.ReportCreator;
import com.sda.webinar.designpatterns.factorymethod.reports.Report;
import com.sda.webinar.designpatterns.factorymethod.reports.ReportData;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        ReportData data = new ReportData();

        List<ReportCreator> reportCreator = java.util.Arrays.asList(
                new OfficialReportCreator(),
                new DraftReportCreator(),
                new FunnyReportCreator());

        for (ReportCreator creator : reportCreator) {
            Report report = creator.createReport(data);
            report.printReport();
        }
    }
}