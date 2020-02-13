package dellatan.mcm.edu.kypert;

public class AddEvent {
    private int eventID;
    private String eventName;
    private int eventDate;
    private int eventTime;
    private double eventBudget;
    private String eventType;
    private String eventCelebrant;
    private int eventGuests;

    public AddEvent (int id, String name, int date, int time, double budget, String type, String celebrant, int guests){
        eventID = id;
        eventName = name;
        eventDate = date;
        eventTime = time;
        eventBudget = budget;
        eventType = type;
        eventCelebrant = celebrant;
        eventGuests = guests;
    }

    public int getEventID() {
        return eventID;
    }
    public void setEventID(int eventID) {
        this.eventID = eventID;
    }


    public String getEventName() {
        return eventName;
    }
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }


    public int getEventDate() {
        return eventDate;
    }
    public void setEventDate(int eventDate) {
        this.eventDate = eventDate;
    }


    public int getEventTime() {
        return eventTime;
    }
    public void setEventTime(int eventTime) {
        this.eventTime = eventTime;
    }


    public double getEventBudget() {
        return eventBudget;
    }
    public void setEventBudget(double eventBudget){
        this.eventBudget = eventBudget;
    }


    public String getEventType() {
        return eventType;
    }
    public void setEventType() {
        this.eventType = eventType;
    }


    public String getEventCelebrant(){
        return eventCelebrant;
    }
    public void setEventCelebrant(String eventCelebrant) {
        this.eventCelebrant = eventCelebrant;
    }


    public int getEventGuests() {
        return eventGuests;
    }
    public void setEventGuests(int eventGuests) {
        this.eventGuests = eventGuests;
    }
}
