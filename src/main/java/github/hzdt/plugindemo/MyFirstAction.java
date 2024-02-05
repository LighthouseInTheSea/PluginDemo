package github.hzdt.plugindemo;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.pom.Navigatable;

import java.util.Objects;

public class MyFirstAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent event) {
        //创建并显示对话框
        Project currentProject = event.getProject();
        StringBuilder message =
                new StringBuilder(event.getPresentation().getText() + " Selected!");
        //如果选中了一个元素，追加该元素的信息
        Navigatable selectedElement = event.getData(CommonDataKeys.NAVIGATABLE);
        if (selectedElement != null) {
            message.append("\nSelected Element: ").append(selectedElement);
        }
        String title = event.getPresentation().getDescription();
        Messages.showMessageDialog(
                currentProject,
                message.toString(),
                title,
                Messages.getInformationIcon());
    }

    @Override
    public void update(AnActionEvent event) {
        Project project = event.getProject();
        event.getPresentation().setEnabledAndVisible(Objects.nonNull(project));
    }
}
