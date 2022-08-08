import br.com.jokenpo.Jokenpo;
import br.com.jokenpo.JokenpoEnum;
import br.com.jokenpo.ResultadoJokenpoEnum;

public class MainApplication {


    public static void main(String[] args) {
        ResultadoJokenpoEnum resultadoJokenpoEnum = Jokenpo.play(JokenpoEnum.PEDRA, JokenpoEnum.PEDRA);
        System.out.println(resultadoJokenpoEnum);
    }
}
