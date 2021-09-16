package vitoraugusto.core;
import static vitoraugusto.core.DriverFactory.getDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class mainFunction {
	
	public void click (String botao) {
		getDriver().findElement(By.id(botao)).click();
	}
	
	public void validaTexto (String texto) {
		getDriver().findElement(By.name(texto));
	  	  
	}
	
	public void digitaTexto (String campo, String texto) {
		getDriver().findElement(By.id(campo)).sendKeys(texto);
		Assert.assertEquals(texto, getDriver().findElement(By.id(campo)).getAttribute("value"));
	}  	  
	
	public void locate (String xpath) {
		getDriver().findElement(By.xpath(xpath)).click();
	  	  
	}
	
	public void dropDown (String drop, String valor) {
		WebElement element = getDriver().findElement(By.id(drop));
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);

	}
	
	public void popup (String popup) {
		getDriver().findElement(By.xpath(popup)).click();
	} 
	
	
}



	
