/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amlearning;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.FileWriter;


/**
 *
 * @author elechill
 */
public class AmLearning {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
      String url = "https://www.wtamu.edu/_files/docs/academics/Institutional%20Research/FACULTY_EVAL_SUMMARY_2021FR.htm";
      String fileName = "table.csv";
      FileWriter writer = new FileWriter(fileName);
      Document doc = Jsoup.connect(url).get();
      Element tableElement = doc.select ("table").first();
      Elements tableRowElements = tableElement.select("tr:nth-child(n+3)");
      for (int i = 0; i < tableRowElements.size(); i++)
      {Element row = tableRowElements.get(i);
    
      Elements rowItems = row.select("td");
      for (int j = 0; j<rowItems.size(); j++)
      {System.out.println(rowItems.get(j).text());
      writer.append(rowItems.get(j).text());
      if (j != rowItems.size()-1)
      {writer.append (',');}
      
      
      /*storing the contents of each row in a string
     String insideRow = rowItems.get(j).text(); */
           
    Elements sixthTd = tableRowElements.select("td:nth-child(6n)"); 
    for (int k = 0; k < sixthTd.size(); k++)
    System.out.println(sixthTd.get(k).text());
    break;
    
   
   
         /*  for (int k = 0; k<rowItems.size(); k+=6)
        {System.out.println(rowItems.get(k).text());}
        } */
      
      
        
      }
      
      
    /* System.out.println(tableRowElements.size());
     Elements everySixth = tableRowElements.select("td:nth-child(6n)");
        System.out.println(everySixth); */
       
      }}}
     
    
    
        
      /* Elements pag = doc.select("tr[bgcolor='lightblue'] td");
       Elements course = doc.select ("td:contains(2021)");
       Elements numberEnrolled = doc.select ("td center");*/
    
       
       /* System.out.println(pag);
        System.out.println(course); 
        System.out.println(numberEnrolled);*/
      

