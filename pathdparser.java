import java.util.*;

class PathDElement {
  char type;
  ArrayList<Float> values;   
  PathDElement() {
    values = new ArrayList<Float>();   
  }
}

class PathDParser {
  
  // Split a string describing the segments of a path into 
  void partition( String path, ArrayList<PathDElement> pathElements ) {
    String delimiters = "(?=m|l|c|v|h|q|z|M|L|C|V|H|Q|Z)";
    String[] tokens = path.split(delimiters);

    pathElements.clear();
    
    for( String t: tokens ) {
      PathDElement elem = new PathDElement();
      elem.type = t.charAt(0);

      boolean isRelative = Character.isLowerCase(elem.type);

      // Split
      String[] values = t.substring(1).replaceAll("^[,\\s]+", "").split("[,\\s]+");
      ArrayList<String> stringValues = new ArrayList<String>(Arrays.asList(values));
      System.out.println(elem.type); 
      for( String s: stringValues ) {
        System.out.println(s);
        elem.values.add(Float.parseFloat(s));
      }
      System.out.println("size = " + elem.values.size());

    }
    
  }
  
} // class PathDParser
