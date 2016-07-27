package in.voiceme.app.voiceme.services;

import in.voiceme.app.voiceme.infrastructure.VoicemeApplication;

public class Module{

    public static void register(VoicemeApplication application) {
        new InMemoryAccountService(application);
    }

}