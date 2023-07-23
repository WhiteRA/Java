package OOP.t_5.info_sys;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<SchoolStudent> schoolStudents;

    public School() {
        this.schoolStudents = new ArrayList<>();
    }

    public void addSchoolStudent(SchoolStudent schoolStudent) {
        schoolStudents.add(schoolStudent);
    }

    public void removeSchoolStudent(SchoolStudent schoolStudent) {
        schoolStudents.remove(schoolStudent);
    }

    public List<SchoolStudent> getSchoolStudents() {
        return schoolStudents;
    }

    // Другие методы для работы с учениками школы
}
