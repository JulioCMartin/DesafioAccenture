package pages;

import org.openqa.selenium.By;
import utils.Dados;

public class FormularioPessoalPage extends BasePage  {

    public final By intNome = By.xpath("//*[@id='firstname']");
    public final By intSobrenome = By.xpath("//*[@id='lastname']");
    public final By intDataNascimento = By.xpath("//*[@id='birthdate']");
    public final By btnGenero = By.xpath("(//*[@class='ideal-radiocheck-label'])[1]");
    public final By intEndereco = By.xpath("//*[@id='streetaddress']");
    public final By intPais = By.xpath("//*[@id='country']");
    public final By intCodigoPostal = By.xpath("//*[@id='zipcode']");
    public final By intCidade = By.xpath("//*[@id='city']");
    public final By intOcupacao = By.xpath("//*[@id='occupation']");
    public final By btnHobbie = By.xpath("(//*[@class='ideal-radiocheck-label'])[6]");
    public final By btnProximo = By.xpath("//*[@id='nextenterproductdata']");
    
    Dados dados = new Dados();
    
    // Logic
    public void preenchoAbaPessoal() {
        inserirElemento(intNome, dados.nome());
        try {Thread.sleep(2000);}catch (Exception e) {}
        inserirElemento(intSobrenome, dados.sobrenome());
        try {Thread.sleep(2000);}catch (Exception e) {}
        inserirElemento(intDataNascimento, dados.dataNacimento());
        try {Thread.sleep(2000);}catch (Exception e) {}
        
        clicarNoElemento(btnGenero);
        try {Thread.sleep(2000);}catch (Exception e) {}
        
        inserirElemento(intEndereco, dados.endereco());
        try {Thread.sleep(2000);}catch (Exception e) {}
        inserirElemento(intPais, dados.pais());
        try {Thread.sleep(2000);}catch (Exception e) {}
        inserirElemento(intCodigoPostal, dados.codigoPostal());
        try {Thread.sleep(2000);}catch (Exception e) {}
        inserirElemento(intCidade, dados.cidade());
        try {Thread.sleep(2000);}catch (Exception e) {}
        inserirElemento(intOcupacao, dados.ocupacao());
        try {Thread.sleep(2000);}catch (Exception e) {}
        
        clicarNoElemento(btnHobbie);
        try {Thread.sleep(2000);}catch (Exception e) {}
    }

    public void clicoProximo() {
        clicarNoElemento(btnProximo);
        try {Thread.sleep(5000);}catch (Exception e) {}
    }
}
