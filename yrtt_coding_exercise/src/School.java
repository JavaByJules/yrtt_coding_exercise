import java.util.Set;

public class School extends Student{
    public grade getGrade() {
        return grade;
    }

    public void SetGrade(grade grade){
        this.grade = grade;
    }
    public int getGroup() {
        return group;
    }

    public void upGrade(){
        grade currentGrade = getGrade();

        if (currentGrade.equals(grade.B)) {
            currentGrade = grade.A;
        }
        else if (currentGrade.equals(grade.C)) {
            currentGrade = grade.B;
        }
        else if (currentGrade.equals(grade.D)) {
            currentGrade = grade.C;
        }
        else if (currentGrade.equals(grade.E)) {
            currentGrade = grade.D;
        }

        SetGrade(currentGrade);
        }

    public void downGrade(){
        grade currentGrade = getGrade();

        if (currentGrade.equals(grade.A)) {
            currentGrade = grade.B;
        }
        else if (currentGrade.equals(grade.B)) {
            currentGrade = grade.C;
        }
        else if (currentGrade.equals(grade.C)) {
            currentGrade = grade.D;
        }
        else if (currentGrade.equals(grade.D)) {
            currentGrade = grade.E;
        }

        SetGrade(currentGrade);
    }


}

