package behavioral.observer;

/**
 * @author yinrongjie
 * @version 1.0
 * @description
 * @date 2021/8/18
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course("abcCourse");
        Teacher teacher = new Teacher("cTeacher");

        course.addObserver(teacher);

        Question question = new Question();
        question.setUserName("student");
        question.setQuestionContent("77777");
        course.produceQuestion(course, question);
    }
}
