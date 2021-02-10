import java.util.Scanner;

public class SimpleMovePlayer implements MovePlayer {
    Scanner scanner = new Scanner(System.in);
    SimpleMessenger simpleMessenger = new SimpleMessenger();
    static Integer numberFromPlayer = 0;

    public SimpleMovePlayer() {
        numberFromPlayer = this.numberFromPlayer;
    }

        @Override
    public Integer getNumberFromPlayer() {
        numberFromPlayer = scanner.nextInt();

        while (!ProverkaNumber(numberFromPlayer)) {
            System.out.println(simpleMessenger.nepravPlayerMover());
            numberFromPlayer = scanner.nextInt();
        }
        System.out.println(simpleMessenger.playerMove(numberFromPlayer));
        return numberFromPlayer;
    }

    @Override
    public Boolean ProverkaNumber(Integer a) {
        if (a == 1 || a == 2 || a == 3) {
            return true;
        } else {
            return false;
        }
    }

}



