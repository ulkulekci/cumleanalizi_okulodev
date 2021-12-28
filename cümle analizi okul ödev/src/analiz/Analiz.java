/*
ülkü külekçi i.ö
20120855049
*/
package analiz;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class Analiz {

    public static void main(String[] args) {
        
   System.out.println();  
     JOptionPane.showMessageDialog(null, "Girmis oldugnuz metinin cümle kelime ve sesiz harflerini veren programa hos geldiniz");
     String input=JOptionPane.showInputDialog(null, "cümlenizi giriniz");
     System.out.println("girmiş olduğunuz cümle   : "+input);
     String buyuk=input.toUpperCase();
     char input_cumle[]=input.toCharArray();
     int cumle_sayisi=0;
     int k=0,d=0,cumle_kelime=0; 
     int cumnle_sessiz_harf=0;
     int f;
     char [] ters=new char[input.length()];
     int sayac=0;
     for(int i=input.length()-1;i>=0;i--)
     {
    	 ters[sayac]=input.charAt(i);
    	 sayac++;
     }
     String terstenYaz=new String(ters);
     JOptionPane.showMessageDialog(null, "Girmis oldugunu metinin tersten yazilisi => "+terstenYaz);
     char sessiz_harfler []={'b','c','ç','d','f','g','ğ','h','j','k','l','m','n','p','r','s','ş','t','v','y','z','B','C','Ç','D','F','G','Ğ','H','J','K','L','M','N','P','R','S','Ş','T','V','Y','Z'};
       
          for(int i=1;i<input.length();i++)
          {
                   if(input_cumle[i]=='.'){
                                 cumle_sayisi++;
                                if(i+1<input.length())       
                                if(input_cumle[i+1]=='.')cumle_sayisi--;
  
                                          }        
                   if(i+1==input.length()){                
                                 if(input_cumle[i]!='.')
                                  cumle_sayisi++;
                                         }
          }
      


         for(int i=0;i<input.length();i++)
         {
                   if(input_cumle[i]!=' ' && input_cumle[i]!='.')
                        {
                             if(k!=1)
                                   cumle_kelime++;
                             if(i+1<input.length())
                             {
                                  if(input_cumle[i+1]!=' ' && input_cumle[i+1]!='.')k=1;
                                  if(input_cumle[i+1]==' ' || input_cumle[i+1]=='.')k=0;
                              }
           
                         }
         }
      
      
         for(int j=0;j<input.length();j++)  
         {    
                   for(f=0;f<42;f++)
                        if(input_cumle[j]==sessiz_harfler[f])
                        cumnle_sessiz_harf++;      
         }
       
         JOptionPane.showMessageDialog(null, "Girmis oldugunu metindeki cümle sayisi =>  "+cumle_sayisi);
         JOptionPane.showMessageDialog(null, "Girmis oldugunu metindeki kelime sayisi =>  "+cumle_kelime);
         JOptionPane.showMessageDialog(null, "Girmis oldugunu metnin buyuk harflerle yazilisi =>  "+buyuk);
         JOptionPane.showMessageDialog(null, "Girmis oldugunu metindeki sessiz harf sayisi =>  "+cumnle_sessiz_harf);
    
    }
}