package adarsh.I_Interfaces.A_Introduction;

public class NiceCar {
    private Engine engine;
    private Media player = new CDPlayer();

    public NiceCar() {
        engine = new PowerEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void stopMusic() {
        player.stop();
    }

public void upgrade(){
        this.engine =new ElectricEngine();
}

}
