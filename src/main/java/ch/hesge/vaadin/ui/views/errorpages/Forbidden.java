package ch.hesge.vaadin.ui.views.errorpages;


import ch.hesge.vaadin.ui.common.components.NavBar;
import ch.hesge.vaadin.ui.views.Home;
import ch.hesge.vaadin.ui.views.users.LoginScreen;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.Page;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;

import javax.servlet.annotation.WebServlet;

@Route("403")
@PageTitle("Forbidden")
public class Forbidden extends VerticalLayout {

    public Forbidden() {
        initView();
    }

    private void initView() {
        NavBar navBar = new NavBar();

        H1 h1 = new H1("You can't access this page if are not logged in.");
        RouterLink bookListLink = new RouterLink("Please login", LoginScreen.class);

        Div pageContent = new Div(h1, bookListLink);

        add(navBar, pageContent);
    }
}
