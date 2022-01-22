public class Student{
    private String name;
    private int attendance;
    private static int totalAttendance = 0;

    public Student(String name, int lecCount) {
        this.name = name;
        this.attendance = (int)(Math.random() * lecCount);
        totalAttendance += this.attendance;
        
    }

    public int getAttendancePercent(int lecCount){
        return (int) (this.attendance * 100 / lecCount);
    }


    public static int getAvgAttendance(int lecCount, int totalStudent){
        return (int) ((totalAttendance * 100 / lecCount)*totalStudent);

    }


    public String getName(){
        return this.name;
    }

    public int getAttendance(){
        return this.attendance;
    }
}