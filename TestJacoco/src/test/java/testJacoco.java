import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public  class testJacoco {
	
	// Instanciation de WebDriver
	WebDriver driver = new ChromeDriver();
	
	@Before
	public void connexionJpetStore() {
		System.setProperty("webdriver.chrome.driver", "C:\\tools\\selenium\\chromedriver.exe");
		driver.get("http://localhost:8180/jpetstore");
	}
	
	@Test
	public  void navigateJpetstore() {
		
		// Click sur "Entrer dans Jpetstore"
		driver.findElement(By.cssSelector("#Content > p:nth-child(2) > a")).click();
		// Click sur la page "Sign in" 
		driver.findElement(By.cssSelector("#MenuContent > a:nth-child(3)")).click();
		// Renseigner le nom utilisateur 
		driver.findElement(By.cssSelector("#Catalog > form > p:nth-child(2) > input[type=\"password\"]:nth-child(4)")).clear();
		driver.findElement(By.cssSelector("#Catalog > form > p:nth-child(2) > input[type=\"password\"]:nth-child(4)")).sendKeys("Test1");
		// renseigner le mot de passe 
		driver.findElement(By.cssSelector("#Catalog > form > p:nth-child(2) > input[type=\"password\"]:nth-child(4)")).clear();
		driver.findElement(By.cssSelector("#Catalog > form > p:nth-child(2) > input[type=\"password\"]:nth-child(4)")).sendKeys("Test1");
		// Click sur le bouton "Submit" == se connecter 
		driver.findElement(By.cssSelector("#Catalog > form > input[type=\"submit\"]")).click();
		// Cliquer sur la partie "Fish" 
		driver.findElement(By.cssSelector("#QuickLinks > a:nth-child(1) > img")).click();
		// Sélectionner un produit 
		driver.findElement(By.cssSelector("#Catalog > table > tbody > tr:nth-child(2) > td:nth-child(1) > a")).click();	
		// Ajout au panier l'item numéro 1 
		driver.findElement(By.cssSelector("#Catalog > table > tbody > tr:nth-child(2) > td:nth-child(5) > a")).click();
		// Cliquer sur "Return at the menu" 
		driver.findElement(By.cssSelector("#BackLink > a")).click();
		// Cliquer sur la séction "Dog" dans le menu gauche 
		driver.findElement(By.cssSelector("#SidebarContent > a:nth-child(4) > img")).click();
		// Sélectionner le dernier produit 
		driver.findElement(By.cssSelector("#Catalog > table > tbody > tr:nth-child(7) > td:nth-child(1) > a")).click();
		// Cliquer sur le 2eme item ID 
		driver.findElement(By.cssSelector("#Catalog > table > tbody > tr:nth-child(3) > td:nth-child(1) > a")).click();
		// Cliquer sur "Add to Cart" 
		driver.findElement(By.cssSelector("#Catalog > table > tbody > tr:nth-child(7) > td > a")).click();
		// Sélectionner la séction "Réptiles" dans le menu de haut 
		driver.findElement(By.cssSelector("#QuickLinks > a:nth-child(5) > img")).click();
		// Sélectionner le premier produit 
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();
		// Ajout au panier l'item numéro 1 
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")).click();
		// Cliquer sur le logo pour retourner à la page d'accueil 
		driver.findElement(By.cssSelector("#LogoContent > a > img")).click();
		// Cliquer sur l'iamge d'oiseau au millieu de la page 
		driver.findElement(By.cssSelector("#MainImageContent > map > area:nth-child(1)")).click();
		// Cliquer sur le logo pour retourner à la page d'accueil 
		driver.findElement(By.cssSelector("#LogoContent > a > img")).click();
		// Ecrire "fish" sur la barre de recherche 
		driver.findElement(By.cssSelector("#SearchContent > form > input[type=\"text\"]:nth-child(1)")).clear();
		driver.findElement(By.cssSelector("#SearchContent > form > input[type=\"text\"]:nth-child(1)")).sendKeys("fish");
		// Cliquer sur le bouton "Search" 
		driver.findElement(By.cssSelector("#SearchContent > form > input[type=\"submit\"]:nth-child(2)")).click();
		// Cliquer sur la première image 
		driver.findElement(By.cssSelector("#Catalog > table > tbody > tr:nth-child(2) > td:nth-child(1) > a > img")).click();
		// Ajout le premier produit dans le panier 
		driver.findElement(By.cssSelector("#Catalog > table > tbody > tr:nth-child(3) > td:nth-child(5) > a")).click();
		// Cliquer sur la séction "Cats" 
		driver.findElement(By.cssSelector("#QuickLinks > a:nth-child(7) > img")).click();
		// Cliquer sur le panier 
		driver.findElement(By.cssSelector("#MenuContent > a:nth-child(1) > img")).click();
		// Supprimer le premier produit 
		driver.findElement(By.cssSelector("#Cart > form > table > tbody > tr:nth-child(2) > td:nth-child(8) > a")).click();
		// Cliquer sur la séction "Birds" 
		driver.findElement(By.cssSelector("#QuickLinks > a:nth-child(9) > img")).click();
		// Cliquer sur la section "Dogs" 
		driver.findElement(By.cssSelector("#QuickLinks > a:nth-child(3) > img")).click();		
		// Sélectionner le dernier produit  
		driver.findElement(By.cssSelector("#QuickLinks > a:nth-child(3) > img")).click();
		// Cliquer sur le premier ID item 
		driver.findElement(By.cssSelector("#QuickLinks > a:nth-child(3) > img")).click();
		// Ajouter le produit au panier  
		driver.findElement(By.cssSelector("#QuickLinks > a:nth-child(3) > img")).click();
		// Click sur la page "Sign in" 
		driver.findElement(By.cssSelector("#MenuContent > a:nth-child(3)")).click();
		// Cliquer sur "Register now 
		driver.findElement(By.cssSelector("#Catalog > a")).click();
		// Renseigner le champ "login" 7
		driver.findElement(By.name("username")).sendKeys("Test2");
		// Renseigner le champ "mot de passe"
		driver.findElement(By.cssSelector("#Catalog > form > table:nth-child(2) > tbody > tr:nth-child(2) > td:nth-child(2) > input[type=\"text\"]")).sendKeys("Test2");
		// Renseigner le champ "saisir à nouveau le mot de passe 
		driver.findElement(By.cssSelector("#Catalog > form > table:nth-child(2) > tbody > tr:nth-child(3) > td:nth-child(2) > input[type=\"text\"]")).sendKeys("Test2");	
		// Renseigner le champ "FirstName"
		driver.findElement(By.cssSelector("#Catalog > form > table:nth-child(4) > tbody > tr:nth-child(1) > td:nth-child(2) > input[type=\"text\"]")).sendKeys("Toto");
		// Renseigner le champ "LastName"
		driver.findElement(By.cssSelector("#Catalog > form > table:nth-child(4) > tbody > tr:nth-child(2) > td:nth-child(2) > input[type=\"text\"]")).sendKeys("Titi");	
		// Renseigner le champ "Country" 
		driver.findElement(By.cssSelector("#Catalog > form > table:nth-child(4) > tbody > tr:nth-child(10) > td:nth-child(2) > input[type=\"text\"]")).sendKeys("France");	
		// Cliquer sur "Save account parameters"
		driver.findElement(By.cssSelector("#Catalog > form > input[type=\"submit\"]")).click();
		
	}
	
	@After
	public void deconnexionJpetStore() {
		driver.quit();
	}
	
}
