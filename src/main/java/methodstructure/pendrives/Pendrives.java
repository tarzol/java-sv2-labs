package methodstructure.pendrives;
//Metódusok
import java.util.ArrayList;
import java.util.List;

public class Pendrives {

    public Pendrive getBest(List<Pendrive> pendriveList) {
        Pendrive min = pendriveList.get(0);

        for (int i= 0; i<pendriveList.size(); i++ ) {
            if (min.comparePricePerCapacity(pendriveList.get(i)) == 1) {
                min = pendriveList.get(i);
            }
        }
        return min;
    }

    public Pendrive getCheapest(List<Pendrive> pendriveList) {
        Pendrive min = pendriveList.get(0);
        for ( int i= 0; i< pendriveList.size(); i++) {
            if (pendriveList.get(i).isCheaperThan(min)) {
                min = pendriveList.get(i);
            }
        }
        return min;
    }

    public void risePriceWhereCapacity(List<Pendrive> pendriveList, int percent, int capacity) {
        for ( int i=0; i<pendriveList.size(); i++) {
            if( pendriveList.get(i).getCapacity() == capacity ) {
                pendriveList.get(i).risePrice(percent);
            }
        }
    }

    public static void main(String[] args) {
        Pendrive pendrive1 = new Pendrive("Kingston64", 64, 3000);
        Pendrive pendrive2 = new Pendrive("Kingston128", 128, 5000);
        Pendrive pendrive3 = new Pendrive("Kingston256", 256, 8000);
        List<Pendrive> pendriveList = new ArrayList<>();
        Pendrives pendrives = new Pendrives();
        pendriveList.add(pendrive1);
        pendriveList.add(pendrive2);
        pendriveList.add(pendrive3);

        pendrives.risePriceWhereCapacity(pendriveList,40, 64);
        System.out.println("Új ár: "+pendriveList.get(0).getPrice());
        System.out.println("Legolcsóbb: "+pendrives.getCheapest(pendriveList).getName());
        System.out.println("Legjobb ár/érték arány: "+pendrives.getBest(pendriveList).getName());
        System.out.println("Legjobb ár/érték arány: "+pendrives.getBest(pendriveList).toString());
    }
}
