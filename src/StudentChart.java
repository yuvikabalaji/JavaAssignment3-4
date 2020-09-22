public class StudentChart {
    String name;
    int roll;
    public StudentChart(String s, int i) {
        name = s;
        roll = i;
    }
    public StudentChart() {
        name = "Unknown";
        roll = 0;
    }
}
class Student{
    public static void main(String[] args){
        StudentChart s =new StudentChart("Dytto", 4);
        StudentChart a =new StudentChart();
        System.out.println(s.name+" "+s.roll);
        System.out.println(a.name+" "+a.roll);
    }
}