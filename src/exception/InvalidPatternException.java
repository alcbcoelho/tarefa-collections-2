package exception;

public class InvalidPatternException extends RuntimeException {
    public InvalidPatternException() {
        super("ERRO: Dados inseridos não correspondem ao padrão solicitado");
    }
}
