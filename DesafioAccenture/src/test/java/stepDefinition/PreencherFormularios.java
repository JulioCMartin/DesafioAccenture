package stepDefinition;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.FormularioPessoalPage;
import pages.FormularioSeguroPage;
import pages.FormularioVeiculoPage;
import pages.PreencherEmailPage;
import utils.Dados;
import utils.Url;

public class PreencherFormularios {
	Dados dados = new Dados();
	Url site = new Url();
	FormularioVeiculoPage veiculo = new FormularioVeiculoPage();
	FormularioPessoalPage pessoal = new FormularioPessoalPage();
	FormularioSeguroPage seguro = new FormularioSeguroPage();
	PreencherEmailPage email = new PreencherEmailPage();
	
	@Dado("^que estou no site$")
	public void queEstouNoSite() {
		site.loginUrl();
		veiculo.clicoEmMotocicleta();
	}

	@Quando("^preencho todos os formularios$")
	public void preenchoTodosOsFormularios() {
		veiculo.preenchoAbaVeiculo();
		veiculo.clicoProximo();
		pessoal.preenchoAbaPessoal();
		pessoal.clicoProximo();
		seguro.preenchoAbaSeguro();
		seguro.clicoProximo();
		seguro.selecionoPlano();
		seguro.clicoAvancar();
	}

	@Quando("^envio para email$")
	public void envioParaEmail() {
		email.preenchoAbaEmail();
		email.clicoEnviarEmail();
	}

	@Entao("^valido mensagem enviada com sucesso$")
	public void validoMensagemEnviadaComSucesso() {
		email.validoMensagemEnviadoComSucesso();
		System.out.println("Formulario Preenchido com Sucesso: PASSED");
	}
}
