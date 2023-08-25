public abstract class Student {
    protected String name;
    protected grade grade;
    protected int group = 1;
    protected static final String secretNickName = "MySecretNickName";



    public Student(String name, grade grade, int group){
        this.name = name;
        this.grade = grade;

        if (group >= 1 && group <=5) {
            this.group = group;
        }
    }

}

