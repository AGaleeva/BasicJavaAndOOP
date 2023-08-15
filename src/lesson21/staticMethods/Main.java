package lesson21.staticMethods;

public class Main {

    final static int a = 10;
    final static int[] arr = {10, 12, 13}; // нельзя изменить ссылку: т.е. мы не можем
                                           // присвоить другой массив, но значения в массиве
                                           // мы поменять можем: arr[0] = 15
    public static void main(String[] args) {

        Student[] students = {
                new Student("Jack"),
                new Student("John"),
                new Student("Paul"),
                new Student("Ann"),
                new Student("Lena"),
                new Student("Stan"),
                new Student("Rick"),
        };

        for (Student st : students) {
            st.askQuestion();
        }

        students[1].askQuestion();
        students[1].askQuestion();


    }
}
