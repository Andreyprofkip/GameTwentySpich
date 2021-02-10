public class SimpleMessenger implements Messenger {

    @Override
    public void startGame() {
        System.out.println("Добро пожаловать в игру \"20 спичек\" \nВведите число 1, 2 или 3\n" +
                "Проиграет тот, у кого останется последняя спичка ");
    }

    @Override
    public String nepravPlayerMover() {
        return "Вы ввели неправильное число. Введите число 1, 2 или 3";
    }

    @Override
    public String computerMove(Integer a) {
        return "Компьютер забрал спичек : " + a.toString();
    }

    @Override
    public String playerMove(Integer a) {
        return "Вы ввели число :" + a.toString() ;
    }

    @Override
    public void ostatok(Integer a)
    {
        System.out.println("Осталось спичек : " + a.toString());
    }

    @Override
    public void inputNumber() {
        System.out.println("Введите число 1,2 или 3 : ");
    }

    @Override
    public void GameOver()
    {
        System.out.println("Конец игры! У вас осталась последняя спичка! Победил компьютер! ");
    }
}
