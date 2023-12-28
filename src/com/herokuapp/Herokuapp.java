package com.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Herokuapp {

	public Herokuapp() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
	    WebDriver driver = new ChromeDriver();//To launch the chrome driver
	    driver.manage().window().maximize();//Window maximize
	    Thread.sleep(1000);
		String url = "https://testpages.herokuapp.com/styled/tag/dynamic-table.html";  // Replace with your URL
        driver.get(url);
        
        WebElement button = driver.findElement(By.xpath("/html/body/div/div[3]/details"));
        button.click();
         Thread.sleep(1000);
         
        WebElement textBox = driver.findElement(By.id("jsondata"));
        textBox.clear();
        Thread.sleep(1000);
        
        textBox.sendKeys(" [{\"name\" : \"Bob\", \"age\" : 20}, {\"name\": \"George\", \"age\" : 42}, {\"name\": \"Sara\", \"age\" : 42}, {\"name\": \"Conor\", \"age\" : 40}, {\"name\":\r\n"
        		+ " \"Jennifer\", \"age\" : 42}]");
        
        Thread.sleep(1000);
        
        
        JavascriptExecutor js = (JavascriptExecutor) driver;//for scroll down the page
        Thread.sleep(1000);
        js.executeScript("window.scrollTo(0,1000)");

       
       
        WebElement refreshbutton = driver.findElement(By.id("refreshtable"));
        refreshbutton.click();
        
        Thread.sleep(1000);
       
        System.out.println("refresh button got clicked");
        Thread.sleep(3000);
       
       driver.quit();
       
      
        

		
		
	}

}
