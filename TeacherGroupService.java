package 6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TeacherGroupService {
    private TeacherGroup teacherGroup;

    public TeacherGroupService(TeacherGroup teacherGroup) {
        this.teacherGroup = teacherGroup;
    }

   
    public List<Teacher> getSortedTeacherGroup() {
        List<Teacher> teacherList = new ArrayList<>();
        for (Teacher teacher : teacherGroup) { 
            teacherList.add(teacher);
        }
        Collections.sort(teacherList);
        return teacherList;
    }

    
    public List<Teacher> getSortedStudentGroupByFSL() {
        List<Teacher> teacherList = new ArrayList<>();
        for (Teacher teacher : teacherGroup) { 
            teacherList.add(teacher);
        }
        teacherList.sort(new UserComparator<Teacher>()); 
        return teacherList;
    }
}