public class StudentChart {
    String name;
    public StudentChart(String s) {
        name = s;
    }
    public StudentChart() {
        name = "Unknown";
    }
}
class Student{
    public static void main(String[] args){
        StudentChart s =new StudentChart( "Dytto");
        StudentChart a =new StudentChart();
        System.out.println(s.name);
        System.out.println(a.name);
    }
}