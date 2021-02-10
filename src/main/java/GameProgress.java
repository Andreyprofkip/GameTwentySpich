

public class GameProgress {
    public static void main(String[] args) {
        SimpleMovePlayer movePlayer = new SimpleMovePlayer();
        SimpleMoveComputer moveComputer = new SimpleMoveComputer();
        SimpleMessenger simpleMessenger = new SimpleMessenger();
        Integer ostalos = 20;
        Integer MoveFromPlayer = 0;


        simpleMessenger.startGame();
        while (ostalos > 0) {
            ostalos = ostalos - moveComputer.getNumberFromComputer();
            simpleMessenger.ostatok(ostalos);
            if (ostalos == 1) {
                break;
            }
            simpleMessenger.inputNumber();
            MoveFromPlayer = movePlayer.getNumberFromPlayer();
            ostalos = ostalos - MoveFromPlayer;
            simpleMessenger.ostatok(ostalos);
        }
        simpleMessenger.GameOver();

    }
}

