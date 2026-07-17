package JavaCollectionFramework;

public class studentCandComparator implements Comparable<studentCandComparator> {
    public int age;
    public String name;
    public int weight;

    // Constructor Creating
    public studentCandComparator(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    // Getter and Setter Method
    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", weight=" + weight + "}";
    }

    @Override
    public int compareTo(studentCandComparator that) {
        // this method is called for current object
        // We will define a sorting logic
        // sort based on age

        // return Integer.compare(this.age, that.age);
        if (this.age == that.age) {
            return this.name.compareTo(that.name);
        }
        return Integer.compare(that.age, this.age);
    }

}
