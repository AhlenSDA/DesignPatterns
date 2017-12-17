package com.sda.webinar.designpatterns.factorymethod.creators;

import com.sda.webinar.designpatterns.factorymethod.reports.Report;
import com.sda.webinar.designpatterns.factorymethod.reports.ReportData;

public interface ReportCreator {

    Report createReport(ReportData data);

}
