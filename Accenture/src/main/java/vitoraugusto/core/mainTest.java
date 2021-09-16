package vitoraugusto.core;
import static vitoraugusto.core.DriverFactory.getDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class mainTest {
	
	private mainFunction mainFunction;

	@Before
	public void inicializa(){
		System.setProperty("webdriver.chrome.driver", "/Users/vitorgarcia/Documents/Accenture/chromedriver");
		getDriver().get("http://sampleapp.tricentis.com/101/app.php");
		mainFunction = new mainFunction();
	}
	
	@After
	public void finaliza(){
		DriverFactory.killDriver();
	}
	
	@Test
	public void VehicleSet() throws InterruptedException {

		//Enter Vehicle Data Config
	
		mainFunction.click("nav_automobile");
		mainFunction.validaTexto("Enter Vehicle Data");
		mainFunction.dropDown("make", "Porsche");
		mainFunction.digitaTexto("engineperformance", "420");
		mainFunction.digitaTexto("dateofmanufacture", "08/22/1991");
		mainFunction.dropDown("numberofseats", "2");
		mainFunction.dropDown("fuel", "Gas");
		mainFunction.digitaTexto("listprice", "10000");
		mainFunction.digitaTexto("licenseplatenumber", "ABCD123");
		mainFunction.digitaTexto("annualmileage", "125");
		mainFunction.click("nextenterinsurantdata");
	 	
		//Enter Insurant Data Config

		mainFunction.validaTexto("Enter Insurant Data");
	 	mainFunction.digitaTexto("firstname", "Vitor");
	 	mainFunction.digitaTexto("lastname", "Augusto");
	 	mainFunction.digitaTexto("birthdate", "08/22/1991");
	 	mainFunction.locate("//form[@id='insurance-form']/div/section[2]/div[4]/p/label");
	 	mainFunction.digitaTexto("streetaddress", "Rua MMDC, 49");
	 	mainFunction.dropDown("country", "Brazil");
	 	mainFunction.digitaTexto("zipcode", "08570007");
	 	mainFunction.digitaTexto("city", "Itaquaquecetuba");
	 	mainFunction.dropDown("occupation", "Employee");
	 	mainFunction.locate("//div[10]/p/label[2]/span");
	 	mainFunction.locate("//label[4]/span");
	 	mainFunction.digitaTexto("website", "http://sampleapp.tricentis.com/101/app.php");
	 	mainFunction.click("nextenterproductdata");

	 	//Enter Product Data Config
	 	
	 	mainFunction.validaTexto("Enter Product Data");
	 	mainFunction.digitaTexto("startdate", "12/25/2021");
	 	mainFunction.dropDown("insurancesum", "10.000.000,00");
	 	mainFunction.dropDown("meritrating", "Malus 10");
	 	mainFunction.dropDown("damageinsurance", "Partial Coverage");
	 	mainFunction.locate("//div[5]/p/label/span");
	 	mainFunction.dropDown("courtesycar", "Yes");
	  	mainFunction.click("nextselectpriceoption");

	 	//Select Price Option Config
	 	 
	 	mainFunction.locate("//th[2]/label[4]/span");
	 	Thread.sleep(500);
	 	mainFunction.click("nextsendquote"); 

	 	//Send Quote Config
	 	 
	 	mainFunction.digitaTexto("email", "teste@teste.com.br");
	 	mainFunction.digitaTexto("phone", "11123456789");
	 	mainFunction.digitaTexto("username", "testeQA");
	 	mainFunction.digitaTexto("password", "Teste1234");
	 	mainFunction.digitaTexto("confirmpassword", "Teste1234");
	 	mainFunction.digitaTexto("Comments", "Obrigado pela oportunidade! :)");
	 	mainFunction.click("sendemail");
	 	Thread.sleep(10000);
	 	

			}
					
	}
	

