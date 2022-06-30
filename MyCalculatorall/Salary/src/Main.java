public class Main {
    public static void main(String[] args) {
      int baseSalary=50_000;
      int extraHours=10;
      int hourlyRate=20;
Employee employee=new Employee();


      int  wage=employee.calculateWage(extraHours);
        System.out.println(wage);
    }



}