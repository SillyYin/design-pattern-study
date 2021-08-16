package structural.composite;

/**
 * @author yinrongjie
 * @version 1.0
 * @description
 * @date 2021/8/13
 */
public class Test {
    public static void main(String[] args) {
        CatalogComponent linuxCourse = new Course("linux", 11d);
        CatalogComponent windowsCourse = new Course("windows", 33d);

        CatalogComponent javaCourseCatalog = new CourseCatalog("Java Catalog", 1);
        CatalogComponent javaCourse1 = new Course("java1", 23d);
        CatalogComponent javaCourse2 = new Course("java2", 24d);
        CatalogComponent javaCourse3 = new Course("java3", 26d);

        javaCourseCatalog.add(javaCourse1);
        javaCourseCatalog.add(javaCourse2);
        javaCourseCatalog.add(javaCourse3);

        CatalogComponent mainCatalog = new CourseCatalog("main Catalog", 0);
        mainCatalog.add(linuxCourse);
        mainCatalog.add(windowsCourse);
        mainCatalog.add(javaCourseCatalog);

        mainCatalog.print();
    }
}
