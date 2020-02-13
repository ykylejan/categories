package dellatan.mcm.edu.kypert;

public class Service {
    private int serviceID;
    private String serviceName;
    private String serviceLocation;
    private int serviceContact;
    private String serviceDescription;

    public Service (int id, String name, String location, int contact, String description) {
        serviceID = id;
        serviceName = name;
        serviceLocation = location;
        serviceContact = contact;
        serviceDescription = description;
    }

    public int getServiceID() {
        return serviceID;
    }
    public void setServiceID(int serviceID) {
        this.serviceID = serviceID;
    }


    public String getServiceName () {
        return serviceName;
    }
    public void setServiceName (String serviceName) {
        this.serviceName = serviceName;
    }


    public String getServiceLocation() {
        return serviceLocation;
    }
    public void setServiceLocation(String serviceLocation){
        this.serviceLocation = serviceLocation;
    }


    public int getServiceContact() {
        return  serviceContact;
    }
    public void setServiceContact(int serviceContact) {
        this.serviceContact = serviceContact;
    }


    public String getServiceDescription () {
        return serviceDescription;
    }
    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

}
