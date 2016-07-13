package ru.relesystem;

import ru.relesystem.entities.Relay;

import java.util.List;

public class RelayGrid {
    private int totalPages;
    private int currentPage;
    private long totalRecords;
    private List<Relay> relayData;

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public long getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(long totalRecords) {
        this.totalRecords = totalRecords;
    }

    public List<Relay> getContactData() {
        return relayData;
    }

    public void setContactData(List<Relay> relayData) {
        this.relayData = relayData;
    }
}