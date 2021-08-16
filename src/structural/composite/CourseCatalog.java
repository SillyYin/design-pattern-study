package structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yinrongjie
 * @version 1.0
 * @description 课程目录
 * @date 2021/8/13
 */
public class CourseCatalog extends CatalogComponent{
    private List<CatalogComponent> items = new ArrayList<>();
    private String name;
    private Integer level;

    public CourseCatalog(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public String getCourseName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        items.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        items.remove(catalogComponent);
    }

    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "CourseCatalog{" +
                "items=" + items +
                ", name='" + name + '\'' +
                '}';
    }
}
