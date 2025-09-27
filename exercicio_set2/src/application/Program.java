package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> studentsCourseA = new HashSet<>();
        Set<Integer> studentsCourseB = new HashSet<>();
        Set<Integer> studentsCourseC = new HashSet<>();
        Set<Integer> totalStudents = new HashSet<>();

        System.out.print("How many students for course A? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int uId = sc.nextInt();
            studentsCourseA.add(uId);
        }

        System.out.print("How many students for course B? ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int uId = sc.nextInt();
            studentsCourseB.add(uId);
        }

        System.out.print("How many students for course C? ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int uId = sc.nextInt();
            studentsCourseC.add(uId);
        }

        totalStudents.addAll(studentsCourseA);
        totalStudents.addAll(studentsCourseB);
        totalStudents.addAll(studentsCourseC);

        System.out.println("Total students: " + totalStudents.size());

        sc.close();
    }
}
