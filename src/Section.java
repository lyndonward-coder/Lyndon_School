public class Section {
    private String name;
    private int currentSize;
    private Teacher teacher;
    private Student[] student = new Student[50];



    public Section(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents(){
        return this.student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void addStudent(Student p){
        this.student[currentSize] = p;
        currentSize++;
    }


    public String toString(){
        String str = name + " is taught by " + teacher.getName() + " and has size " + currentSize + " students. ";
        for (int i=0; i<currentSize; i++){
            str += student[i].getName();
            str += " , ";
        }
        return str;
    }


}