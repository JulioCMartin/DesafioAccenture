package pages;

import org.openqa.selenium.By;
import utils.Dados;

public class FormularioVeiculoPage extends BasePage  {

	public final By slcMotocicleta = By.xpath("//*[@id='nav_motorcycle']");
    public final By intMarca = By.xpath("//*[@id='make']");
    public final By intModelo = By.xpath("//*[@id='model']");
    public final By intCilindro = By.xpath("//*[@id='cylindercapacity']");
    public final By intDesempenho = By.xpath("//*[@id='engineperformance']");
    public final By intData = By.xpath("//*[@id='dateofmanufacture']");
    public final By intAssentos = By.xpath("//*[@id='numberofseatsmotorcycle']");
//    public final By btnDirecaoNao = By.xpath("(//*[@class='ideal-radiocheck-label'])[2]");
//    public final By intAssentosNova = By.xpath("//*[@id='numberofseatsmotorcycle']");
//    public final By intCombustivel = By.xpath("//*[@id='fuel']");
//    public final By intPesoCarga = By.xpath("//*[@id='payload']");
//    public final By intPesoGeral = By.xpath("//*[@id='totalweight']");
    public final By intPreco = By.xpath("//*[@id='listprice']");
//    public final By intNumeroSerie= By.xpath("//*[@id='licenseplatenumber']");
    public final By intMilhaAnual = By.xpath("//*[@id='annualmileage']");
    public final By btnProximo = By.xpath("//*[@id='nextenterinsurantdata']");
    
    
    Dados dados = new Dados();
    
    // Logic
    public void preenchoAbaVeiculo() {
        inserirElemento(intMarca, dados.marca());
        try {Thread.sleep(2000);}catch (Exception e) {}
        inserirElemento(intModelo, dados.modelo());
        try {Thread.sleep(2000);}catch (Exception e) {}
        inserirElemento(intCilindro, dados.cilindro());
        try {Thread.sleep(2000);}catch (Exception e) {}
        inserirElemento(intDesempenho, dados.desempenho());
        try {Thread.sleep(2000);}catch (Exception e) {}
        inserirElemento(intData, dados.data());
        try {Thread.sleep(2000);}catch (Exception e) {}
        inserirElemento(intAssentos, dados.assentos());
        try {Thread.sleep(2000);}catch (Exception e) {}
        
//        clicarNoElemento(btnDirecaoNao);
//        try {Thread.sleep(2000);}catch (Exception e) {}
//        
//        inserirElemento(intAssentosNova, dados.assentos());
//        try {Thread.sleep(2000);}catch (Exception e) {}
//        inserirElemento(intCombustivel, dados.cubustivel());
//        try {Thread.sleep(2000);}catch (Exception e) {}
//        inserirElemento(intPesoCarga, dados.pesoCarga());
//        try {Thread.sleep(2000);}catch (Exception e) {}
//        inserirElemento(intPesoGeral, dados.pesoGeral());
//        try {Thread.sleep(2000);}catch (Exception e) {}
        inserirElemento(intPreco, dados.preco());
        try {Thread.sleep(2000);}catch (Exception e) {}
//        inserirElemento(intNumeroSerie, dados.numeroSerie());
//        try {Thread.sleep(2000);}catch (Exception e) {}
        inserirElemento(intMilhaAnual, dados.milhas());
        try {Thread.sleep(2000);}catch (Exception e) {}
    }

    public void clicoProximo() {
        clicarNoElemento(btnProximo);
        try {Thread.sleep(5000);}catch (Exception e) {}
    }


    public void clicoEmMotocicleta() {
    	  clicarNoElemento(slcMotocicleta);
          try {Thread.sleep(5000);}catch (Exception e) {}
      }

//    public void validoMensagemDeErro() {
//        elementoVisivel(vldMensagemErro);
//    }

}
