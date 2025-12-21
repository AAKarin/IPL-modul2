package MenyederhanakanKondisional.sebelum;

public class Main {
    public static void main(String[] args) {
        int score = 800;
        int income = 100000;
        boolean authorized = true;

        if (score > 700) accept();
        else if ((income >= 40000) && (income <= 100000)
                && authorized && (score > 500)) accept();
        else if (income > 100000) accept();
        else reject();
    }

    public static void accept() {
        System.out.println("You are accepted!");
    }

    public static void reject() {
        System.out.println("You are rejected!");
    }
}
