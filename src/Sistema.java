public class Sistema {
    public static void run() {
        Membros membro1 = new BigBrother("spiderman@gamil.com", "SpiderMan", EnumFuncoes.BigBrothers);
        Membros membro2 = new HeavyLift("IronMan@gamil.com", "IronMan", EnumFuncoes.HeavyLifters);
        Membros membro3 = new ScriptGuys("DoctorStrange@gamil.com", "DoctorStrange", EnumFuncoes.ScriptGuys);
        Membros membro4 = new MobileMembers("CaptainAmerica@gamil.com", "CaptainAmerica", EnumFuncoes.MobileMembers);

        System.out.println(membro1);
        System.out.println(membro2);
        System.out.println(membro3);
        System.out.println(membro4);

        
    }
}