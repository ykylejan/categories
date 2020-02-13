package dellatan.mcm.edu.kypert;

public class Venue {
    private int venueID;
    private String venueName;
    private String venueLocation;
    private int venueContact;
    private String venueDescription;


    public Venue(int id, String name, String location, int contact, String description){
        venueID = id;
        venueName = name;
        venueLocation = location;
        venueContact = contact;
        venueDescription = description;
    }

    public int getVenueID(){
        return venueID;
    }
    public void setVenueID(int venueID) {
        this.venueID = venueID;
    }


    public String getVenueName(){
        return venueName;
    }
    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }


    public String getVenueLocation() {
        return venueLocation;
    }
    public void setVenueLocation(String venueLocation) {
        this.venueLocation = venueLocation;
    }


    public int getVenueContact() {
        return venueContact;
    }
    public void setVenueContact (int venueContact) {
        this.venueContact = venueContact;
    }


    public String getVenueDescription() {
        return venueDescription;
    }
    public void setVenueDescription (String venueDescription) {
        this.venueDescription = venueDescription;
    }

}