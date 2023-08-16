package lesson20.homeworkPrevFromL19.numbers;

public class NumbersHandler {

    private SmartArray numbers;

    public NumbersHandler(SmartArray numbers) {
        this.numbers = numbers;
    }

    public int getQuantity() {
        int size = numbers.getArray().length;
        return size;
    }

    public double calcAVG() {
        int[] array = numbers.getArray();
        double sum = 0;
        for (int val : array) {
            sum += val;
        }
        return sum / getQuantity();
    }

    public void printStat() {
        System.out.println("Size: " + getQuantity());
        System.out.println("The average value: " + calcAVG());
    }

}
