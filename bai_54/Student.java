public class Student implements Comparable<Student>{
    private int studentId;
    private String fullName;
    private String className;
    private Double averageScore;

    public Student(int studentId, String fullName, String className, double averageScore) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.className = className;
        this.averageScore = averageScore;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public String getLastName(){
        String s = fullName.trim();
        if(s.contains(" ")){
            s = s.substring(s.lastIndexOf(" ")+1);
            return s;
        }
        else{
            return s;
        }
    }

    @Override
    public int compareTo(Student o) {
        //return this.studentId - o.studentId;
//        String thisName = this.getLastName();
//        String otherName = o.getLastName();

        return averageScore.compareTo(o.averageScore);
    }
}
