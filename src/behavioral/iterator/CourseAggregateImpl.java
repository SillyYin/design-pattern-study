package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yinrongjie
 * @version 1.0
 * @description
 * @date 2021/8/17
 */
public class CourseAggregateImpl implements ICourseAggregate{
    private List courseList;

    public CourseAggregateImpl() {
        courseList = new ArrayList();
    }

    @Override
    public void addCourse(Course course) {
        courseList.add(course);
    }

    @Override
    public void removeCourse(Course course) {
        courseList.remove(course);
    }

    @Override
    public ICourseIterator getCourseIterator() {
        return new CourseIteratorImpl(courseList);
    }
}
