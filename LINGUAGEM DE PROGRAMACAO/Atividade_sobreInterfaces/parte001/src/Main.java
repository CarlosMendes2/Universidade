import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static final Random RANDOM = new Random();
    public static final int NAVEALIENIGENA = 1;
    public static final int GALINHAVOADORA = 2;
    public static final int DRONE = 3;
    public static final int QTMAXOBJETOSVOADORES = 10;
    public static void main(String[] args) {
        List<Voador> armazenaVoadores = new ArrayList<>();
        do {
            int tipoVoador = gera123();
            switch (tipoVoador){
                case NAVEALIENIGENA:
                    Voador nave = new NaveAlienigena("Redonda");
                    armazenaVoadores.add(nave);
                    break;
                case GALINHAVOADORA:
                    Voador galinha = new GalinhaVoadora();
                    armazenaVoadores.add(galinha);
                    break;
                case DRONE:
                    Voador drone = new Drone("bom");
                    armazenaVoadores.add(drone);
                    break;
            }
        }while (armazenaVoadores.size()< QTMAXOBJETOSVOADORES);

        for (Voador objVoador: armazenaVoadores){
            objVoador.voar();  // Chamada polifórmica
            objVoador.planar(); // Chamada polifórmica
            objVoador.pousar(); // Chamada polifórmica
        }
    }

    public static int gera123(){
        return RANDOM.nextInt(1,4);
    }



}
