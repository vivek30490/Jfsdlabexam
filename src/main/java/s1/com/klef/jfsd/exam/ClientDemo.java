package s1.com.klef.jfsd.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClientDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Vehicle.class).addAnnotatedClass(Car.class).addAnnotatedClass(Truck.class).buildSessionFactory();
        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();

            // Create Vehicle, Car, and Truck objects
            Car car = new Car();
            car.setName("Sedan");
            car.setType("Car");
            car.setMaxSpeed(200);
            car.setColor("Red");
            car.setNumberOfDoors(4);

            Truck truck = new Truck();
            truck.setName("Freightliner");
            truck.setType("Truck");
            truck.setMaxSpeed(120);
            truck.setColor("Blue");
            truck.setLoadCapacity(10000);

            // Save the objects
            session.save(car);
            session.save(truck);

            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}
