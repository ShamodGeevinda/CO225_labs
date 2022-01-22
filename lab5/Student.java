public class Student{
    // private variables
    private String name;
    private int attendance;
    private static int totalAttendance = 0;

    // constructor
    public Student(String name, int lecCount) {
        this.name = name;
        this.attendance = (int)(Math.random() * lecCount);
        totalAttendance += this.attendance;
        
    }

    // to calculate attendance percentage
    public int getAttendancePercent(int lecCount){
        return (int) (this.attendance * 100 / lecCount);
    }

    // to calculate average attendance of the students
    public static int getAvgAttendance(int lecCount, int totalStudent){
        return (int) ((totalAttendance * 100 / lecCount)/totalStudent);

    }

    // get name
    public String getName(){
        return this.name;
    }

    // get attendance
    // public int getAttendance(){
    //     return this.attendance;
    // }
    // no setters since we do not need them in this task
}