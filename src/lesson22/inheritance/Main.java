package lesson22.inheritance;

public class Main {
    public static void main(String[] args) {

//        Programmer p1 = new Programmer("Jack", 5000);
        Employee p1 = new Programmer("Jack", 5000);
//        Programmer p2 = new Programmer("Nick", 3000);
        Employee p2 = new Programmer("Nick", 3000);
        Programmer p3 = new Programmer("Nick", 3000);

//        QAEngineer q1 = new QAEngineer("Ann", 4000);
        Employee q1 = new QAEngineer("Ann", 4000);
//        QAEngineer q2 = new QAEngineer("Sten", 5500);
        Employee q2 = new QAEngineer("Sten", 5500);

//        SupportEngineer s1 = new SupportEngineer("Lena", 4200);
        Employee s1 = new SupportEngineer("Lena", 4200);

        p1.work();
        p1.paidSalary();

        q1.work();

        s1.paidSalary();
        s1.work();

        System.out.println("===================================================");

        p3.writeCode();

        ((Programmer)p1).writeCode();  // Можно вызвать через "приведение типов", но надо быть четко уверенным,
                                       // что переменная (здесь, р1) содержит именно программиста.

        System.out.println("===================================================");

        Employee[] employees = {p1, p2, q1, q2, s1}; // теперь можно создать массив из условно разнотипных переменных
        for (Employee e : employees) {
            e.work();
        }

        System.out.println("===================================================");

    }
}
