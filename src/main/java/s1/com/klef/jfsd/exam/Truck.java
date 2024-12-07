package s1.com.klef.jfsd.exam;


import javax.persistence.Entity;

@Entity
public class Truck extends Vehicle {
	private int loadCapacity;

    public int getLoadCapacity() {
		return loadCapacity;
	}

	public void setLoadCapacity(int loadCapacity) {
		this.loadCapacity = loadCapacity;
	}


}

