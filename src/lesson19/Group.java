package lesson19;

public class Group {

    private String name;
    private Student[] arr = new Student[4];

    public Group(String name) {
        this.name = name;
    }

    private int size = 0;

    public void addStudent(Student element) {
        if (size >= arr.length) {
            increaseArray();
        }
        arr[size] = element;
        size++;
    }

    private void increaseArray() {
        Student[] tempArray = new Student[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            tempArray[i]=arr[i];
        }
        arr = tempArray;
    }

    public String toString() {
        String res = name + " [\n";
        for (int i = 0; i < size; i++) {
            res += ((i == 0) ? "" : " ") + arr[i] + "\n";
        }
        res += "]";

        return res;
    }
    public Student[] getGroupAsArray(){
        Student[] tempArray = new Student[arr.length];
        for (int i=0; i<arr.length;i++){
            tempArray[i]=arr[i];
        }
        return tempArray;
    }
}
