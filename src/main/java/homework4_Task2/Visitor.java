package homework4_Task2;

abstract public class Visitor {
    protected static String visitorId;
    protected int visitorAge;
    protected String visitorName;
    protected static int id;
    protected static String[] allowedNames = new String[] {"Никита", "Джолин", "Джозеф",
            "Паша", "Роман", "Дио", "Жан-Пьер",
            "Дзётаро", "Александра", "Кирилл"};


    public int getVisitorAge() {
        return visitorAge;
    }

    public static String getVisitorId() {
        return visitorId;
    }

    public String getVisitorName() {
        return visitorName;
    }

    public void setVisitorAge(int visitorAge) {
        this.visitorAge = visitorAge;
    }

    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
    }

    abstract void doWork();

    abstract Visitor generateRandomVisitor();
}
