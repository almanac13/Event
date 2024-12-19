//   Event Scheduling System Нурасыл М
//• Event
//• Participant
//• Organizer
//Create classes according to your subject area.
//Requirements to project:
//- create classes
//- the class must have constructors, attributes, methods.
//- Implementation of getter and setter methods.
//- Create instances of classes in the main function.
//- Output them to console, compare multiple objects.
// Main Class

public class Main {
    public static void main(String[] args) {
        Events event = new Events();

        event.setName("ICPC");
        event.setTime(17);
        event.setDescription("The ICPC is a prestigious global competitive programming competition for university students.");

        event.setParticipant("Top 3 groups in every university");
        event.setAmount(300);

        event.setOrganizers("the Minister of Digital Development");


        event.information();
        event.participants();
        event.organizer();
    }
}


