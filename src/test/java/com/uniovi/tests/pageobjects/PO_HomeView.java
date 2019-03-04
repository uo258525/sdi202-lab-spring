package com.uniovi.tests.pageobjects;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.uniovi.tests.utils.SeleniumUtils;

public class PO_HomeView {
	static public void checkWelcome(WebDriver driver, int language) {
		//Esperamos a que se cargue el saludo de bienvenida en Español
		SeleniumUtils.EsperaCargaPagina(driver, "text",PO_View.p.getString("welcome.message",language), PO_View.getTimeout() ) ;
	} 
	static public void checkChangeIdiom(WebDriver driver, String textIdiom1, String
			textIdiom2, int locale1, int locale2 ) {
			//Esperamos a que se cargue el saludo de bienvenida en Español
			PO_HomeView.checkWelcome(driver, locale1);
			//Cambiamos a segundo idioma
			PO_NavView.changeIdiom(driver, textIdiom2);
			//COmprobamos que el texto de bienvenida haya cambiado a segundo idioma
			PO_HomeView.checkWelcome(driver, locale2);
			//Volvemos a Español.
			PO_NavView.changeIdiom(driver, textIdiom1);
			//Esperamos a que se cargue el saludo de bienvenida en Español
			PO_HomeView.checkWelcome(driver, locale1);
			}
}
