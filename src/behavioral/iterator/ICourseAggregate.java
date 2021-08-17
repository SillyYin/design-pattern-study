package behavioral.iterator;

/**
 * @author yinrongjie
 * @version 1.0
 * @description
 * @date 2021/8/17
 */
public interface ICourseAggregate {
    void addCourse(Course course);
    void removeCourse(Course course);

    ICourseIterator getCourseIterator();
}
