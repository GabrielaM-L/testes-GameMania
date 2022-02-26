package gamemania.teste;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteLogin {
	
	private WebDriver driver;
	
	@Before
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://localhost:4200/login");
		
		
	}
	
	
	
	@Test
	public void TestarLogin() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebElement inputEmail = driver.findElement(By.id("email")); 
		WebElement inputSenha = driver.findElement(By.id("password")); 
		WebElement botaoLogin = driver.findElement(By.id("botao-enviar")); 
		
	//Teste com email e senha corretos:	
		inputEmail.sendKeys("gabriela@email.com");
		inputSenha.sendKeys("123456");
		botaoLogin.click();
	
	//Teste com email incorreto e senha correta:	
		//inputEmail.sendKeys("gabi@email.com");
		//inputSenha.sendKeys("123456");
		//botaoLogin.click();
		
	//Teste com email correto e senha incorreta:	
		//inputEmail.sendKeys("gabriela@email.com");
		//inputSenha.sendKeys("789456");
		//botaoLogin.click();
		
	//Teste com email e senha incorretos:
		//inputEmail.sendKeys("gabi@email.com");
		//inputSenha.sendKeys("789456");
		//botaoLogin.click();
	}

}
