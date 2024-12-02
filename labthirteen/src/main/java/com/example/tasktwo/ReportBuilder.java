package com.example.tasktwo;

public class ReportBuilder {
    private DataBaseAdapter db;
    public ReportBuilder(DataBaseAdapter db) {
        this.db = db;
    }

    public void buildReport() {
        System.out.println("User Data: " + db.getUserData());
        System.out.println("Static Data: " + db.getStaticData());
    }
}
