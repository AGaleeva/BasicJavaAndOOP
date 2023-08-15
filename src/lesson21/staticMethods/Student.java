package lesson21.staticMethods;

public class Student {
    private static int questionsCounter;
    private String name;
    private static int[] arr;

    static {                       // static надо добавить, если то, что мы инициализируем тоже статическое
//        arr = new int[3];
//        arr[0] = 5;
//        arr[1] = 5;
//        arr[2] = 5;

        questionsCounter = 0; // блок инициализации, выполняется до конструктора. Система сама добавит его в конструкторю
                              // но можно инициализировать и в поле, где задали переменную
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student " + name;
    }

    public void askQuestion() {
        questionsCounter++;
        System.out.println(name + " asked the question " + questionsCounter);
    }
}
