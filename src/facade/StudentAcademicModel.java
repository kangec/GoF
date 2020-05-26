package facade;//=====================================================
// One object of this class represents the format of a student academic
// record, which is formed by:
//       studFirstName;
//       studLastName;
//       studSerialNum;
//       courseTitle;
//       courseNum;
//       score;
//=====================================================

public class StudentAcademicModel {
    private final String studFirstName;
    private final String studLastName;
    private final String studSerialNum;
    private final String courseTitle;
    private final String courseNum;
    private final String score;

    public StudentAcademicModel(String studFirstName, String studLastName, String studSerialNum,
                                String courseTitle, String courseNum, String score) {
        this.studFirstName = studFirstName;
        this.studLastName = studLastName;
        this.studSerialNum = studSerialNum;
        this.courseTitle = courseTitle;
        this.courseNum = courseNum;
        this.score = score;
    }

    public String getStudFirstName() {
        return studFirstName;
    }

    public String getStudLastName() {
        return studLastName;
    }

    public String getStudSerialNum() {
        return studSerialNum;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public String getCourseNum() {
        return courseNum;
    }

    public String getScore() {
        return score;
    }
}
