interface MariaSalary {
    double salaryToPay(double hours, double rate);

    default double salaryForOverTime(double overtime, double rate)

    {
        return 1;
    }

    static int bonusMaria(int yearsOfExperience)
    {
        if (yearsOfExperience > 5) {
            return 100;
        } else {
            return 0;
        }

    }
}