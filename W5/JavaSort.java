import java.util.*;

class Student {
    int id;
    String name;
    double cgpa;

    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
}

class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student x, Student y) {
        if (Double.compare(y.cgpa, x.cgpa) != 0)
            return Double.compare(y.cgpa, x.cgpa);
        if (!x.name.equals(y.name))
            return x.name.compareTo(y.name);
        return Integer.compare(x.id, y.id);
    }
}

public class JavaSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Student> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            double cgpa = sc.nextDouble();
            list.add(new Student(id, name, cgpa));
        }
        Collections.sort(list, new StudentComparator());
        for (Student s : list) {
            System.out.println(s.name);
        }
    }
}
