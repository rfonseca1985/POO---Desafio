public class Desafio {
    // Interface ReprodutorMusical
public interface ReprodutorMusical {
    void play();
    void pause();
    void nextTrack();
    void previousTrack();
}

// Interface AparelhoTelefonico
public interface AparelhoTelefonico {
    void makeCall(String phoneNumber);
    void receiveCall(String callerName);
    void endCall();
}

// Interface NavegadorInternet
public interface NavegadorInternet {
    void openURL(String url);
    void browse();
    void closeBrowser();
}

// Classe iPhone implementando as interfaces
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private int batteryLevel;
    private String modelName;

    // Construtor
    public iPhone(String modelName) {
        this.modelName = modelName;
        this.batteryLevel = 100; // Inicializa com 100% de bateria
    }

    // Métodos específicos para controle do iPhone
    public void checkBatteryLevel() {
        System.out.println("Battery Level: " + batteryLevel + "%");
    }

    // Implementação dos métodos das interfaces
    @Override
    public void play() {
        System.out.println("Playing music...");
    }

    @Override
    public void pause() {
        System.out.println("Pausing music...");
    }

    @Override
    public void nextTrack() {
        System.out.println("Playing next track...");
    }

    @Override
    public void previousTrack() {
        System.out.println("Playing previous track...");
    }

    @Override
    public void makeCall(String phoneNumber) {
        System.out.println("Calling " + phoneNumber + "...");
    }

    @Override
    public void receiveCall(String callerName) {
        System.out.println("Incoming call from " + callerName + "...");
    }

    @Override
    public void endCall() {
        System.out.println("Ending the call...");
    }

    @Override
    public void openURL(String url) {
        System.out.println("Opening URL: " + url);
    }

    @Override
    public void browse() {
        System.out.println("Browsing the internet...");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the browser...");
    }
}

}
