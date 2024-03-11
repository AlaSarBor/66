package 6;

import java.util.Iterator;
import java.util.List;

public class TeacherGroup implements Iterable<Teacher> {
    private List<Teacher> teacherList; 

    public TeacherGroup(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public void addTeacher(Teacher teacher) { 
        teacherList.add(teacher);
    }

    @Override
    public Iterator<Teacher> iterator() {
        return teacherList.iterator();
    }
}