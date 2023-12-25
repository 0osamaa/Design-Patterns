package com.osama;

public interface DataSource {
    void writeData(String data);

    String readData();
}