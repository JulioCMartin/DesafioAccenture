package pages;

import org.openqa.selenium.By;
import utils.Dados;

public class PreencherEmailPage extends BasePage  {

    public final By intEmail = By.xpath("//*[@id='email']");
    public final By intUsuario = By.xpath("//*[@id='username']");
    public final By intSenha = By.xpath("//*[@id='password']");
    public final By intSenhaConfimar = By.xpath("//*[@id='confirmpassword']");
    public final By intComentario = By.xpath("//*[@id='Comments']");
    
    public final By btnEnviar = By.xpath("//*[@id='sendemail']");
    
    public final By vldMensagem = By.xpath("//*[@class='sweet-alert showSweetAlert visible']");
    public final By btnOk = By.xpath("//*[@class='confirm']");
    Dados dados = new Dados();
    
    // Logic
    public void preenchoAbaEmail() {
        inserirElemento(intEmail, dados.email());
        try {Thread.sleep(2000);}catch (Exception e) {}
        inserirElemento(intUsuario, dados.usuario());
        try {Thread.sleep(2000);}catch (Exception e) {}
        inserirElemento(intSenha, dados.senha());
        try {Thread.sleep(2000);}catch (Exception e) {}
        inserirElemento(intSenhaConfimar, dados.confirmaSenha());
        try {Thread.sleep(2000);}catch (Exception e) {}
        inserirElemento(intComentario, dados.comentario());
        try {Thread.sleep(2000);}catch (Exception e) {}
        
    }

    public void clicoEnviarEmail() {
        clicarNoElemento(btnEnviar);
        try {Thread.sleep(5000);}catch (Exception e) {}
    }

   
    public void validoMensagemEnviadoComSucesso() {
    	elementoVisivel(vldMensagem);
        try {Thread.sleep(5000);}catch (Exception e) {}
//        clicarNoElemento(btnOk);
//        try {Thread.sleep(5000);}catch (Exception e) {}
    }
}
