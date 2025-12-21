package MenyederhanakanKondisional.sesudah;

public class Main {
    public static void main(String[] args) {
        int score = 800;
        int income = 100000;
        boolean authorized = true;

        if ((score <= 700) && ((income < 40000) || (income > 100000) || !authorized || (score <= 500)) && (income <= 100000)) reject();
        else accept();
    }

    public static void accept() {
        System.out.println("You are accepted!");
    }

    public static void reject() {
        System.out.println("You are rejected!");
    }
}
