package categoriestests.implementations;

import categoriestests.services.SingableService;

public class RnbSinger implements SingableService {
    public boolean sing() {
        return true;
    }

    public boolean notSing() {
        return false;
    }
}
