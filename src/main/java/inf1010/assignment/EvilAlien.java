public class EvilAlien extends Comparable implements Creature {

    final String homePlanet = "Ruritania";

    // constructor
    EvilAlien(String name, String dateOfBirth, String phone, String location) {
	this.name = name;
	this.dateOfBirth = dateOfBirth;
	this.phone = phone;
	this.location = location;
    }

    // gets
    String getName() {
	return this.name;
    }

    String getDateOfBirth() {
	return this.dateOfBirth;
    }

    String getPhone() {
	return this.phone;
    }

    String getLocation() {
	return this.location;
    }

    // sets
    void setDateOfBirth(String date) {
	this.dateOfBirth = date;
    }

    void setPhone(String number) {
	this.phone = number;
    }

    void setLocation(String loc) {
	this.location = loc;
    }
}
