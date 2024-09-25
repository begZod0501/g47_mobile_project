package uz.pdp.back.model;

public abstract class AuditEntity {
    private int id;

    private static int idCounter = 0;

    {
        id = idCounter++;
    }

    public int getId() {
        return id;
    }
}
