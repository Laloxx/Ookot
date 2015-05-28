package mx.com.ookot.view;



import javax.annotation.PostConstruct;

import mx.com.ookot.model.Servicio;
import mx.com.ookot.model.domain.Dominio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import ru.xpoft.vaadin.VaadinView;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextField;

@SuppressWarnings("serial")
@Component
@Scope("prototype")
@VaadinView(ExampleView.VIEW_NAME)
public class ExampleView extends Panel implements View {
	
	@Autowired
	private Servicio servicio;

	@Value(value="${saludo}")
	private String saludo;

	public static final String VIEW_NAME = "example";

	private HorizontalLayout layout = new HorizontalLayout();
	
	private TextField nombre = new TextField();		
	private Button button = new Button("Saludar");	
	
	@PostConstruct
    public void PostConstruct()
    {
        setSizeFull();        
        layout.setSpacing(true);
        layout.setMargin(true);									
		
		button.addClickListener(new Button.ClickListener() {			
			public void buttonClick(ClickEvent event) {
				if(nombre.getValue() == null || nombre.getValue().trim().length() == 0) {
					Notification.show("¿Cual es su nombre?", 
							Notification.TYPE_ERROR_MESSAGE);
										
				} else {								
					Dominio d = new Dominio();
					d.setNombre(nombre.getValue());
					servicio.persisDominio(d);
					
					Notification.show(saludo + " " + d.getNombre() + "!, eres el usuario: " + d.getId());
					
				}
								
			}
		});
		
		layout.addComponent(nombre);
		layout.addComponent(button);
		
		nombre.focus();
		
		setContent(layout);
		
	}

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
	
			
}
