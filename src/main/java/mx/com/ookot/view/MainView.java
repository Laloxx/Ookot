package mx.com.ookot.view;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import ru.xpoft.vaadin.VaadinView;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Label;
import com.vaadin.ui.Link;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;


@SuppressWarnings("serial")
@Component
@Scope("prototype")
@VaadinView(MainView.VIEW_NAME)
public class MainView extends Panel implements View
{
    public static final String VIEW_NAME = "";

    @PostConstruct
    public void PostConstruct()
    {
        setSizeFull();

        VerticalLayout layout = new VerticalLayout();
        layout.setSpacing(true);
        layout.setMargin(true);
        layout.addComponent(new Label("Ookot"));
        layout.addComponent(new Link("Ejemplo de Vista", new ExternalResource("#!" + ExampleView.VIEW_NAME)));
        
        setContent(layout);
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event)
    {
    }
}
