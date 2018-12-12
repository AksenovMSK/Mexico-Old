package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BaseHelper {
    protected WebDriver wd;

    public BaseHelper(WebDriver wd) {
        this.wd = wd;
    }

    protected void click(By locator) {
      wd.findElement(locator).click();
    }

    protected void click(By locator, int index) {
        wd.findElements(locator).get(index).click();
    }

    protected void type(By locator, String text) {
      wd.findElement(locator).click();
      wd.findElement(locator).clear();
      wd.findElement(locator).sendKeys(text);
    }

    public List<WebElement> getElementsList(By locator) {
        List<WebElement> elements = wd.findElements(locator);
        return elements;
    }
}
