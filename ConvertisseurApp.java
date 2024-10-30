import java.util.Scanner;// importation de la classe Scanner du package java.util

/**
 * Le convertisseur de devises ou échanger de devises est un mini projet
 * qui a pour vue de devenir une potentiel application. Cette simple application 
 * fournit une interface à  l'utilisateur d'échanger/convertir de l'argent d'une 
 * devise à une autre.
 * @author Icashar (2023-01)
 */
public class ConvertisseurApp
{
    //on globalise notre scanner pour toutes les methodes static
    static Scanner input = new Scanner( System.console().reader() );
    public static void main(String[] args) 
    {
        //mesage d'acceuil
        System.out.println("Bienvenue dans le convertisseur d'argent \n");
        
        //declaration des variable de cette methode
        String ans;
        String dev;//pour la devise de l'utilisateur
        String conv;//pour la devise de converssion de l'utilisateur
        String[] cur = {"USD","EUR","CAD"};
        /*boucle do while qui permet à l"utilisateur de pouvoir relancé le convertiseur*/
        do
        {
        
        //invite de commade
        System.out.println("veuillez choisir la monnai à convertir\n");
        System.out.print("[USD,EUR ou CAD]\nentrée votre devise-->");
        dev=input.nextLine();// va saisir la devise primaire de l'itulisateur

        System.out.print("\nUSD,EUR ou CAD\nveuillez choisir la devise de conversion-->");
        conv=input.nextLine();//Va saisir la devise dans la quelle on veut convertir
        
        /*Une serie de selection qui verifier le choix de l'utilisateur et le redirecte 
         * celui-ci vers quelle methode va faire le calcul de la convertion*/

        //1.dollar americain en euro
        if(dev.equalsIgnoreCase(cur[0])&& conv.equalsIgnoreCase(cur[1]))
        {
            usdToeur();
        }
        //2.dollar americain en dollar canadiens 
        else if(dev.equalsIgnoreCase(cur[0])&& conv.equalsIgnoreCase(cur[2]))
        {
            usdtocad();
        }
        //3.euro en dollar americain
        else if(dev.equalsIgnoreCase(cur[1])&& conv.equalsIgnoreCase(cur[0]))
        {
            eurtousd();
        }
        //4.euro en dollar canadien  
        else if(dev.equalsIgnoreCase(cur[1])&& conv.equalsIgnoreCase(cur[2]))
        {
            eurtocad();
        }
        //5.dollar canadien en dollar americain 
        else if(dev.equalsIgnoreCase(cur[2])&& conv.equalsIgnoreCase(cur[0]))
        {
            cadtousd();
        }
        //6.dollar canadien en euro
        else if(dev.equalsIgnoreCase(cur[2])&& conv.equalsIgnoreCase(cur[1]))
        {
            cadtoeur();
        }
        //7.si les joueurs ne remplis pas les conditions demandés
        else 
        {
            System.out.println("\nVous pouvez seulement choisir entre [USD,EUR ou CAD] ");
        }

        System.out.println("\nvoulez vous convertir autre choses?");
        System.out.println("oui ou non");
        ans=input.nextLine();    
        //condition qui permet a l'itulisateur de continue a convertir. 
        }while(ans.equalsIgnoreCase("oui"));
       
        /*message qui s'affiche si l'itulisateur decide de quitter
         ou entre tout sauf une valeur qui est pas oui.*/
        System.out.println("Merci à la prochaine");
    }
    /**Une méthode qui convertie et a fiche des messages à l'utilisateur. 
     * Cette méthode utilise des parametre different et unique venant de 
     * la méthode specifique où elle a été appellée.
     */
    public static double convert( String from, String to, double facteur ) 
    {
        double start = -1; // initialiser à une valeur inacceptable
        double end =0;  
        while (start < 0) 
        {
            System.out.print("\nentrez le montant en " + from + "-->");
            //une imbriquation qui verifier les reponses de l'itulisateur.
            if (input.hasNextDouble())//verifier si l'éntrée est un nombre
            {
                start= input.nextDouble();//prend la valeur donné par l'itulisateur
                input.nextLine();
                if(start>=0 )//verifier si l'entrée est un nombre positif
                {   //fait le calcul et arrondie "end" de deux decimaux 
                    end=Math.round((start * facteur)*100)/100D;
                    System.out.println(start+" "+ from + " vous donne->"+" "+ end +" "+to );
                }
                else 
                {
                    System.out.println("Reponse invalide (valeur négative)");
                    input.nextLine();
                }
            }
            else 
            {
                System.out.println("Reponse invalide (pas un nombre ou utilisation de la mauvaise virgule)");

                input.nextLine();/*ignore la reponse faite precedement et offre une autre chance de fournir 
                une nouvelle reponse */
                
            } 
        } return end;//la methode ne se termine pas tant qu'on a pas de valeur end adéquat.
    }
 
    /**convertiseur de dollar en euro*/
    public static void usdToeur() 
    {
        /*appelle la methode convert(); avec les parametrès
         * nécessaire pour convertir des dollar americain en euro.
        */
        convert("usd", "eur", 0.94);
    }

    /** convertisseur de dollar americain en dollar canadien */
    public static void usdtocad() 
    {    
        /*appelle la methode convert(); avec les parametrès
        * nécessaire pour convertir des dollars americain en 
        dollars canadien.
        */
        convert("usd", "cad", 1.36);

    }
    /**convertiseur d'euro en dollar americain*/
    public static void eurtousd() 
    {   
        /*appelle la methode convert(); avec les parametrès
        * nécessaire pour convertir des euros en 
        dollars americain.
        */  
        convert("eur", "usd", 1.07);
        
    }
     /**convertiseur d'euro en dollar canadien*/
    public static void eurtocad() 
    {   
        /*appelle la methode convert(); avec les parametrès
        * nécessaire pour convertir des euros en 
        dollars canadien.
        */  
        convert("eur", "cad", 1.44);
    }
    /**convertiseur de dollar canadiens en euro*/
    public static void cadtousd() 
    {   
        /*appelle la methode convert(); avec les parametrès
        * nécessaire pour convertir des dollar canadien en 
        dollars americains.
        */  
        convert("cad", "usd", 0.74);     
    }
    /**convertiseur de dollar canadiens en euro*/
    public static void cadtoeur() 
    {   
        /*appelle la methode convert(); avec les parametrès
        * nécessaire pour convertir des dollar americains en euros.
        */  
        convert("cad", "eur", 0.69);    
    }

}