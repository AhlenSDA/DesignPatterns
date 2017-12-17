package com.sda.webinar.designpatterns.adapter;

import java.util.Date;

public interface ReserveTable {
    boolean reserve(String person, Date date, int numberOfPeople);

}
