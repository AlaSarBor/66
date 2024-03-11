package 6;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher(5, "aab", "aab", "aab");
        Teacher teacher2 = new Teacher(2, "aaa", "aaa", "aaa");
        Teacher teacher3 = new Teacher(3, "Aaa", "Aaa", "Aaa");
        Teacher teacher4 = new Teacher(1, "bbb", "bbb", "bbb");
        Teacher teacher5 = new Teacher(4, "Bbb", "Bbb", "Bbb");
        
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(teacher1);
        teacherList.add(teacher2);
        teacherList.add(teacher3);
        teacherList.add(teacher4);
        teacherList.add(teacher5);

        TeacherGroup teacherGroup = new TeacherGroup(teacherList);

        TeacherGroupService service = new TeacherGroupService(teacherGroup);

        UserView<Teacher> view = new TeacherView();

        view.sendOnConsole(service.getSortedStudentGroupByFSL());
    }
}