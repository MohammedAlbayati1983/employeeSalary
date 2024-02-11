public class Main {
    public static void main(String[] args) {
        //employee 1
        double baseSalary1 = 30000;
        double bounsHour1 = 15;
        double salse1 = 20000;

        calculateNetSalary(1, baseSalary1, bounsHour1);
        calculateTarget(salse1);
        //employee 2
        double baseSalary2 = 10000;
        double bounsHour2 = 10;
        double salse2 = 7000;

        calculateNetSalary(2, baseSalary2, bounsHour2);
        calculateTarget(salse2);
    }

    public static void calculateNetSalary(int id, double baseSalary, double bounsHour) {
        double taxPercent = .02;
        if (baseSalary >= 30000) {
            taxPercent = .05;
        }
        double taxes = baseSalary * taxPercent;
        double incentivePerHour = 50;
        double incentive = incentivePerHour * bounsHour;
        if (bounsHour >= 15) {
            incentive += 500;
        }
        double netSalary = baseSalary - taxes + incentive;
        printDetails(id, baseSalary, taxes, incentive, netSalary);
    }

    public static void printDetails(int id, double baseSalary, double taxes, double incentive, double netSalary) {
        System.out.println("Salary Details for employee "
                + id + ":-" + "\nYour base salary:" + baseSalary
                + "\nTaxes:" + taxes + "\nSalary after taxes:"
                + (baseSalary - taxes) + "\nIncentive:" + incentive
                + "\n-----------------------" + "\nNet salary:" + (int) netSalary
                + "\n-----------------------" + "\nTarget details:-");
    }

    public static void calculateTarget(double sales) {

        double targetPercent = .05;
        double salesTarget = sales;
        for (int i = 1; i <= 12; i++) {
            System.out.println("month " + i + " : " + (int) salesTarget);
            salesTarget = sales + (sales * targetPercent);
            sales = salesTarget;
        }
    }
}

