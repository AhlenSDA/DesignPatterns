package com.sda.webinar.designpatterns.factorymethod.creators;

import com.sda.webinar.designpatterns.factorymethod.reports.DraftReport;
import com.sda.webinar.designpatterns.factorymethod.reports.Report;
import com.sda.webinar.designpatterns.factorymethod.reports.ReportData;

public class DraftReportCreator implements ReportCreator {

    public Report createReport(ReportData data) {
        return new DraftReport(data);
    }
}
