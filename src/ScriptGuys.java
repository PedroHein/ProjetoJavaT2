public class ScriptGuys extends Membros {

    public ScriptGuys(String email, String nome, EnumFuncoes funcao) {
        super(email, nome, funcao);
    }
    
    @Override
    public void apresentar() {
        System.out.println(toString());   
    }

    @Override
    public void mensagem(EnumHorarios horario) {
        switch (horario) {
            default:
                break;
            case REGULAR:
                System.out.println("Prazer em ajudar novos amigos de código!");
                break;
            case EXTRA:
                System.out.println("QU3Ro_S3us_r3curs0s.py");
                break;
        } 
    }
}
