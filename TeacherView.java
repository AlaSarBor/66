package 6;

import java.util.List;


public class TeacherView implements UserView<Teacher> {
    @Override
    public void sendOnConsole(Iterable<Teacher> iterable) { 
        for (Teacher teacher : iterable) { 
            System.out.println(teacher);
        }
    }
}