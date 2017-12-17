package com.sda.webinar.designpatterns.factorymethod.creators;

import com.sda.webinar.designpatterns.factorymethod.reports.OfficialReport;
import com.sda.webinar.designpatterns.factorymethod.reports.Report;
import com.sda.webinar.designpatterns.factorymethod.reports.ReportData;

public class OfficialReportCreator implements ReportCreator {

    public Report createReport(ReportData data) {
        return new OfficialReport(data);
    }
}