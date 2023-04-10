public class TestCryptoMarche {
    public static void main(String[] args) {

        //Creation de crypto-monnaie
        Cryptomonnaie bitcoin  = new Cryptomonnaie("btc", 50000);
        Cryptomonnaie ethereum = new Cryptomonnaie("eth", 2000);

        //Creation de portefeuilles
        Portefeuille antoineBtc = new Portefeuille(bitcoin,  10, "Antoine");
        Portefeuille antoineEth = new Portefeuille(ethereum, 10, "Antoine");
        Portefeuille aliceBtc   = new Portefeuille(bitcoin,   5, "Alice"  );

        //Creation du marché
        CryptoMarche marche = CryptoMarche.getInstance();
        marche.ajouter(antoineBtc);
        marche.ajouter(antoineEth);
        marche.ajouter(aliceBtc);

        //Transfert des monnaies entre portefeuilles
        aliceBtc.transfertDevise(antoineBtc, 2);
        aliceBtc.transfertDevise(antoineBtc, 10); 
        aliceBtc.transfertDevise(antoineEth, 1); 

        //Test Portefeuille
        System.out.print("Test Portefeuille transfertDevise \t ...");
        if (antoineBtc.getMontant() == 12 && aliceBtc.getMontant() == 3)
            System.out.println(" OK");
        else
            System.out.println(" FAIL");
        
        //Achats des monnaies 
        aliceBtc.achatDevise(25000);
        antoineBtc.achatDevise(-200000);
        
        System.out.print("Test Portefeuille achatDevise    \t ...");
        if (antoineBtc.getMontant() == 12 && aliceBtc.getMontant() == 3.5)
            System.out.println(" OK");
        else
            System.out.println(" FAIL");

        //Test Marche 
        //Test capitalEnEuros
        double capitalAntoine = marche.capitalEnEuros("Antoine");
        double capitalAlice   = marche.capitalEnEuros("Alice");
        
        System.out.print("Test CryptoMarche capitalEnEuros \t ...");
        if (capitalAntoine == 620000 && capitalAlice == 175000)
            System.out.println(" OK");
        else
            System.out.println(" FAIL");

        //Test capitalMonnaie
        double capitalBtc = marche.capitalMonneaie(bitcoin);
        double capitalEth = marche.capitalMonneaie(ethereum);

        System.out.print("Test CryptoMarche capitalMonneaie \t ...");
        if (capitalBtc == 775000 && capitalEth == 20000)
            System.out.println(" OK");
        else
            System.out.println(" FAIL");

    }
}
