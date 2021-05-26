package aula04;

public class Televisor {

    private int canal;
    private int volume;

    public void setCanal(int canal) {
        if (canal >= 1 && canal <= 125) {
            this.canal = canal;
        } else {
            this.canal = 10;
        }
    }

    public int getCanal() {
        return this.canal;
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        }
    }

    public int getVolume() {
        return this.volume;
    }

    public void aumentarVolume() {
        setVolume(getVolume() + 1);
        System.out.println("Volume: " + this.volume);
    }

    public void diminuirVolume() {
        setVolume(getVolume() - 1);
        System.out.println("Volume: " + this.volume);
    }
    
    public void trocarCanal(int canal){
        setCanal(canal);
        System.out.println("Canal: " + this.canal);
    }

}
