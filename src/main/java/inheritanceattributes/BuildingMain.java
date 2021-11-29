package inheritanceattributes;

public class BuildingMain {
    public static void main(String[] args) {
        Building building = new Building("A épület", 120, 2);
        SchoolBuilding school = new SchoolBuilding("B épület", 200, 4, 22 );

        System.out.println(building.name);
        System.out.println(building.area);
        System.out.println(building.getFloors());

        System.out.println(school.getNumberOfClassRooms());
        System.out.println(school.name+" "+school.area+" "+school.getFloors()+" "+school.getNumberOfClassRooms());
    }
}
