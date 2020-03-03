public class Runner {

    public static void main(String[] args){
        School berkeleyHigh = new School("Berkeley High");
        Section math = new Section("Math");
        Section biology = new Section("Biology");
        Section ComputerScience = new Section("Computer Science");
        Teacher Albinson = new Teacher("Albinson","Computer Science");
        Teacher Teacher2 = new Teacher("Teacher2","Math");
        Teacher Teacher3 = new Teacher("Teacher3","Biology");
        Student Me = new Student("Me",11);
        Student Friend1 = new Student("Friend1",3);
        Student Friend2 = new Student("Friend2",4);
        Student Friend3 = new Student("Friend3",5);
        Student Friend4 = new Student("Friend4",6);
        Student Friend5 = new Student("Friend5",7);

        berkeleyHigh.addSection(math);
        berkeleyHigh.addSection(biology);
        berkeleyHigh.addSection(ComputerScience);

        math.setTeacher(Teacher2);
        biology.setTeacher(Teacher3);
        ComputerScience.setTeacher(Albinson);

        Albinson.addSection(ComputerScience);
        Teacher2.addSection(math);
        Teacher3.addSection(biology);

        math.addStudent(Me);
        math.addStudent(Friend1);
        biology.addStudent(Friend2);
        biology.addStudent(Friend3);
        ComputerScience.addStudent(Friend4);
        ComputerScience.addStudent(Friend5);

        Me.addSection(math);
        Me.addSection(biology);
        Me.addSection(ComputerScience);


        Friend1.addSection(math);
        Friend1.addSection(biology);
        Friend1.addSection(ComputerScience);

        Friend2.addSection(math);
        Friend2.addSection(biology);
        Friend2.addSection(ComputerScience);

        Friend3.addSection(math);
        Friend3.addSection(biology);
        Friend3.addSection(ComputerScience);

        Friend4.addSection(math);
        Friend4.addSection(biology);
        Friend4.addSection(ComputerScience);

        Friend5.addSection(math);
        Friend5.addSection(biology);
        Friend5.addSection(ComputerScience);




        System.out.println(berkeleyHigh.toString());

        System.out.println(math.toString());
        System.out.println(biology.toString());
        System.out.println(ComputerScience.toString());

        System.out.println(Albinson.toString());
        System.out.println(Teacher2.toString());
        System.out.println(Teacher3.toString());

        System.out.println(Me.toString());
        System.out.println(Friend1.toString());
        System.out.println(Friend2.toString());
        System.out.println(Friend3.toString());
        System.out.println(Friend4.toString());
        System.out.println(Friend5.toString());


    }

}
