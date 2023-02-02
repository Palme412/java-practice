public class Continents {

    //print out a continent and the largest city in the continent
    
      public static void main(String[] args){
        int continent = 4;
        String continentString;
        switch (continent) {
          case 1: continentString = "North America: Mexico City, Mexico";
                  break;
          case 2: continentString = "South America: Sao Paulo, Brazil";
                  break;
          case 3: continentString = "Europe: Moscow, Russia";
                  break;
          case 4: continentString = "Africa: Lagos, Nigeria";
                  break;
          case 5: continentString = "Asia: Shanghai, China";
                  break;
          case 6: continentString = "Australia: Sydney, Australia";
                  break;
          case 7: continentString = "Antarctica: McMurdo Station, US";
                  break;       
          default: continentString = "Undefined continent!";
                  break;
        }
        System.out.println(continentString);
    
      }
    }