package categoriestests.implementations;

import categoriestests.services.SpeakableService;

public class EnglishSpeaker implements SpeakableService {
    public boolean speak() {
        return true;
    }

    public boolean notSpeak() {
        return false;
    }
}
