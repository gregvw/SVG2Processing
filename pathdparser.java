import java.util.*;

class PathDElement {

  char type;
  boolean isRelative;
  ArrayList<Float> values;   
  PathDElement() {
    values = new ArrayList<Float>();   
    isRelative = Character.isLowerCase(type);
  } 
  
  String toProcessing(Float xc, Float yc) {

    
    Float xo = 0.0f, yo = 0.0f;

    if(isRelative) {
      xo = xc; yo = yc;
    } 

    String processing = "";
 
    switch( Character.toLowerCase(type) ) {
      case 'a': // Arc
        break;
      case 'c': // cubic Bezier
        break;
      case 'h': // horizontal
        break;
      case 'l': // line to
        break;
      case 'm': // Pen down
        break;
      case 'q': // quadratic Bezier
       break;
      case 's': // cubic Bezier reflection
        break;
      case 't': // quadratic Bezier reflection
       break;
      case 'v': // vertical
        break;
      case 'z': // close path
        break;
      
    }   
    return processing;
  }
} // class PathDElement

class PathDParser {
  
  // Split a string describing the segments of a path into 
  void partition( String path, ArrayList<PathDElement> pathElements ) {
    String delimiters = "(?=a|c|h|l|m|q|s|t|v|z|A|C|H|L|M|Q|S|T|V|Z)";

    String[] tokens = path.split(delimiters);

    pathElements.clear();
    
    for( String t: tokens ) {
      PathDElement elem = new PathDElement();
      elem.type = t.charAt(0);

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
