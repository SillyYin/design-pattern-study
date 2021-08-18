package behavioral.observer;

import java.util.Observable;

/**
 * @author yinrongjie
 * @version 1.0
 * @description 被观察对象
 * @date 2021/8/18
 */
public class Course extends Observable {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void produceQuestion(Course course, Question question) {
        System.out.println(question.getUserName() + "在" + course.courseName + "中提出: " + question.getQuestionContent());
        // 状态发生改变
        setChanged();
        // 通知观察者
        notifyObservers(question);
    }
}
