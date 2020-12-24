package homework4_Task2;

import java.util.ArrayList;

abstract public class Foundation {
    public ArrayList<Visitor> studentsAndTeachers = new ArrayList<>();
    public int capacity = 100;

    public Foundation(){
        studentsAndTeachers = new ArrayList<>();
    }

    public Foundation(ArrayList<Visitor> studentsAndTeachers) {
        this.studentsAndTeachers = studentsAndTeachers;
    }

    public void receiveVisitor(Visitor visitor){
        studentsAndTeachers.add(visitor);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getVisitorCount(){
        return this.studentsAndTeachers.size();
    }
}
