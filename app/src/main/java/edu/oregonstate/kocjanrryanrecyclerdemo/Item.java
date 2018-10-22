package edu.oregonstate.kocjanrryanrecyclerdemo;

public class Item {
    private String mHeader;
    private String mDescription;

    public Item(String header, String description) {
        mHeader = header;
        mDescription = description;
    }

    public String getHeader() {
        return mHeader;
    }
    public String getDescription() {
        return mDescription;
    }
    public void setHeader(String header) {
        mHeader = header;
    }
    public void setDescription(String description) {
        mDescription = description;
    }
}
