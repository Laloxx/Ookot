package mx.com.ookot;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import ru.xpoft.vaadin.DiscoveryNavigator;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
@Theme("mytheme")
@Component
@Scope("prototype")
public class MyUI extends UI {
	
    private DiscoveryNavigator navigator;    
    
    @Override
    protected void init(final VaadinRequest request)
    {
        setSizeFull();
        getPage().setTitle("Ookot");
        navigator = new DiscoveryNavigator(this, this);
        
    }
}
