class Student {
        String name;
        int rollno;
        float marks;

        Student(float marks,String name,int rollno){
                this.marks=marks;
                this.rollno=rollno;
                this.name=name;
        }

//        This is the metod that will assign the passed object's properties as the current objects's Properties

        Student (Student other){
                this.name=other.name;
                this.rollno= other.rollno;
                this.marks=other.marks;
        }
}

public class StudentUse{

        public static void main(String[] args) {
                Student s1=new Student(80,"Jisu",4);


                System.out.println("Name: "+s1.name);
                System.out.println("Roll No: "+s1.rollno);
                System.out.println("Marks: "+s1.marks);


                Student Copy=new Student(s1);

                System.out.println("Coping From The Previous Object");

                System.out.println("Name: "+Copy.name);
                System.out.println("Roll No: "+Copy.rollno);
                System.out.println("Marks: "+Copy.marks);
        }
}
