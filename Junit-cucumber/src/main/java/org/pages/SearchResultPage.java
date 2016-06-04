package org.pages;

import org.automation.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shantonu on 6/4/16.
 */
public class SearchResultPage extends PageBase{
    public SearchResultPage(WebDriver aDriver) {
        super(aDriver);
    }
    @FindBy(xpath = ".//*[@id='content']/p[2]")
    public WebElement invalid_search_result_message;
}