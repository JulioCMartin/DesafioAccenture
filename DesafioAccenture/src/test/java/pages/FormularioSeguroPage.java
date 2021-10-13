package pages;

import org.openqa.selenium.By;
import utils.Dados;

public class FormularioSeguroPage extends BasePage  {

    public final By intDataIncio = By.xpath("//*[@id='startdate']");
    public final By intSomaDoSeguro = By.xpath("//*[@id='insurancesum']");
    public final By intSeguroDanos = By.xpath("//*[@id='damageinsurance']");
    public final By chkProdutoOpc = By.xpath("(//*[@class='ideal-radiocheck-label'])[8]");
    public final By btnProximo = By.xpath("//*[@id='nextselectpriceoption']");
    
    public final By chkUltimate = By.xpath("(//*[@class='choosePrice ideal-radiocheck-label'])[4]");
    public final By btnAvancar = By.xpath("//*[@id='nextsendquote']");
    
    Dados dados = new Dados();
    
    // Logic
    public void preenchoAbaSeguro() {
        inserirElemento(intDataIncio, dados.dataInicio());
        try {Thread.sleep(2000);}catch (Exception e) {}
        inserirElemento(intSomaDoSeguro, dados.somaSeguro());
        try {Thread.sleep(2000);}catch (Exception e) {}
        inserirElemento(intSeguroDanos, dados.coberturaSeguro());
        try {Thread.sleep(2000);}catch (Exception e) {}
        
        clicarNoElemento(chkProdutoOpc);
        try {Thread.sleep(2000);}catch (Exception e) {}
        
    }

    public void clicoProximo() {
        clicarNoElemento(btnProximo);
        try {Thread.sleep(5000);}catch (Exception e) {}
    }

    public void selecionoPlano() {
        clicarNoElemento(chkUltimate);
        try {Thread.sleep(5000);}catch (Exception e) {}
    }
    
    public void clicoAvancar() {
        clicarNoElemento(btnAvancar);
        try {Thread.sleep(5000);}catch (Exception e) {}
    }
}
