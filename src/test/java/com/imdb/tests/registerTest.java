package com.imdb.tests;

import org.junit.Test;

public class registerTest extends BaseTest {

    @Test
    public void testRegisterNewUser() {
        home.navegar("https://imdb.com");
        home.verificarPagina();
        //login.comenzarRegistro();
        //createAccount.crearUsuario("user", "email", "password");
    }
}
