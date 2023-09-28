package _03Inheritance._02Exercise._06Animals;

public abstract class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    private void setName(String name) {
        ensureNameAndGender(name);

        this.name = name;
    }

    private void setAge(int age) {
        if(age < 0) {
            throw new IllegalStateException("Invalid input!");
        }

        this.age = age;
    }

    private void setGender(String gender) {
        ensureNameAndGender(gender);

        if(!gender.equals("Male") && !gender.equals("Female")) {
            throw new IllegalStateException("Invalid input!");
        }

        this.gender = gender;
    }

    private static void ensureNameAndGender(String input) {
        if(input.trim().isEmpty()) {
            throw new IllegalStateException("Invalid input!");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    protected abstract String produceSound();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(getClass().getSimpleName())
                .append(System.lineSeparator())
                .append(String.format("%s %d %s", name, age, gender))
                .append(System.lineSeparator())
                .append(produceSound());

        return sb.toString();
    }
}
