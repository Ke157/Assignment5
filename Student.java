import java.util.LinkedList;

/**
 * @program: homework_assignment_5
 * @filename: Student.java
 * @author: Ke Chen
 * @date: 2020/10/10
 **/
public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private float gpa;
    private String major;
    private String department;
    private LinkedList<Course> courses;

    public Student(String firstName, String lastName, int age, float gpa, String major, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gpa = gpa;
        this.major = major;
        this.department = department;
        courses = new LinkedList<Course>();
    }

    void addCourse(Course course) {
        courses.add(course);
    }

    void removeCourse(String name) {
        for (int i = 0; i < courses.size(); i++) {
            if (name.equals(courses.get(i).getName())) {
                courses.remove(i);
                return;
            }
        }
    }

    void sortCourses(boolean ascending, String attr) {
        int i, j, n = courses.size();
        for (i = 0; i < n; i++) {
            for (j = 1; j < n - i; j++) {
                if (ascending) {
                    if (attr.equals("name") && courses.get(j - 1).getName().compareTo(courses.get(j).getName()) > 0) {
                        Course temp = courses.get(j - 1);
                        courses.set(j - 1, courses.get(j));
                        courses.set(j, temp);
                    }
                    if (attr.equals("description") && courses.get(j - 1).getName().compareTo(courses.get(j).getName()) > 0) {
                        Course temp = courses.get(j - 1);
                        courses.set(j - 1, courses.get(j));
                        courses.set(j, temp);
                    }
                    if (attr.equals("department") && courses.get(j - 1).getDepartment().compareTo(courses.get(j).getDepartment()) > 0) {
                        Course temp = courses.get(j - 1);
                        courses.set(j - 1, courses.get(j));
                        courses.set(j, temp);
                    }
                    if (attr.equals("start") && courses.get(j - 1).getStart().compareTo(courses.get(j).getStart()) > 0) {
                        Course temp = courses.get(j - 1);
                        courses.set(j - 1, courses.get(j));
                        courses.set(j, temp);
                    }
                    if (attr.equals("weekday") && courses.get(j - 1).getWeekday().compareTo(courses.get(j).getWeekday()) > 0) {
                        Course temp = courses.get(j - 1);
                        courses.set(j - 1, courses.get(j));
                        courses.set(j, temp);
                    }
                } else {
                    if (attr.equals("name") && courses.get(j - 1).getName().compareTo(courses.get(j).getName()) < 0) {
                        Course temp = courses.get(j - 1);
                        courses.set(j - 1, courses.get(j));
                        courses.set(j, temp);
                    }
                    if (attr.equals("description") && courses.get(j - 1).getName().compareTo(courses.get(j).getName()) < 0) {
                        Course temp = courses.get(j - 1);
                        courses.set(j - 1, courses.get(j));
                        courses.set(j, temp);
                    }
                    if (attr.equals("department") && courses.get(j - 1).getDepartment().compareTo(courses.get(j).getDepartment()) < 0) {
                        Course temp = courses.get(j - 1);
                        courses.set(j - 1, courses.get(j));
                        courses.set(j, temp);
                    }
                    if (attr.equals("start") && courses.get(j - 1).getStart().compareTo(courses.get(j).getStart()) < 0) {
                        Course temp = courses.get(j - 1);
                        courses.set(j - 1, courses.get(j));
                        courses.set(j, temp);
                    }
                    if (attr.equals("weekday") && courses.get(j - 1).getWeekday().compareTo(courses.get(j).getWeekday()) < 0) {
                        Course temp = courses.get(j - 1);
                        courses.set(j - 1, courses.get(j));
                        courses.set(j, temp);
                    }
                }
            }
        }
        for (Course c: courses){
            System.out.println(c);
        }

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public LinkedList<Course> getCourses() {
        return courses;
    }

    public void setCourses(LinkedList<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                ", major='" + major + '\'' +
                ", department='" + department + '\'' +
                ", courses=" + courses +
                '}';
    }

    public static void main(String[] args) {
        Course course = new Course("CS151", "Object Oriented Design and Programming", "CS", "6:00pm", "Mon.");
        Course course2 = new Course("CS152", "Object Oriented Design and Programming2", "CS", "6:00pm", "Wed.");
        Course course3 = new Course("CS153", "Object Oriented Design and Programming3", "CS", "6:00pm", "Fri.");
        Course course4 = new Course("CS154", "Object Oriented Design and Programming4", "CS", "6:00pm", "Thur.");
        Student student = new Student("John", "Smith", 20, (float) 3.6, "Computer Science major", "School of Computer Science department");
        student.addCourse(course);
        student.addCourse(course2);
        student.addCourse(course3);
        student.addCourse(course4);
        student.removeCourse("CS154");
        student.sortCourses(false, "name");
    }
}
