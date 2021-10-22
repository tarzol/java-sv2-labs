package array;

public class ArrayMain {

    public static void main(String[] args) {
        String[] array = {"hétfő", "kedd", "szerda", "csűtörtök", "péntek", "szombat", "vasárnap"};
        int[] kettoHatvany = new int[5];
        Boolean[] trueAndFalse = new Boolean[6];

        System.out.println("A hét második napja: "+array[1]);
        System.out.println("A tömb hossza: "+array.length);

        kettoHatvany[0] = 1;
        System.out.print(kettoHatvany[0]+" ");
        for(int i = 1; i < 5 ; i++) {
            kettoHatvany[i] = 2*kettoHatvany[i-1];
            System.out.print(kettoHatvany[i]+" ");
        }

        trueAndFalse[0] = false;
        System.out.print(trueAndFalse[0]+" ");
        for (int i = 1; i < 6 ; i++) {
            trueAndFalse[i] = !trueAndFalse[i-1];
            System.out.print(trueAndFalse[i]+" ");
        }
    }
}
