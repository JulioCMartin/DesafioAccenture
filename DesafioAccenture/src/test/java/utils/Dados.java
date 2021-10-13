package utils;

import org.openqa.selenium.WebDriver;

public class Dados extends webDriver.WebDriver {
	public static WebDriver driver;

	// Dados Veiculo
	
	public String marca() {String MARCA = "BMW";
		return MARCA;}
	public String modelo() {String MODELO = "Motorcycle";
		return MODELO;}
	public String cilindro() {String CILINDRO = "999";
		return CILINDRO;}
	public String desempenho() {String DESEMPENHO = "199";
		return DESEMPENHO;}
	public String data() {String DATA = "10/08/2019";
		return DATA;}
	public String assentos() {String ASSENTOS = "2";
		return ASSENTOS;}
	public String cubustivel() {String CUBUSTIVEL = "Petrol";
		return CUBUSTIVEL;}
	public String pesoCarga() {String PESOCARGA = "203";
		return PESOCARGA;}
	public String pesoGeral() {String PESOGERAL = "407";
		return PESOGERAL;}
	public String preco() {String PRECODEFABRICA = "85125.67";
		return PRECODEFABRICA;}
	public String numeroSerie() {String SERIENUMBER = "**********";
		return SERIENUMBER;}
	public String milhas() {String MILHASANO = "40000";
		return MILHASANO;}
	
	// Dados Pessoal

	public String nome() {String NOME = "Miguel";
		return NOME;}
	public String sobrenome() {String SOBRENOME = "Silva";
		return SOBRENOME;}
	public String dataNacimento() {String ANIVERSARIO = "01/02/1978";
		return ANIVERSARIO;}
	public String endereco() {String ENDERECO = "Rua Aleatoria";
		return ENDERECO;}
	public String pais() {String PAIS = "Brasil";
		return PAIS;}
	public String codigoPostal() {String CODIGOPOSTAL = "07891356";
		return CODIGOPOSTAL;}
	public String cidade() {String CIDADE = "S�o Paulo";
		return CIDADE;}
	public String ocupacao() {String OCUPACAO = "Empregado";
		return OCUPACAO;}
	
	// Seguro
	
	public String dataInicio() {String OCUPACAO = "10/01/2022";
	return OCUPACAO;}
	public String somaSeguro() {String OCUPACAO = " 3.000.000,00";
	return OCUPACAO;}
	public String coberturaSeguro() {String OCUPACAO = "Full Coverage";
	return OCUPACAO;}
	
	// dados E-mail
	
	public String email() {String EMAIL = "test@test.com";
	return EMAIL;}
	public String usuario() {String USUARIO = "teste123";
	return USUARIO;}
	public String senha() {String SENHA = "Batata123";
	return SENHA;}
	public String confirmaSenha() {String CONFIRMA = "Batata123";
	return CONFIRMA;}
	public String comentario() {String COMENTARIO = "Isso é um teste ";
	return COMENTARIO;}
}
