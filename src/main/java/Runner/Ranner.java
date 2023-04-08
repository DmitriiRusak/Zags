package Runner;

import TipesOfRegistration.AdminRegistration;
import TipesOfRegistration.BirthRegistration;
import TipesOfRegistration.DethRegistration;
import TipesOfRegistration.MariageRegistration;

public class Ranner {
    public static void main(String[] args) {

        MariageRegistration mariageRegistration=new MariageRegistration();
        mariageRegistration.createMariageRequest();

        BirthRegistration birthRegistration=new BirthRegistration();
        birthRegistration.createBirthRequest();

        DethRegistration dethRegistration=new DethRegistration();
        dethRegistration.createDethRequest();

        AdminRegistration adminRegistration=new AdminRegistration();
        adminRegistration.createAdminRegistration();
    }
}
