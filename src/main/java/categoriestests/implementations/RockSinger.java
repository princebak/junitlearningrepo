package categoriestests.implementations;

import categoriestests.services.SingableService;

public class RockSinger implements SingableService {
    public boolean sing() {
        return true;
    }

    public boolean notSing() {
        return false;
    }
}
