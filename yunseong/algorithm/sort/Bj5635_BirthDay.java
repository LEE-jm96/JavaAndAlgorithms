package algorithm.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Bj5635_BirthDay {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        List<Birthday> arr = new ArrayList<Birthday>();
        for (int i = 0; i < num; i++) {
            Birthday my = new Birthday();
            my.name = sc.next();
            my.day = Integer.parseInt(sc.next());
            my.month = Integer.parseInt(sc.next());
            my.year = Integer.parseInt(sc.next());

            arr.add(my);
        }

        arr.sort(Comparator.naturalOrder());
        System.out.println(arr.get(0));
        System.out.println(arr.get(arr.size() - 1));

    }
}

class Birthday implements Comparable<Birthday> {
    String name;
    int month;
    int day;
    int year;

    public Birthday(String name, int month, int day, int year) {
        this.name = name;
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public Birthday() {
        // TODO Auto-generated constructor stub
    }

    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Birthday o) {
        if (o.year > this.year) {
            return 1;
        } else if (o.year < this.year) {
            return -1;
        } else if (o.month > this.month) {
            return 1;
        } else if (o.month < this.month) {
            return -1;
        } else if (o.day > this.day) {
            return 1;
        }
        return -1;
    }
}
