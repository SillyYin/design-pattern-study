package behavioral.templatemethod;

/**
 * @author yinrongjie
 * @version 1.0
 * @description
 * @date 2021/8/17
 */
public class FECourse extends ACourse{
    // 开放适当的权限给应用层
    private boolean needWriteArticleFlag = false;

    public FECourse(boolean needWriteArticleFlag) {
        this.needWriteArticleFlag = needWriteArticleFlag;
    }

    @Override
    void packageCourse() {
        System.out.println("提供前端代码");
        System.out.println("提供素材");
    }

    @Override
    protected boolean needWriteArticle() {
        return needWriteArticleFlag;
    }

}
