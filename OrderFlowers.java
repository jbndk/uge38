import java.util.Scanner;
class OrderFlowers {
  public static void main(String[] args) {
    String order = orderFlowers();
    System.out.println(order);
    /*
     * FORMÅL:
     * bruge String-format metoden til at tildele en variabel en kompleks
     * værdi af sammensatte dele som returneres til main. 
     *
     * OPGAVE:
     * Lav en metode orderFlowers som indeholder en række spørgsmål til en 
     * bruger om hvilken buket han/hun vil bestille:
     * hvilke blomster skal indgå, hvad må den koste, skal den leveres, skal der grønt med
     * Hvis der svares Ja til levering skal der spørges til navn og adresse
     * Ja/Nej svaret til om der skal grønt med skal sættes sammen som  det ses i testresultatet
     * Alle variabler samles i én streng-variabel der returneres til main hvor hvert svar
     * er adskilt af en såkaldt delimiter - i dette tilfælde et semikolon
     
     * TESTKØRSEL: hvor den første er med Ja til levering
     * roser,tulipaner;Ja til grønt;345;Otto Verner;Gyden 12;4500 Odense
     * roser,tulipaner;Nej til grønt;150;
     *

*/
  }
  public static String orderFlowers() {
    Scanner myScan = new Scanner(System.in);
    String flowerOrder = "";
    String flowerOrderAdress = "";

    System.out.println("Hvilke blomster skal indgå? Adskil med komma - feks roser,tulipaner");
    // TODO: resten af brugerdialogen
    flowerOrder += flowerOrderAdress;
    return flowerOrder;
  }
}

