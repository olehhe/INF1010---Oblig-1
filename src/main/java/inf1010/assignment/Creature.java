package inf1010.assignment;

public interface Creature extends Comparable<Creature> {

    // local variable-prototypes
    final String name, homePlanet;
    String dateOfBirth, phone, location;

    // get-prototypes
    String getName(), getDateOfBirth(), getPhone(), getLocation()

    // set-prototypes
    void setDateOfBirth(String name), setPhone(String name), setLocation(String name);
}
