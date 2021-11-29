package inheritancemethods.plane;

public class Plane {
    public static void main(String[] args) {
        Passenger normalPassenger = new Passenger("Zoli",50000);
        PriorityPassenger priorityPassenger = new PriorityPassenger("Béla",50000, 20);
        FirstClassPassenger firstClassPassenger = new FirstClassPassenger("Ariel",50000, 20 );
        System.out.println("Egyszerű utas: "+normalPassenger.name+"  "+normalPassenger.priceOfPlaneTicket);
        System.out.println("Priority utas: "+priorityPassenger.name+" "+priorityPassenger.getPriceOfPlaneTicket());
        System.out.println("First class utas: "+firstClassPassenger.name+" "+firstClassPassenger.getPriceOfPlaneTicket());
    }
}
