package practice.observer;

public class Driver {
    public static void main(String[] args) {
        Office iitoffice = new Office();

        new Student(iitoffice);
        new Teacher(iitoffice);
        new Staff(iitoffice);

        iitoffice.setNews("IIT FAMILY PICNIC SOON");
    }
}
