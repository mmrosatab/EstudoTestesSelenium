package teste1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverDemo2 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "/home/mmrosa/MEGA/MEGAsync/Faculdade/20191/COMP3/programas/geckodriver");
		WebDriver driver = new FirefoxDriver();
	   
	   //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	   //Launch website
	   driver.navigate().to("https://www.google.com.br/?gws_rd=cr&dcr=0&ei=iRrJWfffIsWBwgSf6YzwDA");
	   
	   //Navegando até a calculadora
	   driver.get("http://www.calculadoraonline.com.br/basica");
	   
	   //Maximize the browser
	   driver.manage().window().maximize();
	   
	   //driver.findElement(By.id("gs_htif0")).sendKeys("10");//Escrevendo 10
	   
	   // Enter value 3 in the second number of the percent Calculator
	   driver.findElement(By.id("TIExp")).sendKeys("3");//Escrevendo 3
	   
	   // Get the Result Text based on its xpath
	   String result = driver.findElement(By.id("TIExp")).getAttribute("value");
	   
	   System.out.println("Antes do (+) "+ result);
	   
	   driver.findElement(By.xpath(".//*[@id='cp_calc']/div[5]/center[1]/div[4]")).click();//Clicando "+"
	   
	   result = driver.findElement(By.id("TIExp")).getAttribute("value");
	   
	   System.out.println("Depois do (+) " + result);
	   
	   // Enter value 50 in the second number of the percent Calculator
	   driver.findElement(By.id("TIExp")).sendKeys("50");//Escrevendo 50
	   
	   // Click Calculate Button
	   driver.findElement(By.xpath(".//*[@id='cp_calc']/div[5]/center[4]/div[3]")).click();//Clicando "="
	   
	   // Get the Result Text based on its xpath
	   result = driver.findElement(By.id("TIExp")).getAttribute("value");//Resgatando o resultado na caixa de texto
	   
	   // Print a Log In message to the screen
	   System.out.println("The Result is " + result);//Imprimindo o resultado 53
	   
	   //Close the Browser.
	   driver.close();
	}
}
