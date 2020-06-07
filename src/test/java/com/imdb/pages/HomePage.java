package com.imdb.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {


    //atributes
    private WebDriver driver;

    WebElement logoImdb; // id="home_img"
    WebElement campoBusqueda; //name="q"
    WebElement botonBusqueda;  //id="suggestion-search-button"
    WebElement botonSignIn; //css=".imdb-header__signin-text"
    //labelNombreUsuario: css="label.imdb-header__account-toggle--logged-in ~ label"

    //Constructor
    public HomePage(WebDriver driverBaseTest) {
        this.driver = driverBaseTest;
    }

    //comportamiento
    public void navegar(String url) {

    }

    public void verificarPagina() {

    }

    //verificarLogin(x)

}
