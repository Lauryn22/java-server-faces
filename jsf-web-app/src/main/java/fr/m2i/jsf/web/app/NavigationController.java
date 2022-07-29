package fr.m2i.jsf.web.app;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "navigationController", eager = true)
public class NavigationController {

    public String moveToHello() {
        return "hello";
    }
}