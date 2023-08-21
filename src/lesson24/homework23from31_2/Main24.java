package lesson24.homework23from31_2;

import java.util.Arrays;

/*
public class Main24 {

    public boolean removeCategory(String category) {
        int index = searchCategoryValue(category);
        if (index == -1) return false;
        String[] temp = new String[categories.length - 1];
        for (int i = 0; i < temp.length; i++) {
            if (i < index) {
                temp[i] = categories[i];
            } else {
                temp[i] = categories[i + 1];
            }
        }
        return true;
    }
    public void removeAllCategories() {
        categories = new String[0];
    }

    private int searchCategoryValue(String category) {
        if (category == null || category.length() == 0 || category.length == 0) return -1;

        for (int i = 0; i < category.length; i++) {
            if (category.equals(categories[i])) {
                return i;
            }
        }
        return -1;
    }

    public void testArrayCopy(int idx) {
        String[] strings = new String[categories.length - 1];
        if(idx < 0 || idx > categories.length - 1) return;
        System.arraycopy(categories, 0, strings, 0, idx);
        System.arraycopy(categories, idx + 1, strings, idx, strings.length - idx);

        System.out.println(Arrays.toString(strings));
    }
}
*/


