package lambdacomparator.cloud;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Clouds {

    public CloudStorage alphabeticallyFirst(List<CloudStorage> offers ) {
        return Collections.min(offers, Comparator.comparing(CloudStorage::getProvider));
        //offers.sort(Comparator.comparing(CloudStorage::getProvider));
        //return offers.get(0);
    }

   /* public CloudStorage bestPriceForShortestPeriod(List<CloudStorage> offers) {
        return Collections.min(offers, Comparator.comparing(CloudStorage::getPeriod,
                //Comparator.comparing()))

    }

    public List<CloudStorage> worstOffers() {

    }*/
}
