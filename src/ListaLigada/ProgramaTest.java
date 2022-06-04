package ListaLigada;


public class ProgramaTest {
    public static void main(String[] args) throws Exception {
        ListaEnc<Integer> listaEnc = new ListaEnc<Integer>();
        listaEnc.incluir(8);
        listaEnc.incluir(88);
        listaEnc.incluirInicio(12);


        System.out.println(listaEnc.getPrimeiro().getDado());
    }
}
