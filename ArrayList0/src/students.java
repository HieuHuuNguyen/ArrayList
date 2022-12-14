import java.util.Objects;

public class students implements Comparable<students> {
    public String rollno;
    public String fullname;
    public int DOB;
    public float mark;

    public students(String rollno) {
        this.rollno = rollno;
    }

    public students(String rollno, String fullname, int DOB, float mark) {
        this.rollno = rollno;
        this.fullname = fullname;
        this.DOB = DOB;
        this.mark = mark;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getDOB() {
        return DOB;
    }

    public void setDOB(int DOB) {
        this.DOB = DOB;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "students{" +
                "rollno='" + rollno + '\'' +
                ", fullname='" + fullname + '\'' +
                ", DOB=" + DOB +
                ", mark=" + mark +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollno, fullname, DOB, mark);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(this == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;

        }
        students other = (students) obj;
        return Objects.equals(rollno, other.rollno);
    }

    @Override
    public int compareTo(students o) {
        return this.rollno.compareTo(o.rollno);
    }
}
