package collectionsequalshash;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class RegistryCourt {

    public static void main(String[] args) {
        List<Company> companies = new ArrayList<>();
        Company company1 = new Company("Nokia", "123456");
        Company company2 = new Company("Telekom", "123456");
        Company company3 = new Company("Ericsson", "123456");
        companies.add(company1);
        companies.add(company2);
        companies.add(company3);
        System.out.println(companies.contains(new Company("Nokia", "123456")));
        System.out.println(companies.contains(new Company("Telekom", "123456")));
    }
}
