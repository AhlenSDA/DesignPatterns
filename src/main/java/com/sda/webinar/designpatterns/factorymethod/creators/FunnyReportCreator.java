package com.sda.webinar.designpatterns.factorymethod.creators;

import com.sda.webinar.designpatterns.factorymethod.reports.FunnyReport;
import com.sda.webinar.designpatterns.factorymethod.reports.Report;
import com.sda.webinar.designpatterns.factorymethod.reports.ReportData;

public class FunnyReportCreator implements ReportCreator {

    public Report createReport(ReportData data) {
        return new FunnyReport(data);
    }
}
