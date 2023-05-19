public class MobileMembers extends Membros {

    public MobileMembers(String email, String nome, EnumFuncoes funcao) {
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
                System.out.println("HappyCoding!");
                break;
            case EXTRA:
                System.out.println("MAsK_S0c13ty");
                break;
        }    
    }
}
