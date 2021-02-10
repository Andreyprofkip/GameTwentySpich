

public class SimpleMoveComputer implements MoveComputer{
    SimpleMessenger simpleMessenger = new SimpleMessenger();
    Integer firstMove = 1;
    Integer numberFromComputer = 0;

    public Integer getNumberFromComputer() {
        if (firstMove == 1) {
            firstMove --;
            numberFromComputer =3;
            System.out.println(simpleMessenger.computerMove(numberFromComputer));
            return  numberFromComputer;
        }
        numberFromComputer = 4 - SimpleMovePlayer.numberFromPlayer;
        System.out.println(simpleMessenger.computerMove(numberFromComputer));
        return numberFromComputer;
    }
}
