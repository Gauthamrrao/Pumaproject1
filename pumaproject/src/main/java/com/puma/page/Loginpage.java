package com.puma.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.puma.generic.Basepage;

public class Loginpage extends Basepage 
{
	@FindBy(xpath="//a[contains(.,' MEN ')]")
	private WebElement menoption;
	//(//a[.='Shoes' and contains(@href,'men')] /../../../li[2])[1]
	//(//a[.='Shoes' and contains(@href,'men')] /../../following-sibling::li/a[.='Running'])[1]
	@FindBy(xpath="(//a[.='Shoes' and contains(@href,'men')] /../../following-sibling::li/a[.='Running'])[1]")
	private WebElement runningoption;
	//a[.='Shoes' and contains(@href,'men')] /../../following-sibling::li/a[.='Running']
	@FindBy(xpath="//div[@class='category-products']//ul[@class='products-grid products-grid--max-4-col first last odd']/li[2")
    private WebElement shoesoption2;
	@FindBy(xpath="//span[@class='caret']")
	private WebElement Dropdownoptn;
	@FindBy(xpath="//span[@id='180~229']")
	private WebElement optionnum;
	@FindBy(xpath="(//button[@type='button'])[1]")
	private WebElement button;
	public Loginpage(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}

}
