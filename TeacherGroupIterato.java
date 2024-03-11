package 6;

import java.util.Iterator;
import java.util.List;

public class TeacherGroupIterator implements Iterator<Teacher> {
    private List<Teacher> teacherList; 
    private int counter = 0;

    public TeacherGroupIterator(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    @Override
    public boolean hasNext() {
        return counter < teacherList.size();
    }

    @Override
    public Teacher next() {
        if (!hasNext())
            return null;
        return teacherList.get(counter++);
    }

    @Override
    public void remove() {
        if (hasNext())
            teacherList.remove(--counter);
    }
}