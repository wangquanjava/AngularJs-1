package com.harishkannarao.angularjs.webapp.page;

import org.openqa.selenium.By;

public class ErrorPage extends BasePage {

    public boolean isOnValidPage() {
        return !webDriver.findElements(By.id("qa-error-page-id")).isEmpty();
    }


    public String getErrorReference() {
        return webDriver.findElement(By.id("qa-error-reference")).getText();
    }
}
