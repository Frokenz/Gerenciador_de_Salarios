package entidades;

public class Funcionarios {
int IdFuncionario;
int IdCargo;
String nome;
String sobrenome;
int CPF;
String Contato;
// ei, te amo

public int getIdFuncionario() {
	return IdFuncionario;
}
public void setIdFuncionario(int idFuncionario) {
	IdFuncionario = idFuncionario;
}
public int getIdCargo() {
	return IdCargo;
}
public void setIdCargo(int idCargo) {
	IdCargo = idCargo;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getSobrenome() {
	return sobrenome;
}
public void setSobrenome(String sobrenome) {
	this.sobrenome = sobrenome;
}
public int getCPF() {
	return CPF;
}
public void setCPF(int cPF) {
	CPF = cPF;
}
public String getContato() {
	return Contato;
}
public void setContato(String contato) {
	Contato = contato;
}


}
