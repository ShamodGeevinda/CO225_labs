public class Test{
    public static void main(String args[]){
        
        Agency agency = new Agency();

        Channel c1 = new Channel("Sirasa");
        Channel c2 = new Channel("Derana");
        Channel c3 = new Channel("ITN");

        agency.register(c1);
        agency.register(c2);
        agency.register(c3);

        c1.addTypes("Sport");
        c1.addTypes("Local");
        c2.addTypes("Local");
        c1.addTypes("Foreign");
        c2.addTypes("Foreign");
        c3.addTypes("Foreign");


        c1.registeredAgency(agency);
        c2.registeredAgency(agency);
        c3.registeredAgency(agency);

        agency.updateNews("SL vs IND Day 1 Stumps", " India put up 357/6 on the back of knocks from Rishabh Pant (96), Hanuma Vihari (58) and Virat Kohli (45). Pant came agonisingly close to a hundred, but was not meant to be.", "Sport");
        agency.updateNews("Scheduled power cuts could differ","As the government assured to minimize power cuts from today, the scheduled power cuts may not take place or reduced depending on the availability of fuel, the Public Utilities Commission of Sri Lanka (PUCSL) Chairman Janaka Ratnaka Rathnayaka said.","Local");
        agency.updateNews("Russia's capture of Europe's largest nuclear plant in Ukraine raises global alarm","Ukraine's state nuclear plant operator said that three Ukrainian soldiers were killed and two were wounded in the attack. Rafael Mariano Grossi, director general of the International Atomic Energy Agency (IAEA), said two people were injured in the blaze that broke out.","Foreign");

        agency.unRegister(c3);
        System.out.println("");
        System.out.println("*********************************");
        System.out.println("ITN unregistered. Therefore no news for ITN");
        System.out.println("");

        agency.updateNews("Gas prices continue to hit new records. Here’s how to save at the pump","The retail price of regular gas surpassed the $2 per litre mark in many parts of Metro Vancouver Friday, with the Canadian Automobile Association (CAA) putting averages for Toronto at $1.67 per litre, for Montreal at $1.84 per litre and St. John's, N.L., at $1.77 per litre.","Foreign");

    
        c2.removeTypes("Local");
        System.out.println("");
        System.out.println("*********************************");
        System.out.println("No local news for  Derana");
        System.out.println("");

        agency.updateNews("Labour Minister proposes to cabinet to pay at least Rs. 240 per dollar","A request will be submitted to the next cabinet meeting requesting to pay at least Rs.240 per dollar for remittances sent to Sri Lanka by foreign workers, Labour Minister Nimal Siripala de Silva said. In the Sinhala-Hindu New Year, many Sri Lankan foreign workers used to send more money for their families for their expenses.","Local");
    
    }
}