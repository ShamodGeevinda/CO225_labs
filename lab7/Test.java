public class Test{
    public static void main(String args[]){
        Agency agency = new Agency();

        Channel c1 = new Channel("Sirasa");
        Channel c2 = new Channel("Derana");
        Channel c3 = new Channel("ITN");

        agency.register(c1);
        agency.register(c2);
        agency.register(c3);

        c1.registeredAgency(agency);
        c1.registeredAgency(agency);
        c1.registeredAgency(agency);

        agency.updateNews("new news");

    }
}