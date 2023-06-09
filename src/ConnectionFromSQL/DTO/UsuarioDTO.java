package ConnectionFromSQL.DTO;

public class UsuarioDTO {

    public int id_agencia;
    public int id_conta;
    public String id_senha;
    public String id_CPF;
    public String id_nome;
    public String id_email;
    public float id_saldo;
    public float id_investimento;
    public float id_InvestTotal;
    public float id_valorTransTED;
    public float id_valorTransPix;
    public String id_cpfDestinatario;
    public int id_contaDestinatario;
    public int id_agenciaDestinatario;
    public String id_tipoPix = "PIX";
    public String id_TipoTD = "TED/DOC";
    public String id_CadastCPF;
    public String id_CadastSenha;
    public String id_CadastNome;
    public int id_CadastAgencia;
    public int id_CadastConta;
    public String id_CadastEmail;
    public int idade;
    
    
    
    /////////////////////////////////
    
    public float getId_saldo() {
        return id_saldo;
    }

    public void setId_saldo(float id_saldo) {
        this.id_saldo = id_saldo;
    }
    
    public int getId_agencia() {
        return id_agencia;
    }

    public void setId_agencia(int id_agencia) {
        this.id_agencia = id_agencia;
    }

    public int getId_conta() {
        return id_conta;
    }

    public void setId_conta(int id_conta) {
        this.id_conta = id_conta;
    }
    
    public String getId_nome() {
        return id_nome;
    }

    public void setId_nome(String id_nome) {
        this.id_nome = id_nome;
    }

    public String getId_email() {
        return id_email;
    }

    public void setId_email(String id_email) {
        this.id_email = id_email;
    }

    public String getId_senha() {
        return id_senha;
    }

    public void setId_senha(String id_senha) {
        this.id_senha = id_senha;
    }

    public String getId_CPF() {
        return id_CPF;
    }

    public void setId_CPF(String id_CPF) {
        this.id_CPF = id_CPF;
    }
    
    public float getId_investimento() {
        return id_investimento;
    }

    public void setId_investimento(float id_investimento) {
        this.id_investimento = id_investimento;
    }

    /**
     * @return the id_InvestTotal
     */
    public float getId_InvestTotal() {
        return id_InvestTotal;
    }

    /**
     * @param id_InvestTotal the id_InvestTotal to set
     */
    public void setId_InvestTotal(float id_InvestTotal) {
        this.id_InvestTotal = id_InvestTotal;
    }
        
    /**
     * @return the id_valorTransTED
     */
    public float getId_valorTransTED() {
        return id_valorTransTED;
    }

    /**
     * @param id_valorTransTED the id_valorTransTED to set
     */
    public void setId_valorTransTED(float id_valorTransTED) {
        this.id_valorTransTED = id_valorTransTED;
    }

    /**
     * @return the id_cpfDestinatario
     */
    public String getId_cpfDestinatario() {
        return id_cpfDestinatario;
    }

    /**
     * @param id_cpfDestinatario the id_cpfDestinatario to set
     */
    public void setId_cpfDestinatario(String id_cpfDestinatario) {
        this.id_cpfDestinatario = id_cpfDestinatario;
    }

    /**
     * @return the id_valorTransPix
     */
    public float getId_valorTransPix() {
        return id_valorTransPix;
    }

    /**
     * @param id_valorTransPix the id_valorTransPix to set
     */
    public void setId_valorTransPix(float id_valorTransPix) {
        this.id_valorTransPix = id_valorTransPix;
    }

    /**
     * @return the id_contaDestinatario
     */
    public int getId_contaDestinatario() {
        return id_contaDestinatario;
    }

    /**
     * @param id_contaDestinatario the id_contaDestinatario to set
     */
    public void setId_contaDestinatario(int id_contaDestinatario) {
        this.id_contaDestinatario = id_contaDestinatario;
    }

    /**
     * @return the id_agenciaDestinatario
     */
    public int getId_agenciaDestinatario() {
        return id_agenciaDestinatario;
    }

    /**
     * @param id_agenciaDestinatario the id_agenciaDestinatario to set
     */
    public void setId_agenciaDestinatario(int id_agenciaDestinatario) {
        this.id_agenciaDestinatario = id_agenciaDestinatario;
    }

    /**
     * @return the id_tipoPix
     */
    public String getId_tipoPix() {
        return id_tipoPix;
    }

    /**
     * @return the id_TipoTD
     */
    public String getId_TipoTD() {
        return id_TipoTD;
    }

    /**
     * @return the id_CadastCPF
     */
    public String getId_CadastCPF() {
        return id_CadastCPF;
    }

    /**
     * @param id_CadastCPF the id_CadastCPF to set
     */
    public void setId_CadastCPF(String id_CadastCPF) {
        this.id_CadastCPF = id_CadastCPF;
    }

    /**
     * @return the id_CadastSenha
     */
    public String getId_CadastSenha() {
        return id_CadastSenha;
    }

    /**
     * @param id_CadastSenha the id_CadastSenha to set
     */
    public void setId_CadastSenha(String id_CadastSenha) {
        this.id_CadastSenha = id_CadastSenha;
    }

    /**
     * @return the id_CadastNome
     */
    public String getId_CadastNome() {
        return id_CadastNome;
    }

    /**
     * @param id_CadastNome the id_CadastNome to set
     */
    public void setId_CadastNome(String id_CadastNome) {
        this.id_CadastNome = id_CadastNome;
    }

    /**
     * @return the id_CadastAgencia
     */
    public int getId_CadastAgencia() {
        return id_CadastAgencia;
    }

    /**
     * @param id_CadastAgencia the id_CadastAgencia to set
     */
    public void setId_CadastAgencia(int id_CadastAgencia) {
        this.id_CadastAgencia = id_CadastAgencia;
    }

    /**
     * @return the id_CadastConta
     */
    public int getId_CadastConta() {
        return id_CadastConta;
    }

    /**
     * @param id_CadastConta the id_CadastConta to set
     */
    public void setId_CadastConta(int id_CadastConta) {
        this.id_CadastConta = id_CadastConta;
    }

    /**
     * @return the id_CadastEmail
     */
    public String getId_CadastEmail() {
        return id_CadastEmail;
    }

    /**
     * @param id_CadastEmail the id_CadastEmail to set
     */
    public void setId_CadastEmail(String id_CadastEmail) {
        this.id_CadastEmail = id_CadastEmail;
    }
    
    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

}

