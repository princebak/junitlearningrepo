package categoriestests.implementations;

import categoriestests.services.SpeakableService;

public class FrenchSpeaker implements SpeakableService {
    public boolean speak() {
        return true;
    }

    public boolean notSpeak() {
        return false;
    }
}
