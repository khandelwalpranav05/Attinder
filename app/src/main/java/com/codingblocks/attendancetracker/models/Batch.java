package com.codingblocks.attendancetracker.models;

import java.util.ArrayList;

public class Batch {
    String name;


    public static ArrayList<String> getDummyBatches() {
        ArrayList<String> batches = new ArrayList<>();

        batches.add("Batch A");
        batches.add("Batch B");
        batches.add("Batch C");

        batches.add("Batch D");

        batches.add("Batch E");
        return batches;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Batch(String name) {
        this.name = name;
    }
}
