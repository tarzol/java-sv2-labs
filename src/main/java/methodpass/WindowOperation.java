package methodpass;

import java.util.ArrayList;
import java.util.List;

public class WindowOperation {

    public void riseSize(List<Window> windows, int plusSize) {
        for (int i= 0; i< windows.size(); i++) {
            windows.get(i).setHeight(windows.get(i).getHeight()+plusSize);
            windows.get(i).setWidth(windows.get(i).getWidth()+plusSize);
        }
    }

    public static void main(String[] args) {
        List<Window> windowList = new ArrayList<>();
        Window bathWindow = new Window("Bathroom", 100, 150);
        Window kitchenWindow = new Window("Kitchen", 80, 120);
        Window livingRoomWindow = new Window("Livingroom", 100, 150);

        windowList.add(bathWindow);
        windowList.add(kitchenWindow);
        windowList.add(livingRoomWindow);
        WindowOperation windowOperation = new WindowOperation();
        windowOperation.riseSize(windowList, 30);
        System.out.println("Helyiség neve: "+windowList.get(0).getRoomName()+
                " szélesség"+windowList.get(0).getWidth()+" magasság: "+windowList.get(0).getHeight());
        System.out.println("Helyiség neve: "+windowList.get(1).getRoomName()+
                " szélesség"+windowList.get(1).getWidth()+" magasság: "+windowList.get(1).getHeight());
        System.out.println("Helyiség neve: "+windowList.get(2).getRoomName()+
                " szélesség"+windowList.get(2).getWidth()+" magasság: "+windowList.get(2).getHeight());
    }
}
