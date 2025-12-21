public class Assignment {
    private double mark;
    private double weight;
    private String name;

    public Assignment() {
    }

    public Assignment(String name, double mark, double
            weight) {
        this.name = name;
        this.mark = mark;
        this.weight = weight;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}