package algorithmsmax.temperature;

import java.util.Arrays;
import java.util.List;

public class Temperature {
    public  Integer getMin(List<Integer> temList) {
        Integer minValue = null;
        for (Integer temp : temList) {
          if ( minValue == null || temp < minValue) {
              minValue = temp;
          }
        }
        return minValue;
    }

    public static void main(String[] args) {
        List<Integer> tempValues = Arrays.asList(-2, 4, 6, 9, -1, -5);
        Temperature temperature = new Temperature();
        Integer minValue = temperature.getMin(tempValues);
        System.out.println("Legalacsonyabb érték: "+minValue);
    }
}
