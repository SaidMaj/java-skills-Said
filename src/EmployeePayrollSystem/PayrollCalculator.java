public class PayrollCalculator {
    /*
    * I have creaated this function to count each employee
    * starting by multiplying hoursWorked by hourlyRate
    * in caase in of them were less than 0 zero will be returned
    * then I have created a switch
    * */

    public static double calculateWeeklyPay(String employeeType, double hoursWorked, double hourlyRate) {

        double salary = hoursWorked * hourlyRate;

        if (salary <= 0.0)
        {
            System.out.println("In valid input entered ");
            return 0.0;
        }

        switch (employeeType)
        {
            case "FULL_TIME":

                if (hoursWorked > 40.0)
                {
                    return (hoursWorked * hourlyRate) * 1.5;
                }
                else
                {
                    return salary;
                }

            case "PART_TIME":
            case "CONTRACTOR":
                return salary;

            case "INTERN":
                return  salary * (1 -  0.2);

            default:
                System.out.println("Invalid Employee Type");
        }

        return  0.0;
    }

    public static double calculateTaxDeduction(double grossPay, boolean hasHealthInsurance)
    {
        if (hasHealthInsurance)
        {
            grossPay -= 50;
        }

        if (grossPay >= 0 && grossPay <= 500) {
            return grossPay * (1 + 0.1);
        }

        else if (grossPay > 500 && grossPay <= 1000) {
            return grossPay * (1 + 0.15);
        }

        else if (grossPay > 1000 && grossPay <= 2000) {
            return grossPay * (1 + 0.2);
        }

        else if (grossPay > 2000) {
            return grossPay * (1 + 0.25);
        }

        return 0.0;
    }

    public static int findHighestPaidEmpolyee(Double[] employeeSalaries)
    {
        double highestSalary = employeeSalaries[0];
        int index = 0;

        for (int i = 0; i < employeeSalaries.length ; i++){

            if (highestSalary < employeeSalaries[i]){
                index  = i;
                highestSalary = employeeSalaries[i];
            }

        }

        return index;
    }

    public static int findLowestPaidEmpolyee(Double[] employeeSalaries)
    {
        double lowestsalary = employeeSalaries[0];
        int index = 0;

        for (int i = 0; i < employeeSalaries.length ; i++){

            if (lowestsalary > employeeSalaries[i])
            {
                index  = i;
                lowestsalary = employeeSalaries[i];
            }

        }

        return index;
    }

    public static String addTab(String word, int requiredLength)
    {

        return word + " ".repeat(Math.abs(requiredLength - word.length()));
    }

    public static double sumOfArray(Double[] Array) {
        double sum = 0;

        for (int i = 0; i < Array.length; i++)
        {
            sum += Array[i];
        }

        return sum;
    }

    public static int countNumberOfOverTimeEmployees(double[] hours) {
        int numberOfOverTimeEmployees = 0;

        for (double i  : hours)
        {
            if (i > 40)
            {
                numberOfOverTimeEmployees++;
            }
        }

        return numberOfOverTimeEmployees;
    }

    public static void displayInfo(String highestPaidEmployee, String lowestPaidEmployee, double averagePay, int numberOfOverTimeEmployees)
    {
        System.out.println("====================== Formated Table ======================");

        System.out.println(" _______________________________________________________________________________________________________________________________");
        System.out.println("|Highest Paid Employee              |Lowest Paid Employee              |Average Salary      |Total Number of Over Time Employee|");
        System.out.println("|___________________________________|__________________________________|____________________|__________________________________|");
        System.out.print("|" + addTab(highestPaidEmployee, 35)  + "|" + addTab(lowestPaidEmployee, 34) + "|" + addTab( String.valueOf(averagePay) , 20)  +  "|");
        System.out.println(addTab(String.valueOf(numberOfOverTimeEmployees), 34) + "|");
        System.out.println("|______________________________________________________________________________________________________________________________|");


    }

    public static void processPayroll(String[] employeeTypes, double[] hours,
                                      double[] rates, String[] names) {

        String highestPaidEmployee, lowestPaidEmployee;
        double averagePay;
        int numberOfEmployeeWorkedOverTime;

        Double[] employeeSalaries = new Double[names.length];

        if (  names.length !=  hours.length || rates.length != employeeTypes.length  )
        {
            System.out.println("Array Sizes are not equal so we Can't Perform the calculation");
        }

        else
        {
            for (int i = 0; i < names.length; i++) {
                employeeSalaries[i] = calculateWeeklyPay(employeeTypes[i], hours[i], rates[i]);
            }

            highestPaidEmployee = names[findHighestPaidEmpolyee(employeeSalaries)];
            lowestPaidEmployee = names[findLowestPaidEmpolyee(employeeSalaries)];
            averagePay = sumOfArray(employeeSalaries) / employeeSalaries.length;
            numberOfEmployeeWorkedOverTime = countNumberOfOverTimeEmployees(hours);

            displayInfo(highestPaidEmployee, lowestPaidEmployee, averagePay, numberOfEmployeeWorkedOverTime);
        }
    }

}
