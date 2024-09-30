package sinif_ve_nesneleri.university;

public class University {
    public static void main(String[] args) {

        Course course1=new Course();
        course1.courseName="Java İle Fonksiyonel Programlama";
        course1.professors=new Professor[5];
        course1.courseClassroom=new Clasroom[5];

        Clasroom class1=new Clasroom();
        class1.classBranch="BM-2";
        class1.classroomProfessor=new Professor[5];
        class1.course=new Course[5];

        Professor professor1=new Professor();
        professor1.name="Taha Tayyib Toprak";
        professor1.clasroom=new Clasroom[5];
        professor1.course=new Course[5];

        course1.professors[0]=professor1;
        course1.courseClassroom[0]=class1;

        professor1.clasroom[0]=class1;
        professor1.course[0]=course1;

        class1.course[0]=course1;
        class1.classroomProfessor[0]=professor1;

        System.out.println("Profesör1'in vermiş olduğu dersler:"+professor1.course[0].courseName);
        System.out.println("Profesör1'in kayıt olduğu sınıflar:"+professor1.clasroom[0].classBranch);

        System.out.println("Class1'e kayıtlı profesörler:"+class1.classroomProfessor[0].name);




    }
}
