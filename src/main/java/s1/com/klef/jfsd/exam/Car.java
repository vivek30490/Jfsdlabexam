package s1.com.klef.jfsd.exam;


import javax.persistence.Entity;

@Entity
public class Car extends Vehicle {
    private int numberOfDoors;

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

}
