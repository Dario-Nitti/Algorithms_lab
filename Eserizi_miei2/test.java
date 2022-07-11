package Eserizi_miei2;


public class test {
    public static void main(String []args){
        new test().run();
    }

    private void run() {

        Computer c1= new Computer("s5dryv","zzzzzz","omen",15.6,true);
        Computer c2= new Computer("vhv4bkl","acer","low",15.6,false);
        Computer c4= new Computer("zyielnfò","asus","aspire",17.1,true);
        Computer c5= new Computer("gfzdsfd","apple","macbook air",17.1,false);

        Shop shop = new Shop();
        shop.insert_computer(c1,10);
        shop.insert_computer(c2,89);
        shop.insert_computer(c4,1);
        shop.insert_computer(c5,20);
        System.out.println("inserisco");
        System.out.println(shop.elenco.values());

        shop.delete("vhv4bkl");
        System.out.println("cancello");
        System.out.println(shop.elenco);
        


    }
}
