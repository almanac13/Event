
public class Events {
    private String name;
    private int time;
    private String description;

    private String participant;
    private int amount;

    private String organizers;

    public String getName() {
        return name;
    }
    public void setName(String newname) {
        name = newname;
    }
    public int getTime() {
        return time;
    }
    public void setTime(int newtime) {
        time = newtime;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String newdescription) {
        description = newdescription;
    }
    public String getParticipant() {
        return participant;
    }
    public void setParticipant(String newparticipant) {
        participant = newparticipant;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int newamount) {
        amount = newamount;
    }
    public String getOrganizers() {
        return organizers;
    }
    public void setOrganizers(String neworganizers) {
        organizers = neworganizers;
    }

    public void information(){
        System.out.println("The event's name: " + name);
        System.out.println("The event's time: " + time);
        System.out.println("About the event: " + description);
    }

    public void organizer(){
        System.out.println("The event organizer: " + organizers);
    }

    public void participants(){
        System.out.println("The event's participants: " + participant);
        System.out.println("The participants' amount: " + amount);
    }


}
