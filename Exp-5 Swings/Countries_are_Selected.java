/*
5c. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
display the capital of the countries on console whenever the countries are selected on the list.
*/
package Lab5;

import java.awt.BorderLayout;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Countries_are_Selected {
	JFrame frame;
    JList<String> countryList;
    HashMap<String, String> capitalMap;

    Countries_are_Selected() {
      
  frame = new JFrame("Country and Capital Finder");
  frame.setSize(400, 300);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


  String[] countries = {
        "USA", "India", "Vietnam", "Canada",
         "Denmark", "France", "Great Britain",
         "Japan", "Africa", "Greenland", "Singapore"
        };

   countryList = new JList<>(countries);
   countryList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
   JScrollPane scrollPane = new JScrollPane(countryList);
   capitalMap = new HashMap<>();
   capitalMap.put("USA", "Washington D.C.");
   capitalMap.put("India", "New Delhi");
   capitalMap.put("Vietnam", "Hanoi");
   capitalMap.put("Canada", "Ottawa");
   capitalMap.put("Denmark", "Copenhagen");
   capitalMap.put("France", "Paris");
   capitalMap.put("Great Britain", "London");
   capitalMap.put("Japan", "Tokyo");
   capitalMap.put("Africa", "Addis Ababa");
   capitalMap.put("Greenland", "Nuuk");
   capitalMap.put("Singapore", "Singapore");
   countryList.addListSelectionListener(new ListSelectionListener() {
     @Override
      public void valueChanged(ListSelectionEvent e) {
          if (!e.getValueIsAdjusting()) {
               String selectedCountry = countryList.getSelectedValue();
               String capital = capitalMap.get(selectedCountry);
                   if (capital != null) {
                        System.out.println("Capital of " + selectedCountry + " is: " + capital);
                    } else {
                        System.out.println("Capital of " + selectedCountry + " is unknown.");
                    }
                }
            }
        });
   frame.setLayout(new BorderLayout());
   frame.add(new JLabel("Select a country:"), BorderLayout.NORTH);
   frame.add(scrollPane, BorderLayout.CENTER);

   frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Countries_are_Selected();
    }
}

