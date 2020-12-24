package homework4_Task2;

import java.util.ArrayList;

public class Library extends Foundation{

    public Library() {
    }

    public Library(ArrayList<Visitor> studentsAndTeachers) {
        super(studentsAndTeachers);
    }

    public void serve(Visitor visitor){
        visitor.doWork();
    }
}
