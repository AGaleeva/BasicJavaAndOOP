package lesson26.string;

public class StringApplMain {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str);
        char[] chars = {' ', 'w', 'o', 'r', 'l', 'd'};
        String str1 = new String(chars);
        System.out.println(str1);
        str = str + str1; // Операция конкатенации строк, но есть специальный метод:
//        str = str.concat(str1); // но его специально не вызывают, а пишут как выше через "+"
        System.out.println(str);
        System.out.println(str.length()); // у стринга это метод, а у массива - поле (т.е. без скобок)
        char c = str.charAt(2);
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
        System.out.println("======================================================");
        String str2 = " WORLD";
        boolean check = str1.equals(str2);
        System.out.println(check);
        check = str1.equalsIgnoreCase(str2);
        System.out.println(check);

        int index = str.indexOf('l');
        System.out.println(index);
        index = str.indexOf("lo");
        System.out.println(index);
        index = str.indexOf('l',5);
        System.out.println(index);
        index = str.lastIndexOf('l');
        System.out.println(index);
        index = str.indexOf("lo", 5);
        System.out.println(index);
        System.out.println(str.substring(2));
        System.out.println(str.substring(2, 4));
        System.out.println(str.replace("l", "AAA"));
        System.out.println("===================================================");
        String text = "querty";
        String newText = "querty";
        check = text.equals(newText);
        System.out.println(check);
        System.out.println("========================  ===========================");
        text = "one, two, three, four, five";
        String[] arr = text.split(", ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
        System.out.println("=======================  ============================");
        String email = " John@gmail.com ";
        email = email.trim().toLowerCase();
        System.out.println(email);
    }
}
