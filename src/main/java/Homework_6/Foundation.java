package Homework_6;

import java.util.ArrayList;
import java.util.Random;

public class Foundation {
    public String nameFoundation;
    public int capacity;
    ArrayList<Student> arrayStudent;
    ArrayList<Teacher> arrayTeacher;

    public Foundation(String nameFoundation, int capacity) {
        this.nameFoundation = nameFoundation;
        this.capacity = capacity;
        arrayTeacher = new ArrayList<>();
        arrayStudent = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public int getVisitorsCount() {
        return arrayStudent.size()+arrayTeacher.size();
    }

    public void serve() {
        for (Visitor d: arrayStudent){
            d.doWork();
            System.out.println();
        }
        for (Visitor d: arrayTeacher){
            d.doWork();
            System.out.println();
            }
        }

    public void randomStudent() {
        Random random = new Random();
        int randomIndex = random.nextInt(arrayStudent.size());

        System.out.format("%s - студент %s курса. Находится в %s",arrayStudent.get(randomIndex).getName(), arrayStudent.get(randomIndex).course, nameFoundation);
        System.out.println();
    }

    public void randomTeacher() {
        Random random = new Random();
        int randomIndex = random.nextInt(arrayTeacher.size());

        System.out.format("%s - преподаватель предмета %s. Находится в %s",arrayTeacher.get(randomIndex).getName(), arrayTeacher.get(randomIndex).subject, nameFoundation);
        System.out.println();
    }
}

class Library extends Foundation {
    int quantity = 0;

    public Library(String nameFoundation, int capacity) {
        super(nameFoundation, capacity);
    }

    public void receiveVisitor(Visitor visitor) {
        if (quantity < capacity) {
            quantity+=1;
            if(visitor instanceof Student) {
                arrayStudent.add((Student) visitor);
            }
            if(visitor instanceof Teacher){
                arrayTeacher.add((Teacher) visitor);
            }
            System.out.print("Простите, "+visitor.getName()+", но наденьте маску.\n");
        }else{
            if (quantity == capacity) {
                System.out.println("Места закончились.");
                quantity += 1;
            } else {
                System.out.println("Дурак блин... ЗАКОНЧИЛИСЬ МЕСТА.");
            }
        }
    }
}
