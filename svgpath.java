import java.util.StringTokenizer;

class SVGPath {

  String id;            // Name of path 
  String d;             // Sequence of curves
  String fill;          // How to fill the path
  String strokeColor;   // Color of the stroke
  String strokeWidth;   // Width of the stroke
  
  public SVGPath(String pathString) {
    id = ""; d = ""; fill = ""; strokeColor = ""; strokeWidth = "";
    
    // Get id
    if(pathString.contains(" id")) {
      id = pathString.split(" id")[1].split("\"")[1];
    }
    
    // get trajectory 
    if(pathString.contains(" d")) {
      d = pathString.split(" d")[1].split("\"")[1];
    }
    
    // get fill 
    if(pathString.contains(" fill")) {
      fill = pathString.split(" fill")[1].split("\"")[1];
    }

    // get stroke color 
    if(pathString.contains(" stroke")) {
      strokeColor = pathString.split(" stroke")[1].split("\"")[1];
    }

    // get stroke width 
    if(pathString.contains(" stroke-width")) {
      strokeWidth = pathString.split(" stroke-width")[1].split("\"")[1];
    }

    
  }
  
} // class SVGPath