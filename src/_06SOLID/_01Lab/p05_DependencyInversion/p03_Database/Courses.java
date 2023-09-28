package _06SOLID._01Lab.p05_DependencyInversion.p03_Database;

public class Courses {

    private Data database;

    private void init() {
        database = new Data();
    }

    public void printAll() {
        Iterable<String> courses = database.courseNames();
    }

    public void printIds() {
        Iterable<Integer> coursesIds = database.courseIds();
    }

    public void printById(int id) {
        String course = database.getCourseById(id);
    }

    public void search(String substring) {
    }
}
